package cn.net.realloyal.action;

import java.sql.Time;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import cn.net.realloyal.core.util.BackJsonUtil;
import cn.net.realloyal.core.util.CheckUtil;
import cn.net.realloyal.core.util.chaphcha.IndustrySMS;
import cn.net.realloyal.model.LanguageType;
import cn.net.realloyal.model.User;
import cn.net.realloyal.service.UserService;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/user")
public class UserAction {

	@Autowired
	UserService userService;
	
	HttpSession session;
	
	//初始化登录界面——若存在session则直接登录
	@RequestMapping("/init")
	public String startInit(HttpServletRequest request) {
		session = request.getSession(true);
		if(session.getAttribute("user")==null){
			return "common/login";
		}else {
			return "forward:toindex";
		}
		
	}

	//登录请求处理
	@ResponseBody
	@RequestMapping("/login")
	public BackJsonUtil checkLogin(String userPhoneNumber,String userPassword) throws Exception {
		User user = userService.checkLogin(userPhoneNumber, userPassword);
		BackJsonUtil back = new BackJsonUtil();
		if(user!=null) {
			session.setAttribute("user",user);
			back.setStatus(true);
			back.setInfo("恭喜您,登陆成功");
		}else {
			back.setStatus(false);
			back.setInfo("您的用户名或密码有误,请重新输入!");
		}
		return back;
	}
	
	//跳转首页
	@RequestMapping("/toindex")
	public ModelAndView toIndex() {
		ModelAndView mv = new ModelAndView();
		User user = (User) session.getAttribute("user");
		if(user.getUserPermission()==1) {
			mv.addObject("admin",user);
			mv.addObject("pageName","indexPage");
			mv.setViewName("admin/index");
		}else {
			mv.addObject("user",user);
			mv.setViewName("user/index");
		}
		return mv;
	}
	
	//跳转注册界面
	@RequestMapping("/toregister")
	public String toRegister() {
		return "user/register";
	}
	
	//用户注册
	@ResponseBody
	@RequestMapping("/register")
	public BackJsonUtil checkRegister(String userName,String userSex,String userPhoneNumber,String chaphcha,String userPassword,@RequestParam(required=false) CommonsMultipartFile userAvatar,HttpServletRequest request) throws Exception {
		System.out.println("存储用户手机号为:"+session.getAttribute("userPhoneNumber")+"   实际手机号为:"+userPhoneNumber);
		System.out.println("存储验证码为:"+session.getAttribute("chaphcha")+"   实际验证码为:"+chaphcha);
		System.out.println(userPhoneNumber.equals(session.getAttribute("userPhoneNumber")));
		System.out.println(chaphcha.equals(session.getAttribute("chaphcha")));
		if(userPhoneNumber.equals(session.getAttribute("userPhoneNumber"))&&chaphcha.equals(session.getAttribute("chaphcha"))) {
//			return registerResult;
			User user = new User();
			user.setUserName(userName);
			user.setUserPassword(userPassword);
			user.setUserPermission(0);
			user.setUserPhoneNumber(userPhoneNumber);
			user.setUserSex(userSex);
			BackJsonUtil registerResult = userService.checkRegister(user,userAvatar,request);
			User session_user = userService.getUser(userPhoneNumber, userPassword);
			System.out.println(session_user);
			session.setAttribute("user",session_user);
			return registerResult;
		}
		else {
			BackJsonUtil chaphchaWrong = new BackJsonUtil(false,"验证码有误，请重新输入!");
			return chaphchaWrong;
		}
	}
	
	//尽量不要测试，要钱啊啊啊啊啊！！！！
	//短信验证码请求
	@ResponseBody
	@RequestMapping("/getchaphcha")
	public BackJsonUtil getchaphcha(String userPhoneNumber){
		if(CheckUtil.checkUserPhone(userPhoneNumber)) {
			if(userService.checkPhoneIsExist(userPhoneNumber)) {
				int randomChaphcha = (int)(100000+Math.random()*900000);
				System.out.println("随机验证码为:"+randomChaphcha);
				IndustrySMS.execute(userPhoneNumber,randomChaphcha);
				BackJsonUtil chaphchaResult = userService.getChaphcha(userPhoneNumber,randomChaphcha);
				if(chaphchaResult.getStatus()) {
					session.setAttribute("userPhoneNumber", userPhoneNumber);
					session.setAttribute("chaphcha", randomChaphcha+"");
				}
				return chaphchaResult;			
				
				//测试
//				session.setAttribute("userPhoneNumber", userPhoneNumber);
//				session.setAttribute("chaphcha", randomChaphcha+"");	
//				return new BackJsonUtil(true,"成功");
				
			}else {
				BackJsonUtil back = new BackJsonUtil(false,"您已注册，请登录!");
				return back;
			}
		}else {
			BackJsonUtil back = new BackJsonUtil(false,"您的手机号有误，请重新输入!");
			return back;
		}
	}
	
	
	//查看指定用户签到的天数——用户
	//查看指定用户签到的天数——管理员
	@ResponseBody
	@RequestMapping(value= {"/user/getUserSignInRecording","/admin/getUserSignInRecording"})
	public BackJsonUtil getUserSignInRecording(@RequestParam(value = "userId",required=false)Integer userId,HttpServletRequest request) {
		if(userId==null) {
			session = request.getSession();
			User user = (User)session.getAttribute("user");
			userId = user.getUserId();
		}
		return userService.getUserSignInRecording(userId);
	}
	
	//用户提交签到请求——用户
	@ResponseBody
	@RequestMapping("/user/addSignInRecording")
	public BackJsonUtil addSignInRecording(@RequestParam(value = "userId",required=false)Integer userId,HttpServletRequest request) throws ParseException {
		if(userId==null) {
			session = request.getSession();
			User user = (User)session.getAttribute("user");
			userId = user.getUserId();
		}
		return userService.addSignInRecording(userId);
	}
	
	//修改用户连续签到天数——管理员
	@ResponseBody
	@RequestMapping("/admin/updateSignInRecording")
	public BackJsonUtil updateSignInRecording(@RequestParam(value = "userId",required=false)Integer userId,@RequestParam("totalTimes")Integer totalTimes,HttpServletRequest request) {
		if(userId==null) {
			session = request.getSession();
			User user = (User)session.getAttribute("user");
			userId = user.getUserId();
		}
		return userService.updateSignInRecording(userId,totalTimes);
	}
	
	//移动端用户登录
	@ResponseBody
	@RequestMapping("/mobile/login")
	public BackJsonUtil checkLoginOnMobile(String userPhoneNumber,String userPassword,HttpServletRequest request) throws Exception {
		User user = userService.checkLoginByUser(userPhoneNumber, userPassword);
		session = request.getSession();
		BackJsonUtil back = new BackJsonUtil();
		if(user!=null) {
			session.setAttribute("user",user);
			back.setStatus(true);
			back.setInfo(user);
		}else {
			back.setStatus(false);
			back.setInfo("您的用户名或密码有误,请重新输入!");
		}
		return back;
	}
	
	//移动端用户注册
	@ResponseBody
	@RequestMapping("/mobile/register")
	public BackJsonUtil checkRegisterOnMobile(String userName,String userSex,String userPhoneNumber,String chaphcha,String userPassword,@RequestParam(required=false) CommonsMultipartFile userAvatar,HttpServletRequest request) throws Exception {
		session = request.getSession();
		if(userPhoneNumber.equals(session.getAttribute("userPhoneNumber"))&&chaphcha.equals(session.getAttribute("chaphcha"))) {
//			return registerResult;
			User user = new User();
			user.setUserName(userName);
			user.setUserPassword(userPassword);
			user.setUserPermission(0);
			user.setUserPhoneNumber(userPhoneNumber);
			user.setUserSex(userSex);
			BackJsonUtil registerResult = userService.checkRegisterByUser(user,userAvatar,request);
			User session_user = userService.getUser(userPhoneNumber, userPassword);
			System.out.println(session_user);
			session.setAttribute("user",session_user);
			return registerResult;
		}
		else {
			BackJsonUtil chaphchaWrong = new BackJsonUtil(false,"验证码有误，请重新输入!");
			return chaphchaWrong;
		}
	}
	
	//查看指定用户个人信息——用户
	@ResponseBody
	@RequestMapping("/user/getUserInfo")
	public BackJsonUtil getUserInfoByIdByUser(@RequestParam(value="userId",required=false)Integer userId,HttpServletRequest request) {
		if(userId==null) {
			session = request.getSession();
			User user = (User)session.getAttribute("user");
			userId = user.getUserId();
		}
		return userService.getUserInfoById(userId);
	}
	
	//查看指定用户个人信息——管理员
	@RequestMapping("/admin/getUserInfo")
	public ModelAndView getUserInfoById(@RequestParam(value="userId")Integer userId) {
		ModelAndView mv = new ModelAndView("admin/userManager/user_info");
		mv.addObject("pageName","userInfoManage");
		User user= userService.getUserInfo(userId);
		mv.addObject("user",user);
		System.out.println("pageName:userInfoManage"+"\n\nuser:"+user);
		return mv;
	}
	
	//修改指定用户个人信息——用户
	@ResponseBody
	@RequestMapping("/user/updateUserInfo")
	public BackJsonUtil updateUserInfo(@RequestParam(value="userId",required=false)Integer userId,@RequestParam("userName")String userName,@RequestParam("userSex")String userSex,@RequestParam("userPhoneNumber")String userPhoneNumber,@RequestParam("userPassword")String userPassword,@RequestParam(value="userAvatar",required=false) CommonsMultipartFile userAvatar,HttpServletRequest request) throws Exception {
		session = request.getSession();
		if(userId==null) {
			User user = (User)session.getAttribute("user");
			userId = user.getUserId();
		}
		BackJsonUtil backJsonUtil = userService.updateUserInfo(userId,userName,userSex,userPhoneNumber,userPassword,userAvatar,request);
		if(backJsonUtil.getStatus()) {
			User user = userService.getUser(userPhoneNumber, userPassword);
			session.setAttribute("user",user);
		}
		return backJsonUtil;	
	}
	
	//修改指定用户个人信息——管理员
	@RequestMapping("/admin/updateUserInfoByAdmin")
	public String updateUserInfoByAdmin(@RequestParam("userId")Integer userId,@RequestParam("userName")String userName,@RequestParam("userSex")String userSex,@RequestParam("userPhoneNumber")String userPhoneNumber,@RequestParam("userPassword")String userPassword,@RequestParam(value="userAvatar",required=false) CommonsMultipartFile userAvatar,HttpServletRequest request) throws Exception {
		int change = userService.updateUserInfoByAdmin(userId,userName,userSex,userPhoneNumber,userPassword,userAvatar,request);
		if(change != 0) {
			User user = userService.getUser(userPhoneNumber, userPassword);
			session = request.getSession();
			session.setAttribute("user",user);
		}
		return "redirect:/user/admin/userlist_manage/1";	
	}
	
	//删除用户——管理员
	@ResponseBody
	@RequestMapping("/admin/deleteUser")
	public BackJsonUtil deleteUser(@RequestParam(value="userId")Integer userId) {
		return userService.deleteUser(userId);
	}
	
	//注销登录——用户
	@ResponseBody
	@RequestMapping("/user/quitLogin")
	public BackJsonUtil quitLogin(HttpServletRequest request) {
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		session = request.getSession();
		User user = (User)session.getAttribute("user");
		if(user == null) {
			backJsonUtil.setStatus(false);
			backJsonUtil.setInfo("注销失败，您还没有登录");
		}else {
			backJsonUtil.setStatus(true);
			backJsonUtil.setInfo("注销成功");
		}
		return backJsonUtil;
	}
	
	//查询所有用户列表(分页)——管理员
	@RequestMapping("/admin/userlist_manage/{pageNum}")
	public ModelAndView getUserList(@PathVariable("pageNum")Integer pageNum) {
		ModelAndView mv = new ModelAndView("admin/userManager/user_list");
		mv.addObject("pageName", "userListManage");
		List<User> users = userService.getUsersByPageNum(pageNum);
		mv.addObject("users", users);
		int pageNumeber = userService.getPageNumber();//获得所有user页数
		mv.addObject("pageNumeber", pageNumeber);
		mv.addObject("currentPage", pageNum);
		System.out.println("pageName:userInfoManage"+"\n\nusers:"+users+"\n\npageNumeber:"+pageNumeber+"\n\ncurrentPage:"+pageNum);
		return mv;
	}
	
	//用户图表分布页——管理员
	@RequestMapping("/admin/toUserChart")
	public ModelAndView toUserChart() {
		ModelAndView mv = new ModelAndView("admin/userManager/users_chart");
		mv.addObject("pageName","userChartManage");
		return mv;
	}
	//获得图标信息
	@ResponseBody
	@RequestMapping("/admin/getUserChart")
	public BackJsonUtil getUserChart() {
		return userService.getUserChart();
	}
	
}

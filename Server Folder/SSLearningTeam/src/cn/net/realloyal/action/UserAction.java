package cn.net.realloyal.action;

import java.sql.Time;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import cn.net.realloyal.core.util.BackJsonUtil;
import cn.net.realloyal.core.util.CheckUtil;
import cn.net.realloyal.core.util.chaphcha.IndustrySMS;
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
//				IndustrySMS.execute(userPhoneNumber,randomChaphcha);
//				BackJsonUtil chaphchaResult = userService.getChaphcha(userPhoneNumber,randomChaphcha);
//				if(chaphchaResult.getStatus()) {
//					session.setAttribute("userPhoneNumber", userPhoneNumber);
//					session.setAttribute("chaphcha", randomChaphcha+"");
//				}
//				return chaphchaResult;			
				
				//测试
				session.setAttribute("userPhoneNumber", userPhoneNumber);
				session.setAttribute("chaphcha", randomChaphcha+"");	
				return new BackJsonUtil(true,"成功");
				
			}else {
				BackJsonUtil back = new BackJsonUtil(false,"您已注册，请登录!");
				return back;
			}
		}else {
			BackJsonUtil back = new BackJsonUtil(false,"您的手机号有误，请重新输入!");
			return back;
		}
	}
	
	//用户信息详情
	@RequestMapping("/user_info")
	public ModelAndView getUserInfo() {
		ModelAndView mv = new ModelAndView("admin/userManager/user_info");
		return mv;
	}
	
	//用户列表
	@RequestMapping("/user_list")
	public ModelAndView getUserList() {
		ModelAndView mv = new ModelAndView("admin/userManager/user_list");
		return mv;
	}
	
	//用户图表
	@RequestMapping("/users_chart")
	public ModelAndView getUsersChart() {
		ModelAndView mv = new ModelAndView("admin/userManager/users_chart");
		return mv;
	}
	
	
	
	
	
	@ResponseBody
	@RequestMapping("/mobile/login")
	public BackJsonUtil mobileLogin() {
		BackJsonUtil back = new BackJsonUtil(true,new User());
		return back;
	}
	
	
	//胖哥测试接口
	@RequestMapping("/testlogin")
	public void testLogin(String id,String password) {
		System.out.println(id+"   "+password);
	}
}

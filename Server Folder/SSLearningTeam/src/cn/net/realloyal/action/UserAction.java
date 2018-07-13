package cn.net.realloyal.action;

import java.sql.Time;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.net.realloyal.core.util.BackJsonUtil;
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
		mv.addObject("admin",user);
		if(user.getUserPermission()==1) {
			mv.setViewName("admin/index");
		}else {
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
	public BackJsonUtil checkRegister(User user) throws Exception {
		BackJsonUtil registerResult = userService.checkRegister(user);
		return registerResult;
	}
	
	//尽量不要测试，要钱啊啊啊啊啊！！！！
	//短信验证码请求
	@ResponseBody
	@RequestMapping("/getchaphcha")
	public BackJsonUtil getchaphcha(String userPhoneNumber){
		int randomChaphcha = (int)(100000+Math.random()*900000);
		IndustrySMS.execute(userPhoneNumber,randomChaphcha);
		BackJsonUtil chaphchaResult = userService.getChaphcha(userPhoneNumber,randomChaphcha);
		if(chaphchaResult.getStatus()) {
			session.setAttribute("userPhoneNumber", userPhoneNumber);
			session.setAttribute("chaphcha", randomChaphcha);
		}
		return chaphchaResult;
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

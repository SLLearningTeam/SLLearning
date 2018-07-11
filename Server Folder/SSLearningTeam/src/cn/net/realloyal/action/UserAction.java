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
		ModelAndView mv = new ModelAndView();
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

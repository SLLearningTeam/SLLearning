package cn.net.realloyal.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.net.realloyal.model.User;
import cn.net.realloyal.service.UserService;

@Controller
@RequestMapping("/user")
public class UserAction {

	@Autowired
	UserService userService;
	
	//初始化登录界面
	@RequestMapping("/init")
	public String startInit() {
		return "common/login";
	}

	//登录请求处理
	@RequestMapping("/login")
	public ModelAndView checkLogin(String userPhoneNumber,String userPassword) {
		ModelAndView mv = new ModelAndView();
		User user = userService.checkLogin(userPhoneNumber, userPassword);
		if(user!=null) {
			if(user.getUserPermission()==1) {
				System.out.println("管理员登陆成功");
				mv.setViewName("admin/index");
				mv.addObject("admin",user);
				return mv;
			}
		}else {
			System.out.println("wrong");
		}
		return null;
	}
}

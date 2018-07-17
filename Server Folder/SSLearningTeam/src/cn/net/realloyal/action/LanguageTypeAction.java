package cn.net.realloyal.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/language")
public class LanguageTypeAction {
	
	@RequestMapping("/languages_manage")
	public ModelAndView getLanguagesManage() {
		ModelAndView mv = new ModelAndView("admin/resourceManager/languages_manage");
		return mv;
	}
}

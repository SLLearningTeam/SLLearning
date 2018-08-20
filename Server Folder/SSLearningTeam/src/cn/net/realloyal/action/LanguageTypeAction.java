package cn.net.realloyal.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/language")
public class LanguageTypeAction {
	//获取语言列表——管理员
	@RequestMapping("/admin/languages_manage")
	public ModelAndView getLanguagesManage() {
		ModelAndView mv = new ModelAndView("admin/resourceManager/languages_manage");
		return mv;
	}
	
	//获取语言添加页面——管理员
	@RequestMapping("/admin/toaddlanguages")
	public ModelAndView toAddLanguages() {
		ModelAndView mv = new ModelAndView("admin/resourceManager/addLanguages");
		return mv;
	}
	//获取语言修改页面——管理员
	@RequestMapping("/admin/toupdatelanguages")
	public ModelAndView toUpdateLanguages() {
		ModelAndView mv = new ModelAndView("admin/resourceManager/UpdateLanguages");
		return mv;
	}
}

package cn.net.realloyal.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ratetype")
public class RateTypeAction {
	
	@RequestMapping("/ratetypes_manage")
	public ModelAndView getRatetypesManage() {
		ModelAndView mv = new ModelAndView("admin/resourceManager/ratetypes_manage");
		return mv;
	}
}

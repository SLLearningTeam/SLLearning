package cn.net.realloyal.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/advice")
public class AdviceAction {
	
	@RequestMapping("/ideas_feedback")
	public ModelAndView getIdeasFeedback() {
		ModelAndView mv = new ModelAndView("admin/websiteManager/ideas_feedback");
		return mv;
	}
	
}

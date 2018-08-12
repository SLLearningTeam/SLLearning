package cn.net.realloyal.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/website")
public class WebsiteInfoAction {

	@RequestMapping("/recommend_resources")
	public ModelAndView getRecommendResources() {
		ModelAndView mv = new ModelAndView("admin/websiteManager/recommend_resources");
		return mv;
	}
	
	@RequestMapping("/website_monitor")
	public ModelAndView getWebsiteMonitor() {
		ModelAndView mv = new ModelAndView("admin/websiteManager/website_monitor");
		return mv;
	}
}

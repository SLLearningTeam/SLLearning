package cn.net.realloyal.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/website")
public class WebsiteInfoAction {
	//轮播图相关
	//获取轮播图上传页面——管理员
	
	//轮播图上传接口——管理员
	
	//轮播图删除接口——管理员
	
	//获取轮播图修改页面——管理员
	
	//轮播图修改接口——管理员
	
	//查看轮播图列表(分页)——管理员
	
	//查看所有轮播图列表——管理员
	
	//查看所有轮播图列表JSON——用户
	
	
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

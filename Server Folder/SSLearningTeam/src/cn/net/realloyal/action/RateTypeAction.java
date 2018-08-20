package cn.net.realloyal.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ratetype")
public class RateTypeAction {
	//获取种类类别列表页面
	@RequestMapping("/admin/ratetypes_manage")
	public ModelAndView getRatetypesManage() {
		ModelAndView mv = new ModelAndView("admin/resourceManager/ratetypes_manage");
		return mv;
	}
	
	//获取种类类别添加页面——管理员
	@RequestMapping("/admin/toaddratetypes")
	public ModelAndView toAddRateTypes() {
		ModelAndView mv = new ModelAndView("admin/resourceManager/addRateTypes");
		return mv;
	}
	//获取种类类别修改页面——管理员
	@RequestMapping("/admin/toupdateratetypes")
	public ModelAndView toUpdateRateTypes() {
		ModelAndView mv = new ModelAndView("admin/resourceManager/UpdateRateTypes");
		return mv;
	}
}

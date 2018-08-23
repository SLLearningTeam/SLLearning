package cn.net.realloyal.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.net.realloyal.model.RateType;
import cn.net.realloyal.service.RateTypeService;

@Controller
@RequestMapping("/ratetype")
public class RateTypeAction {
	@Autowired
	private RateTypeService rateTypeService;
	
	//获取种类类别列表页面——管理员
	@RequestMapping("/admin/ratetypes_manage/{pageNum}")
	public ModelAndView getRatetypesManage(@PathVariable(value="pageNum")Integer pageNum) {
		ModelAndView mv = new ModelAndView("admin/resourceManager/ratetypes_manage");
		mv.addObject("pageName","rateTypeManage");
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

package cn.net.realloyal.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import cn.net.realloyal.core.util.BackJsonUtil;
import cn.net.realloyal.model.LanguageType;
import cn.net.realloyal.model.RateType;
import cn.net.realloyal.service.RateTypeService;

@Controller
@RequestMapping("/ratetype")
public class RateTypeAction {
	@Autowired
	private RateTypeService rateTypeService;
	
	//获取种类类别添加页面——管理员
	@RequestMapping("/admin/toaddratetypes")
	public ModelAndView toAddRateTypes() {
		ModelAndView mv = new ModelAndView("admin/resourceManager/addRateTypes");
		mv.addObject("pageName","rateTypeManage");
		List<LanguageType> languageTypes = rateTypeService.getLanguages();
		mv.addObject("languageTypes", languageTypes);
		return mv;
	}
	
	//添加种类类别接口——管理员
	@RequestMapping("/admin/addratetypes")
	public String addRateType(@RequestParam("languageTypeId")Integer languageTypeId,@RequestParam("rateName")String rateName,@RequestParam("rateIcon")CommonsMultipartFile rateIcon,HttpServletRequest request) {
		rateTypeService.addRateType(languageTypeId,rateName,rateIcon,request);
		return "redirect:/ratetype/admin/ratetypes_manages/1";//重定向到种类类别列表页面
	}
	
	//获取种类类别列表页面——管理员
	@RequestMapping("/admin/ratetypes_manages/{pageNum}")
	public ModelAndView getRatetypesManage(@PathVariable(value="pageNum")Integer pageNum) {
		ModelAndView mv = new ModelAndView("admin/resourceManager/ratetypes_manage");
		mv.addObject("pageName","rateTypeManage");
		List<RateType>rateTypes = rateTypeService.getRatetypesManage(pageNum);
		mv.addObject("rateTypes", rateTypes);
		int pageNumber = rateTypeService.getPageNumber();
		mv.addObject("pageNumber", pageNumber);
		mv.addObject("currentPage", pageNum);
		return mv;
	}
	
	//获取种类类别修改页面——管理员
	@RequestMapping("/admin/toupdateratetypes")
	public ModelAndView toUpdateRateTypes(@RequestParam("rateTypeId")Integer rateTypeId) {
		ModelAndView mv = new ModelAndView("admin/resourceManager/updateRateTypes");
		mv.addObject("pageName","rateTypeManage");
		//查询当前种类类别的相关信息用于表单回显
		RateType rateType = rateTypeService.getRateTypeInfo(rateTypeId);
		mv.addObject("rateType", rateType);
		return mv;
	}
	
	//修改种类类别接口——管理员
	@RequestMapping("/admin/updateratetype")
	public String updateRateType(@RequestParam("rateTypeId")Integer rateTypeId,@RequestParam("languageTypeId")Integer languageTypeId,@RequestParam("rateName")String rateName,@RequestParam(value="rateIcon",required=false)CommonsMultipartFile rateIcon,HttpServletRequest request) {
		rateTypeService.updateRateType(rateTypeId,languageTypeId,rateName,rateIcon,request);
		return "redirect:/ratetype/admin/ratetypes_manages/1";//重定向到种类类别列表页面
	}
	
	//删除种类类别接口——管理员
	@ResponseBody
	@RequestMapping("/admin/deleteratetype")
	public BackJsonUtil deleteRateType(@RequestParam("rateTypeId")Integer rateTypeId) {
		return rateTypeService.deleteRateType(rateTypeId);
	}
	
	//获得所有种类类别内容——用户
	@ResponseBody
	@RequestMapping("/user/getratetypes/{pageNum}")
	public BackJsonUtil getRateTypes(@PathVariable(value="pageNum")Integer pageNum) {
		return rateTypeService.getRateTypes(pageNum);
	}
	
	//获得所有种类类别内容——用户
	@ResponseBody
	@RequestMapping("/user/getratetypebylanguagetypeid")
	public BackJsonUtil getRateTypesByLanguageTypeId(@RequestParam(value="languageTypeId")Integer languageTypeId) {
		return rateTypeService.getRateTypesByLanguageTypeId(languageTypeId);
	}
}

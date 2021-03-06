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
import cn.net.realloyal.service.LanguageTypeService;

@Controller
@RequestMapping("/language")
public class LanguageTypeAction {
	@Autowired
	private LanguageTypeService languageTypeService;
	
	//获取语言列表——管理员
	@RequestMapping("/admin/languages_manage/{pageNum}")
	public ModelAndView getLanguagesManage(@PathVariable(value="pageNum")Integer pageNum) {
		ModelAndView mv = new ModelAndView("admin/resourceManager/languages_manage");
		mv.addObject("pageName", "languageManage");
		List<LanguageType> languageTypes = languageTypeService.getLanguagesManage(pageNum);
		mv.addObject("languageTypes", languageTypes);
		int pageNumeber = languageTypeService.getPageNumber();//获得所有language个数
		//System.out.println("后台取到pageNumber:"+pageNumeber);
		mv.addObject("pageNumeber", pageNumeber);
		mv.addObject("currentPage", pageNum);
		return mv;//返回pageName用于导航栏显示选中；languageTypes表示所有语言类别
	}
	
	//获取语言添加页面——管理员
	@RequestMapping("/admin/toaddlanguages")
	public ModelAndView toAddLanguages() {
		ModelAndView mv = new ModelAndView("admin/resourceManager/addLanguages");
		mv.addObject("pageName", "languageManage");
		return mv;//返回pageName用于导航栏显示选中
	}
	
	//添加语言接口——管理员
	@RequestMapping("/admin/addlanguage")
	public String addlanguage(@RequestParam("languageName")String languageName,@RequestParam(value="languageIcon",required=false) CommonsMultipartFile languageIcon,HttpServletRequest request) {
		languageTypeService.addlanguage(languageName,languageIcon,request);
		return "redirect:/language/admin/languages_manage/1";
	}
	
	//获取语言修改页面——管理员
	@RequestMapping("/admin/toupdatelanguages")
	public ModelAndView toUpdateLanguages(@RequestParam("languageTypeId")Integer languageTypeId) {
		ModelAndView mv = new ModelAndView("admin/resourceManager/updateLanguages");
		mv.addObject("pageName", "languageManage");
		//查询当前语言类别的相关信息用于表单回显
		LanguageType languageType = languageTypeService.getLanguageTypeInfo(languageTypeId);
		mv.addObject("languageType", languageType);
		return mv;//返回pageName用于导航栏显示选中；languageType表示所选语言类别内容
	}
	
	//修改语言接口——管理员
	@RequestMapping("/admin/updatelanguage")
	public String updateLanguage(@RequestParam("languageTypeId")Integer languageTypeId,@RequestParam("languageName")String languageName,@RequestParam(value="languageIcon",required=false) CommonsMultipartFile languageIcon,HttpServletRequest request) {
		languageTypeService.updateLanguage(languageTypeId,languageName,languageIcon,request);
		return "redirect:/language/admin/languages_manage/1";
	}
	
	//删除语言接口——管理员
	@ResponseBody
	@RequestMapping("/admin/deletelanguage")
	public BackJsonUtil deletelanguage(@RequestParam("languageTypeId")Integer languageTypeId) {
		return languageTypeService.deletelanguage(languageTypeId);
	}
	
	//分页获得语言类别内容——用户
	@ResponseBody
	@RequestMapping("/user/getlanguages/{pageNum}")
	public BackJsonUtil getLanguages(@PathVariable(value="pageNum")Integer pageNum) {
		return languageTypeService.getLanguages(pageNum);
	}
	
	//获得所有语言类别内容——用户
	@ResponseBody
	@RequestMapping("/user/getlanguages")
	public BackJsonUtil getAllLanguages() {
		return languageTypeService.getAllLanguages();
	}
	
	//语言类别名称查重接口JSON——管理员
	@ResponseBody
	@RequestMapping("/admin/selectLanguageNameRepeat")
	public BackJsonUtil selectLanguageNameRepeat(@RequestParam("languageName")String languageName){
		return languageTypeService.selectLanguageNameRepeat(languageName);
	}
}

package cn.net.realloyal.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import cn.net.realloyal.model.LanguageType;
import cn.net.realloyal.service.CourseService;
import cn.net.realloyal.service.RateTypeService;
import cn.net.realloyal.vo.RateTypeForSQL;

@Controller
@RequestMapping("/course")
public class CourseAction {
	@Autowired
	private CourseService courseService;
	@Autowired
	private RateTypeService rateTypeService;
	
	//获取听力课程添加页面——管理员
	@RequestMapping("/admin/toAddListeningCourse")
	public ModelAndView toAddListeningCourse() {
		ModelAndView mv = new ModelAndView("admin/resourceManager/addListeningCourse");
		mv.addObject("pageName","courseManage");
		List<LanguageType>languageTypes = rateTypeService.getLanguages();
		mv.addObject("languageTypes", languageTypes);
		System.out.println(languageTypes);
		return mv;
	}
	
	//获取口语课程添加页面——管理员
	@RequestMapping("/admin/toAddOralCourse")
	public ModelAndView toAddOralCourse() {
		ModelAndView mv = new ModelAndView("admin/resourceManager/addOralCourse");
		mv.addObject("pageName","courseManage");
		List<LanguageType>languageTypes = rateTypeService.getLanguages();
		mv.addObject("languageTypes", languageTypes);
		return mv;
	}
	//获取阅读课程添加页面——管理员
	@RequestMapping("/admin/toAddReadingCourse")
	public ModelAndView toAddReadingCourse() {
		ModelAndView mv = new ModelAndView("admin/resourceManager/addReadingCourse");
		mv.addObject("pageName","courseManage");
		List<LanguageType>languageTypes = rateTypeService.getLanguages();
		mv.addObject("languageTypes", languageTypes);
		return mv;
	}
	
	//添加听力课程接口
	@RequestMapping("/admin/addListeningCourse")
	public String addListeningCourse(@RequestParam("languageTypeId")Integer languageTypeId,@RequestParam("rateTypeId")Integer rateTypeId,@RequestParam("courseName")String courseName,@RequestParam("courseChineseContent")String courseChineseContent,@RequestParam("courseEnglishContent")String courseEnglishContent,@RequestParam("courseResource")CommonsMultipartFile courseResource,@RequestParam("instructionImg")CommonsMultipartFile instructionImg,HttpServletRequest request) {
		courseService.addListeningCourse(languageTypeId,rateTypeId,courseName,courseChineseContent,courseEnglishContent,courseResource,instructionImg,request);
		return "redirect:/course/admin/courses_manage";
	}
	
	//添加口语课程接口
	@RequestMapping("/admin/addOralCourse")
	public String addOralCourse(@RequestParam("languageTypeId")Integer languageTypeId,@RequestParam("rateTypeId")Integer rateTypeId,@RequestParam("courseName")String courseName,@RequestParam("courseChineseContent")String courseChineseContent,@RequestParam("courseEnglishContent")String courseEnglishContent,@RequestParam("instructionImg")CommonsMultipartFile instructionImg,HttpServletRequest request) {
		courseService.addOralCourse(languageTypeId,rateTypeId,courseName,courseChineseContent,courseEnglishContent,instructionImg,request);
		return "redirect:/course/admin/courses_manage";
	}
	
	//添加阅读课程接口
	@RequestMapping("/admin/addReadingCourse")
	public String addReadingCourse(@RequestParam("languageTypeId")Integer languageTypeId,@RequestParam("rateTypeId")Integer rateTypeId,@RequestParam("courseName")String courseName,@RequestParam("courseChineseContent")String courseChineseContent,@RequestParam("courseEnglishContent")String courseEnglishContent,@RequestParam("instructionImg")CommonsMultipartFile instructionImg,HttpServletRequest request) {
		courseService.addReadingCourse(languageTypeId,rateTypeId,courseName,courseChineseContent,courseEnglishContent,instructionImg,request);
		return "redirect:/course/admin/courses_manage";
	}

	//获取综合课程列表——管理员
	@RequestMapping("/admin/courses_manage")
	public ModelAndView getCoursesManage() {
		ModelAndView mv = new ModelAndView("admin/resourceManager/courses_manage");
		mv.addObject("pageName","courseManage");
		return mv;
	}
	
	//获得口语课程列表——管理员
	
	//获得听力课程列表——管理员
	
	//获得阅读课程列表——管理员
	
	//获得综合课程列表JSON——用户
	
	//获得口语课程列表JSON——用户
	
	//获得阅读课程列表JSON——用户
	
	//根据课程名称搜索得到综合课程列表——管理员
	
	//根据课程名称搜索得到综合课程列表JSON——用户
	
	
	
	
	//获取课程修改页面——管理员
	@RequestMapping("/admin/toupdatecourses")
	public ModelAndView toUpdateCourses() {
		ModelAndView mv = new ModelAndView("admin/resourceManager/UpdateCourses");
		return mv;
	}
}

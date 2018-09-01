package cn.net.realloyal.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import cn.net.realloyal.core.util.BackJsonUtil;
import cn.net.realloyal.model.LanguageType;
import cn.net.realloyal.model.ListeningCourse;
import cn.net.realloyal.model.OralCourse;
import cn.net.realloyal.model.ReadingCourse;
import cn.net.realloyal.model.User;
import cn.net.realloyal.service.CourseService;
import cn.net.realloyal.service.RateTypeService;
import cn.net.realloyal.service.WebsiteInfoService;
import cn.net.realloyal.vo.EvaluationFormForSQL;
import cn.net.realloyal.vo.QuestionForSQL;
import cn.net.realloyal.vo.RateTypeForSQL;

@Controller
@RequestMapping("/course")
public class CourseAction {
	@Autowired
	private CourseService courseService;
	@Autowired
	private RateTypeService rateTypeService;
	@Autowired
	private WebsiteInfoService websiteInfoService;
	
	//设置session
	HttpSession session;
	
	//获取听力课程添加页面——管理员
	@RequestMapping("/admin/toAddListeningCourse")
	public ModelAndView toAddListeningCourse() {
		ModelAndView mv = new ModelAndView("admin/resourceManager/addListeningCourse");
		mv.addObject("pageName","courseManage");
		List<LanguageType>languageTypes = rateTypeService.getLanguages();
		mv.addObject("languageTypes", languageTypes);
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
	
	//删除听力课程接口
	@ResponseBody
	@RequestMapping("/admin/deleteListeningCourse")
	public BackJsonUtil deleteListeningCourse(@RequestParam("courseId")Integer courseId) {
		return courseService.deleteListeningCourse(courseId);
	}
	
	//删除口语课程接口
	@ResponseBody
	@RequestMapping("/admin/deleteOralCourse")
	public BackJsonUtil deleteOralCourse(@RequestParam("courseId")Integer courseId) {
		return courseService.deleteOralCourse(courseId);
	}
	
	//删除阅读课程接口
	@ResponseBody
	@RequestMapping("/admin/deleteReadingCourse")
	public BackJsonUtil deleteReadingCourse(@RequestParam("courseId")Integer courseId) {
		return courseService.deleteReadingCourse(courseId);
	}
	
	//跳转修改听力课程信息页面
	@RequestMapping("/admin/toUpdateListeningCourse")
	public ModelAndView toUpdateListeningCourse(@RequestParam("courseId")Integer courseId) {
		ModelAndView mv = new ModelAndView("admin/resourceManager/updateListeningCourse");
		mv.addObject("pageName","courseManage");
		//查看当前课程的相关信息用于表单回显
		ListeningCourse listeningCourse = courseService.getListeningCourseInfo(courseId);
		mv.addObject("listeningCourse",listeningCourse);
		//返回所有的languageType选项
		List<LanguageType>languageTypes = rateTypeService.getLanguages();
		mv.addObject("languageTypes", languageTypes);
		return mv;
	}
	
	//跳转修改口语课程信息页面
	@RequestMapping("/admin/toUpdateOralCourse")
	public ModelAndView toUpdateOralCourse(@RequestParam("courseId")Integer courseId) {
		ModelAndView mv = new ModelAndView("admin/resourceManager/updateOralCourse");
		mv.addObject("pageName","courseManage");
		//查看当前课程的相关信息用于表单回显
		OralCourse oralCourse = courseService.getOralCourseInfo(courseId);
		mv.addObject("oralCourse",oralCourse);
		//返回所有的languageType选项
		List<LanguageType>languageTypes = rateTypeService.getLanguages();
		mv.addObject("languageTypes", languageTypes);
		return mv;
	}
	
	//跳转修改阅读课程信息页面
	@RequestMapping("/admin/toUpdateReadingCourse")
	public ModelAndView toUpdateReadingCourse(@RequestParam("courseId")Integer courseId) {
		ModelAndView mv = new ModelAndView("admin/resourceManager/updateReadingCourse");
		mv.addObject("pageName","courseManage");
		//查看当前课程的相关信息用于表单回显
		ReadingCourse readingCourse = courseService.getReadingCourseInfo(courseId);
		mv.addObject("readingCourse",readingCourse);
		//返回所有的languageType选项
		List<LanguageType>languageTypes = rateTypeService.getLanguages();
		mv.addObject("languageTypes", languageTypes);
		return mv;
	}
	
	//修改听力课程信息接口
	@RequestMapping("/admin/updateListeningCourse")
	public String updateListeningCourse(@RequestParam("courseId")Integer courseId,@RequestParam("languageTypeId")Integer languageTypeId,@RequestParam("rateTypeId")Integer rateTypeId,@RequestParam("courseName")String courseName,@RequestParam("courseChineseContent")String courseChineseContent,@RequestParam("courseEnglishContent")String courseEnglishContent,@RequestParam(value="courseResource",required=false)CommonsMultipartFile courseResource,@RequestParam("downloadNum")Integer downloadNum,@RequestParam(value="instructionImg",required=false)CommonsMultipartFile instructionImg,HttpServletRequest request) {
		courseService.updateListeningCourse(courseId,languageTypeId,rateTypeId,courseName,courseChineseContent,courseEnglishContent,courseResource,downloadNum,instructionImg,request);
		return "redirect:/course/admin/courses_manage";
	}
	
	//修改口语课程信息接口
	@RequestMapping("/admin/updateOralCourse")
	public String updateOralCourse(@RequestParam("courseId")Integer courseId,@RequestParam("languageTypeId")Integer languageTypeId,@RequestParam("rateTypeId")Integer rateTypeId,@RequestParam("courseName")String courseName,@RequestParam("courseChineseContent")String courseChineseContent,@RequestParam("courseEnglishContent")String courseEnglishContent,@RequestParam("downloadNum")Integer downloadNum,@RequestParam(value="instructionImg",required=false)CommonsMultipartFile instructionImg,HttpServletRequest request) {
		courseService.updateOralCourse(courseId,languageTypeId,rateTypeId,courseName,courseChineseContent,courseEnglishContent,downloadNum,instructionImg,request);
		return "redirect:/course/admin/courses_manage";
	}
	
	//修改阅读课程信息接口
	@RequestMapping("/admin/updateReadingCourse")
	public String updateReadingCourse(@RequestParam("courseId")Integer courseId,@RequestParam("languageTypeId")Integer languageTypeId,@RequestParam("rateTypeId")Integer rateTypeId,@RequestParam("courseName")String courseName,@RequestParam("courseChineseContent")String courseChineseContent,@RequestParam("courseEnglishContent")String courseEnglishContent,@RequestParam("downloadNum")Integer downloadNum,@RequestParam(value="instructionImg",required=false)CommonsMultipartFile instructionImg,HttpServletRequest request) {
		courseService.updateReadingCourse(courseId,languageTypeId,rateTypeId,courseName,courseChineseContent,courseEnglishContent,downloadNum,instructionImg,request);
		return "redirect:/course/admin/courses_manage";
	}
	
	//获取综合课程列表——管理员
	@RequestMapping("/admin/courses_manage/{pageNum}")
	public ModelAndView getCoursesManage(@PathVariable("pageNum")Integer pageNum) {
		ModelAndView mv = new ModelAndView("admin/resourceManager/courses_manage");
		mv.addObject("pageName","courseManage");
		//返回综合课程信息
		Map<String,List>allTypeCourses = courseService.getAllTypeCourses(pageNum);
		mv.addObject("courses", allTypeCourses);
		//返回总页数
		int totalPages = courseService.allTypesTotalPages();
		mv.addObject("totalPages", totalPages);
		//返回当前页面页号
		mv.addObject("pageNum", pageNum);
		return mv;
	}
	
	//获取综合课程列表JSON——用户
	@ResponseBody
	@RequestMapping("/user/courses_manage/{pageNum}")
	public BackJsonUtil getCoursesManageByUser(@PathVariable("pageNum")Integer pageNum) {
		return courseService.getCoursesManageByUser(pageNum);
	}
	
	//获取听力课程列表——管理员
	@RequestMapping("/admin/listeningCourses_manage/{pageNum}")
	public ModelAndView getListeningCourses_manage(@PathVariable("pageNum")Integer pageNum) {
		ModelAndView mv = new ModelAndView("admin/resourceManager/courses_manage");
		mv.addObject("pageName","courseManage");
		//返回听力课程信息
		Map<String,List>listeningCourses = courseService.getListeningCourses(pageNum);
		mv.addObject("courses", listeningCourses);
		//返回听力课程总页数
		int totalPages = courseService.getListeningCoursesTotalPages();
		mv.addObject("totalPages", totalPages);
		//返回当前页面页号
		mv.addObject("pageNum", pageNum);
		return mv;
	}
	
	//获得听力课程列表JSON——用户
	@ResponseBody
	@RequestMapping("/user/listeningCourses_manage/{pageNum}")
	public BackJsonUtil getListeningCourses_manageByUser(@PathVariable("pageNum")Integer pageNum) {
		return courseService.getListeningCourses_manageByUser(pageNum);
	}
	
	//获取按下载量排序：听力课程列表——管理员
	@RequestMapping("/admin/listeningCourses_manageByDownload/{pageNum}")
	public ModelAndView getListeningCourses_manageByDownload(@PathVariable("pageNum")Integer pageNum) {
		ModelAndView mv = new ModelAndView("admin/resourceManager/courses_manage");
		mv.addObject("pageName","courseManage");
		//返回听力课程信息
		Map<String,List>listeningCoursesByDownload = courseService.getListeningCoursesByDownload(pageNum);
		mv.addObject("courses", listeningCoursesByDownload);
		//返回听力课程总页数
		int totalPages = courseService.getListeningCoursesTotalPages();
		mv.addObject("totalPages", totalPages);
		//返回当前页面页号
		mv.addObject("pageNum", pageNum);
		return mv;
	}
	
	//获取按下载量排序JSON：听力课程列表——用户
	@ResponseBody
	@RequestMapping("/user/listeningCourses_manageByDownload/{pageNum}")
	public BackJsonUtil getListeningCourses_manageByDownloadByUser(@PathVariable("pageNum")Integer pageNum) {
		return courseService.getListeningCourses_manageByDownloadByUser(pageNum);
	}
	
	//获取筛选指定语言类别的听力课程列表——管理员
	@RequestMapping("/admin/listeningCourses_manageByLanguageType/{pageNum}")
	public ModelAndView getListeningCourses_manageByLanguageType(@PathVariable("pageNum")Integer pageNum,@RequestParam("languageTypeId")Integer languageTypeId) {
		ModelAndView mv = new ModelAndView("admin/resourceManager/courses_manage");
		mv.addObject("pageName","courseManage");
		//返回指定语言类别的听力课程信息
		Map<String,List>listeningCoursesByLanguageType = courseService.getListeningCoursesByLanguageType(pageNum,languageTypeId);
		mv.addObject("courses", listeningCoursesByLanguageType);
		//返回指定语言类别的听力课程总页数
		int totalPages = courseService.getListeningCoursesTotalPagesByLanguageType(languageTypeId);
		mv.addObject("totalPages", totalPages);
		//返回当前页面页号
		mv.addObject("pageNum", pageNum);
		//System.out.println("Language------pageNum:"+pageNum+"\n\ntotalPages:"+totalPages+"\n\ncourses:"+listeningCoursesByLanguageType);
		return mv;
	}
	
	//获取筛选指定语言类别的听力课程列表JSON——用户
	@ResponseBody
	@RequestMapping("/user/listeningCourses_manageByLanguageType/{pageNum}")
	public BackJsonUtil getListeningCourses_manageByLanguageTypeByUser(@PathVariable("pageNum")Integer pageNum,@RequestParam("languageTypeId")Integer languageTypeId) {
		return courseService.getListeningCourses_manageByLanguageTypeByUser(pageNum,languageTypeId);
	}
	
	//获取筛选指定种类类别(种类类别已经确定了语言类别)的听力课程列表——管理员
	@RequestMapping("/admin/listeningCourses_manageByRateType/{pageNum}")
	public ModelAndView getListeningCourses_manageByRateType(@PathVariable("pageNum")Integer pageNum,@RequestParam("rateTypeId")Integer rateTypeId) {
		ModelAndView mv = new ModelAndView("admin/resourceManager/courses_manage");
		mv.addObject("pageName","courseManage");
		//返回指定种类类别的听力课程信息
		Map<String,List>listeningCoursesByRateType = courseService.getListeningCourses_manageByRateType(pageNum,rateTypeId);
		mv.addObject("courses", listeningCoursesByRateType);
		//返回指定种类类别的听力课程总页数
		int totalPages = courseService.getListeningCoursesTotalPagesByRateType(rateTypeId);
		mv.addObject("totalPages", totalPages);
		//返回当前页面页号
		mv.addObject("pageNum", pageNum);
		//System.out.println("ratetype------pageNum:"+pageNum+"\n\ntotalPages:"+totalPages+"\n\ncourses:"+listeningCoursesByRateType);
		return mv;
	}
	
	//获取筛选指定种类类别(种类类别已经确定了语言类别)的听力课程列表JSON——用户
	@ResponseBody
	@RequestMapping("/user/listeningCourses_manageByRateType/{pageNum}")
	public BackJsonUtil getListeningCourses_manageByRateTypeByUser(@PathVariable("pageNum")Integer pageNum,@RequestParam("rateTypeId")Integer rateTypeId) {
		return courseService.getListeningCourses_manageByRateTypeByUser(pageNum,rateTypeId);
	}
	
	//获得口语课程列表——管理员
	@RequestMapping("/admin/oralCourses_manage/{pageNum}")
	public ModelAndView getOralCourses_manage(@PathVariable("pageNum")Integer pageNum) {
		ModelAndView mv = new ModelAndView("admin/resourceManager/courses_manage");
		mv.addObject("pageName","courseManage");
		//返回口语课程信息
		Map<String,List>oralCourses = courseService.getOralCourses(pageNum);
		mv.addObject("courses", oralCourses);
		//返回口语课程总页数
		int totalPages = courseService.getOralCoursesTotalPages();
		mv.addObject("totalPages", totalPages);
		//返回当前页面页号
		mv.addObject("pageNum", pageNum);
		//System.out.println("OralCourses\npageNum:"+pageNum+"\n\ntotalPages:"+totalPages+"\n\ncourses:"+oralCourses);
		return mv;
	}
	
	//获得口语课程列表JSON——用户
	@ResponseBody
	@RequestMapping("/user/oralCourses_manage/{pageNum}")
	public BackJsonUtil getOralCourses_manageByUser(@PathVariable("pageNum")Integer pageNum) {
		return courseService.getOralCourses_manageByUser(pageNum);
	}
	
	//获取按下载量排序：口语课程列表——管理员
	@RequestMapping("/admin/oralCourses_manageByDownload/{pageNum}")
	public ModelAndView getOralCourses_manageByDownload(@PathVariable("pageNum")Integer pageNum) {
		ModelAndView mv = new ModelAndView("admin/resourceManager/courses_manage");
		mv.addObject("pageName","courseManage");
		//返回口语课程信息
		Map<String,List>oralCoursesByDownload = courseService.getOralCoursesByDownload(pageNum);
		mv.addObject("courses", oralCoursesByDownload);
		//返回口语课程总页数
		int totalPages = courseService.getOralCoursesTotalPages();
		mv.addObject("totalPages", totalPages);
		//返回当前页面页号
		mv.addObject("pageNum", pageNum);
		//System.out.println("OralCourses\npageNum:"+pageNum+"\n\ntotalPages:"+totalPages+"\n\ncourses:"+oralCoursesByDownload);
		return mv;
	}
	
	//获取按下载量排序JSON：口语课程列表——用户
	@ResponseBody
	@RequestMapping("/user/oralCourses_manageByDownload/{pageNum}")
	public BackJsonUtil getOralCourses_manageByDownloadByUser(@PathVariable("pageNum")Integer pageNum) {
		return courseService.getOralCourses_manageByDownloadByUser(pageNum);
	}
	
	//获取筛选指定语言类别的口语课程列表——管理员
	@RequestMapping("/admin/oralCourses_manageByLanguageType/{pageNum}")
	public ModelAndView getOralCourses_manageByLanguageType(@PathVariable("pageNum")Integer pageNum,@RequestParam("languageTypeId")Integer languageTypeId) {
		ModelAndView mv = new ModelAndView("admin/resourceManager/courses_manage");
		mv.addObject("pageName","courseManage");
		//返回指定语言类别的口语课程信息
		Map<String,List>oralCoursesByLanguageType = courseService.getOralCoursesByLanguageType(pageNum,languageTypeId);
		mv.addObject("courses", oralCoursesByLanguageType);
		//返回指定语言类别的口语课程总页数
		int totalPages = courseService.getOralCoursesTotalPagesByLanguageType(languageTypeId);
		mv.addObject("totalPages", totalPages);
		//返回当前页面页号
		mv.addObject("pageNum", pageNum);
		//System.out.println("OralCourses\n\npageNum:"+pageNum+"\n\ntotalPages:"+totalPages+"\n\ncourses:"+oralCoursesByLanguageType);
		return mv;
	}
	
	//获取筛选指定语言类别的口语课程列表JSON——用户
	@ResponseBody
	@RequestMapping("/user/oralCourses_manageByLanguageType/{pageNum}")
	public BackJsonUtil getOralCourses_manageByLanguageTypeByUser(@PathVariable("pageNum")Integer pageNum,@RequestParam("languageTypeId")Integer languageTypeId) {
		return courseService.getOralCourses_manageByLanguageTypeByUser(pageNum,languageTypeId);
	}
	
	//获取筛选指定种类类别(种类类别已经确定了语言类别)的口语课程列表——管理员
	@RequestMapping("/admin/oralCourses_manageByRateType/{pageNum}")
	public ModelAndView getOralCourses_manageByRateType(@PathVariable("pageNum")Integer pageNum,@RequestParam("rateTypeId")Integer rateTypeId) {
		ModelAndView mv = new ModelAndView("admin/resourceManager/courses_manage");
		mv.addObject("pageName","courseManage");
		//返回指定种类类别的口语课程信息
		Map<String,List>oralCoursesByRateType = courseService.getOralCourses_manageByRateType(pageNum,rateTypeId);
		mv.addObject("courses", oralCoursesByRateType);
		//返回指定种类类别的口语课程总页数
		int totalPages = courseService.getOralCoursesTotalPagesByRateType(rateTypeId);
		mv.addObject("totalPages", totalPages);
		//返回当前页面页号
		mv.addObject("pageNum", pageNum);
		//System.out.println("OralCourses\n\npageNum:"+pageNum+"\n\ntotalPages:"+totalPages+"\n\ncourses:"+oralCoursesByRateType);
		return mv;
	}
	
	//获取筛选指定种类类别(种类类别已经确定了语言类别)的口语课程列表JSON——用户
	@ResponseBody
	@RequestMapping("/user/oralCourses_manageByRateType/{pageNum}")
	public BackJsonUtil getOralCourses_manageByRateTypeByUser(@PathVariable("pageNum")Integer pageNum,@RequestParam("rateTypeId")Integer rateTypeId) {
		return courseService.getOralCourses_manageByRateTypeByUser(pageNum,rateTypeId);
	}
	
	//获得阅读课程列表——管理员
	@RequestMapping("/admin/readingCourses_manage/{pageNum}")
	public ModelAndView getReadingCourses_manage(@PathVariable("pageNum")Integer pageNum) {
		ModelAndView mv = new ModelAndView("admin/resourceManager/courses_manage");
		mv.addObject("pageName","courseManage");
		//返回阅读课程信息
		Map<String,List>readingCourses = courseService.getReadingCourses(pageNum);
		mv.addObject("courses", readingCourses);
		//返回阅读课程总页数
		int totalPages = courseService.getReadingCoursesTotalPages();
		mv.addObject("totalPages", totalPages);
		//返回当前页面页号
		mv.addObject("pageNum", pageNum);
		//System.out.println("ReadingCourses\npageNum:"+pageNum+"\n\ntotalPages:"+totalPages+"\n\ncourses:"+readingCourses);
		return mv;
	}
	
	//获得阅读课程列表JSON——用户
	@ResponseBody
	@RequestMapping("/user/readingCourses_manage/{pageNum}")
	public BackJsonUtil getReadingCourses_manageByUser(@PathVariable("pageNum")Integer pageNum) {
		return courseService.getReadingCourses_manageByUser(pageNum);
	}
	
	//获取按下载量排序：阅读课程列表——管理员
	@RequestMapping("/admin/readingCourses_manageByDownload/{pageNum}")
	public ModelAndView getReadingCourses_manageByDownload(@PathVariable("pageNum")Integer pageNum) {
		ModelAndView mv = new ModelAndView("admin/resourceManager/courses_manage");
		mv.addObject("pageName","courseManage");
		//返回阅读课程信息
		Map<String,List>readingCoursesByDownload = courseService.getReadingCoursesByDownload(pageNum);
		mv.addObject("courses", readingCoursesByDownload);
		//返回阅读课程总页数
		int totalPages = courseService.getReadingCoursesTotalPages();
		mv.addObject("totalPages", totalPages);
		//返回当前页面页号
		mv.addObject("pageNum", pageNum);
		//System.out.println("ReadingCourses\npageNum:"+pageNum+"\n\ntotalPages:"+totalPages+"\n\ncourses:"+readingCoursesByDownload);
		return mv;
	}
	
	//获取按下载量排序JSON：阅读课程列表——用户
	@ResponseBody
	@RequestMapping("/user/readingCourses_manageByDownload/{pageNum}")
	public BackJsonUtil getReadingCourses_manageByDownloadByUser(@PathVariable("pageNum")Integer pageNum) {
		return courseService.getReadingCourses_manageByDownloadByUser(pageNum);
	}
	
	//获取筛选指定语言类别的阅读课程列表——管理员
	@RequestMapping("/admin/readingCourses_manageByLanguageType/{pageNum}")
	public ModelAndView getReadingCourses_manageByLanguageType(@PathVariable("pageNum")Integer pageNum,@RequestParam("languageTypeId")Integer languageTypeId) {
		ModelAndView mv = new ModelAndView("admin/resourceManager/courses_manage");
		mv.addObject("pageName","courseManage");
		//返回指定语言类别的阅读课程信息
		Map<String,List>readingCoursesByLanguageType = courseService.getReadingCoursesByLanguageType(pageNum,languageTypeId);
		mv.addObject("courses", readingCoursesByLanguageType);
		//返回指定语言类别的阅读课程总页数
		int totalPages = courseService.getReadingCoursesTotalPagesByLanguageType(languageTypeId);
		mv.addObject("totalPages", totalPages);
		//返回当前页面页号
		mv.addObject("pageNum", pageNum);
		//System.out.println("ReadingCourses\n\npageNum:"+pageNum+"\n\ntotalPages:"+totalPages+"\n\ncourses:"+readingCoursesByLanguageType);
		return mv;
	}
	
	//获取筛选指定语言类别的阅读课程列表JSON——用户
	@ResponseBody
	@RequestMapping("/user/readingCourses_manageByLanguageType/{pageNum}")
	public BackJsonUtil getReadingCourses_manageByLanguageTypeByUser(@PathVariable("pageNum")Integer pageNum,@RequestParam("languageTypeId")Integer languageTypeId) {
		return courseService.getReadingCourses_manageByLanguageTypeByUser(pageNum,languageTypeId);
	}
	
	//获取筛选指定种类类别(种类类别已经确定了语言类别)的阅读课程列表——管理员
	@RequestMapping("/admin/readingCourses_manageByRateType/{pageNum}")
	public ModelAndView getReadingCourses_manageByRateType(@PathVariable("pageNum")Integer pageNum,@RequestParam("rateTypeId")Integer rateTypeId) {
		ModelAndView mv = new ModelAndView("admin/resourceManager/courses_manage");
		mv.addObject("pageName","courseManage");
		//返回指定种类类别的口语课程信息
		Map<String,List>readingCoursesByRateType = courseService.getReadingCourses_manageByRateType(pageNum,rateTypeId);
		mv.addObject("courses", readingCoursesByRateType);
		//返回指定种类类别的口语课程总页数
		int totalPages = courseService.getReadingCoursesTotalPagesByRateType(rateTypeId);
		mv.addObject("totalPages", totalPages);
		//返回当前页面页号
		mv.addObject("pageNum", pageNum);
		//System.out.println("ReadingCourses\n\npageNum:"+pageNum+"\n\ntotalPages:"+totalPages+"\n\ncourses:"+readingCoursesByRateType);
		return mv;
	}
	
	//获取筛选指定种类类别(种类类别已经确定了语言类别)的阅读课程列表JSON——用户
	@ResponseBody
	@RequestMapping("/user/readingCourses_manageByRateType/{pageNum}")
	public BackJsonUtil getReadingCourses_manageByRateTypeByUser(@PathVariable("pageNum")Integer pageNum,@RequestParam("rateTypeId")Integer rateTypeId) {
		return courseService.getReadingCourses_manageByRateTypeByUser(pageNum,rateTypeId);
	}
	
	//下载听力课程资源——用户
	@RequestMapping("/user/downloadListeningCourse")
	public ResponseEntity<byte[]> download(@RequestParam("fileName")String fileName,@RequestParam(value="courseId")Integer courseId,@RequestParam(value="userId",required=false)Integer userId,HttpServletRequest request) throws IOException, ParseException {
		session = request.getSession();
		//判断是否传递userId(如果没传递就从session中取)
		if(userId==null) {
			User user = (User)session.getAttribute("user");
			userId = user.getUserId();
		}
		//下载记录
		websiteInfoService.addDownloadRecordingForCourse(userId,"listeningcourse",courseId);
		//下载文件代码
		//将字符串的工程名删除
		String programContext = fileName.substring(16);
		//得到工程目录
		String sourceContext = request.getSession().getServletContext().getRealPath(programContext);
	    File file = new File(sourceContext);
	    byte[] body = null;
	    InputStream is = new FileInputStream(file);
	    body = new byte[is.available()];
	    is.read(body);
	    HttpHeaders headers = new HttpHeaders();
	    headers.add("Content-Disposition", "attchement;filename=" + file.getName());
	    HttpStatus statusCode = HttpStatus.OK;
	    ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(body, headers, statusCode);
	    return entity;
	}

	//查看听力课程详细信息
	@ResponseBody
	@RequestMapping("/user/getListeningCourseInfo")
	public BackJsonUtil getListeningCourseInfo(@RequestParam("courseId")Integer courseId,@RequestParam(value="userId",required=false)Integer userId,HttpServletRequest request){
		if(userId==null) {
			session = request.getSession();
			User user = (User)session.getAttribute("user");
			userId = user.getUserId();
		}
		return courseService.getListeningCourseInfo(courseId,userId);
	}
	
	//查看口语课程详细信息
	@ResponseBody
	@RequestMapping("/user/getOralCourseInfo")
	public BackJsonUtil getOralCourseInfo(@RequestParam("courseId")Integer courseId,@RequestParam(value="userId",required=false)Integer userId,HttpServletRequest request){
		if(userId==null) {
			session = request.getSession();
			User user = (User)session.getAttribute("user");
			userId = user.getUserId();
		}
		return courseService.getOralCourseInfo(courseId,userId);
	}
	
	//查看阅读课程详细信息
	@ResponseBody
	@RequestMapping("/user/getReadingCourseInfo")
	public BackJsonUtil getReadingCourseInfo(@RequestParam("courseId")Integer courseId,@RequestParam(value="userId",required=false)Integer userId,HttpServletRequest request){
		if(userId==null) {
			session = request.getSession();
			User user = (User)session.getAttribute("user");
			userId = user.getUserId();
		}
		return courseService.getReadingCourseInfo(courseId,userId);
	}
	
	
	//给指定课程添加问题——管理员
	@ResponseBody
	@RequestMapping("/admin/addQuestion")
	public BackJsonUtil addQuestion(@RequestParam("courseType")String courseType,@RequestParam("courseId")Integer courseId,@RequestParam("questionContent")String questionContent,@RequestParam("answerA")String answerA,@RequestParam("answerB")String answerB,@RequestParam("answerC")String answerC,@RequestParam("answerD")String answerD,@RequestParam("answerReal")Integer answerReal,@RequestParam("answerReason")String answerReason) {
		QuestionForSQL question = new QuestionForSQL(0, courseType, courseId, questionContent, answerA,
			answerB, answerC, answerD, answerReal, answerReason);
		return courseService.addQuestion(question);
	}
	
	//给指定课程删除问题——管理员
	@ResponseBody
	@RequestMapping("/admin/deleteQuestion")
	public BackJsonUtil deleteQuestion(@RequestParam("questionId")Integer questionId) {
		return courseService.deleteQuestion(questionId);
	}
	
	//修改指定课程的表单回显
	@ResponseBody
	@RequestMapping("/admin/toChangeQuestion")
	public BackJsonUtil toChangeQuestion(@RequestParam("questionId")Integer questionId) {
		return courseService.toChangeQuestion(questionId);
	}
	
	//修改指定课程的问题——管理员
	@ResponseBody
	@RequestMapping("/admin/changeQuestion")
	public BackJsonUtil changeQuestion(@RequestParam("questionId")Integer questionId,@RequestParam("courseType")String courseType,@RequestParam("courseId")Integer courseId,@RequestParam("questionContent")String questionContent,@RequestParam("answerA")String answerA,@RequestParam("answerB")String answerB,@RequestParam("answerC")String answerC,@RequestParam("answerD")String answerD,@RequestParam("answerReal")Integer answerReal,@RequestParam("answerReason")String answerReason) {
		QuestionForSQL question = new QuestionForSQL(questionId, courseType, courseId, questionContent, answerA,
				answerB, answerC, answerD, answerReal, answerReason);
		return courseService.changeQuestion(question);
	}
	
	//查看指定课程的所有问题——管理员
	@ResponseBody
	@RequestMapping("/admin/getAllQuestion")
	public BackJsonUtil getAllQuestion(@RequestParam("courseType")String courseType,@RequestParam("courseId")Integer courseId) {
		return courseService.getAllQuestion(courseType,courseId);
	}
	
	//查看指定课程的所有问题——用户
	@ResponseBody
	@RequestMapping("/user/getAllQuestion")
	public BackJsonUtil getAllQuestionByUser(@RequestParam("courseType")String courseType,@RequestParam("courseId")Integer courseId) {
		return courseService.getAllQuestion(courseType,courseId);
	}
	
	
	//添加评分等级——用户
	@ResponseBody
	@RequestMapping("/user/addEvaluation")
	public BackJsonUtil addEvaluation(@RequestParam("courseType")String courseType,@RequestParam("courseId")Integer courseId,@RequestParam(value="userId",required=false)Integer userId,@RequestParam("evaluationLevel")int evaluationLevel,HttpServletRequest request) {
		if(userId==null) {
			session = request.getSession();
			User user = (User)session.getAttribute("user");
			userId = user.getUserId();
		}
		EvaluationFormForSQL evaluationFormForSQL = new EvaluationFormForSQL(0,courseType,courseId,userId,evaluationLevel);
		return courseService.addEvaluation(evaluationFormForSQL);
	}
	
	//删除评分记录——管理员
	//删除评分记录——用户
	@ResponseBody
	@RequestMapping(value= {"/user/deleteEvaluation","/admin/deleteEvaluation"})
	public BackJsonUtil deleteEvaluation(@RequestParam("evaluationId")Integer evaluationId) {
		return courseService.deleteEvaluation(evaluationId);
	}
	
	//查看课程的综合评分——管理员
	//查看课程的综合评分——用户
	@ResponseBody
	@RequestMapping(value= {"/user/getAvgEvaluation","/admin/getAvgEvaluation"})
	public BackJsonUtil getAvgEvaluationByUser(@RequestParam("courseType")String courseType,@RequestParam("courseId")Integer courseId) {
		return courseService.getAvgEvaluation(courseType,courseId);
	}
	
	//查看指定课程的评分列表(分页)——管理员
	//查看指定课程的评分列表(分页)——用户
	@ResponseBody
	@RequestMapping(value= {"/user/getAllEvaluationOfCourse/{pageNum}","/admin/getAllEvaluationOfCourse/{pageNum}"})
	public BackJsonUtil getAllEvaluationOfCourse(@PathVariable("pageNum")Integer pageNum,@RequestParam("courseType")String courseType,@RequestParam("courseId")Integer courseId) {
		return courseService.getAllEvaluationOfCourse(pageNum,courseType,courseId);
	}
	
	//查看指定用户的所有评分信息(分页)——用户
	@ResponseBody
	@RequestMapping("/user/getAllEvaluationOfUser/{pageNum}")
	public BackJsonUtil getAllEvaluationOfUser(@PathVariable("pageNum")Integer pageNum,@RequestParam("userId")Integer userId,HttpServletRequest request) {
		if(userId==null) {
			session = request.getSession();
			User user = (User)session.getAttribute("user");
			userId = user.getUserId();
		}
		return courseService.getAllEvaluationOfUser(pageNum,userId);
	}
	
	//删除浏览历史——用户
	//删除浏览历史——管理员
	@ResponseBody
	@RequestMapping(value= {"/user/deleteHistoryRecording","/admin/deleteHistoryRecording"})
	public BackJsonUtil deleteHistoryRecording(@RequestParam("historyRecordingId")Integer historyRecordingId) {
		return courseService.deleteHistoryRecording(historyRecordingId);
	}
	
	//查看指定用户的浏览历史（分页）——用户
	//查看指定用户的浏览历史（分页）——管理员
	@ResponseBody
	@RequestMapping(value= {"/user/getHistoryRecordingOfUser/{pageNum}","/admin/getHistoryRecordingOfUser/{pageNum}"})
	public BackJsonUtil getHistoryRecordingOfUser(@PathVariable("pageNum")Integer pageNum,@RequestParam(value="userId",required=false)Integer userId,HttpServletRequest request) {
		if(userId==null) {
			session = request.getSession();
			User user = (User)session.getAttribute("user");
			userId = user.getUserId();
		}
		return courseService.getHistoryRecordingOfUser(pageNum,userId);
	}
	
	//查看指定用户指定口语课程历史分数——用户
	@ResponseBody
	@RequestMapping("/user/getScoreOfUserForOralCourse")
	public BackJsonUtil getScoreOfUserForOralCourse(@RequestParam("courseType")String courseType,@RequestParam("courseId")Integer courseId,@RequestParam(value="userId",required=false)Integer userId,HttpServletRequest request) {
		if(userId==null) {
			session = request.getSession();
			User user = (User)session.getAttribute("user");
			userId = user.getUserId();
		}
		return courseService.getScoreOfUserForOralCourse(courseType,courseId,userId);
	}
	
	//添加口语课程分数——用户
	@ResponseBody
	@RequestMapping("/user/addOralCourseScore")
	public BackJsonUtil addOralCourseScore(@RequestParam("courseType")String courseType,@RequestParam("courseId")Integer courseId,@RequestParam(value="userId",required=false)Integer userId,@RequestParam("oralScore")Integer oralScore,HttpServletRequest request) {
		if(userId==null) {
			session = request.getSession();
			User user = (User)session.getAttribute("user");
			userId = user.getUserId();
		}
		return courseService.addOralCourseScore(courseType,courseId,userId,oralScore);
	}
	
	//查看指定用户口语课程平均分数——用户
	//查看指定用户口语课程平均分数——管理员
	@ResponseBody
	@RequestMapping(value= {"/user/getAvgOralCourseScoreOfUser","/admin/getAvgOralCourseScoreOfUser"})
	public BackJsonUtil getAvgOralCourseScoreOfUser(@RequestParam(value="userId",required=false)Integer userId,HttpServletRequest request) {
		if(userId==null) {
			session = request.getSession();
			User user = (User)session.getAttribute("user");
			userId = user.getUserId();
		}
		return courseService.getAvgOralCourseScoreOfUser(userId);
	}
	
	
	
}

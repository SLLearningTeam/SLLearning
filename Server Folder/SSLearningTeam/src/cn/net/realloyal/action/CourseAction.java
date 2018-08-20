package cn.net.realloyal.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/course")
public class CourseAction {

	//获取课程列表——管理员
	@RequestMapping("/admin/courses_manage")
	public ModelAndView getCoursesManage() {
		ModelAndView mv = new ModelAndView("admin/resourceManager/courses_manage");
		return mv;
	}
	
	//获取课程添加页面——管理员
	@RequestMapping("/admin/toaddcourses")
	public ModelAndView toAddCourses() {
		ModelAndView mv = new ModelAndView("admin/resourceManager/addCourses");
		return mv;
	}
	//获取课程修改页面——管理员
	@RequestMapping("/admin/toupdatecourses")
	public ModelAndView toUpdateCourses() {
		ModelAndView mv = new ModelAndView("admin/resourceManager/UpdateCourses");
		return mv;
	}
}

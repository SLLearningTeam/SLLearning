package cn.net.realloyal.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/course")
public class CourseAction {

	@RequestMapping("/courses_manage")
	public ModelAndView getCoursesManage() {
		ModelAndView mv = new ModelAndView("admin/resourceManager/courses_manage");
		return mv;
	}
}

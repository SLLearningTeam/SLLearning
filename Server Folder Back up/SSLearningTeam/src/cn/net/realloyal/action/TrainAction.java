package cn.net.realloyal.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/train")
public class TrainAction{

	@RequestMapping("/trains_manage")
	public ModelAndView getTrainsManage() {
		ModelAndView mv = new ModelAndView("admin/resourceManager/trains_manage");
		return mv;
	}
	
}

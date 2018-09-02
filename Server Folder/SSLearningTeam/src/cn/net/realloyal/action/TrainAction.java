package cn.net.realloyal.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/train")
public class TrainAction{
	
	//跳转添加模拟套题页面
	
	//添加模拟套题信息
	
	//删除模拟套题信息
	
	//修改模拟套题信息
	
	//查询模拟套题列表()
	
	//
	

	@RequestMapping("/trains_manage")
	public ModelAndView getTrainsManage() {
		ModelAndView mv = new ModelAndView("admin/resourceManager/trains_manage");
		return mv;
	}
	
}

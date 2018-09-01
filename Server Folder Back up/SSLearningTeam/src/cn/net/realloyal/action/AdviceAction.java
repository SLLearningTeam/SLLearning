package cn.net.realloyal.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.net.realloyal.core.util.BackJsonUtil;
import cn.net.realloyal.model.AdviceInfoList;
import cn.net.realloyal.model.User;
import cn.net.realloyal.service.AdviceService;
import cn.net.realloyal.vo.AdviceInfoListForSQL;

@Controller
@RequestMapping("/advice")
public class AdviceAction {
	@Autowired
	private AdviceService adviceService;
	
	HttpSession session;
	
	//上传意见——用户
	@ResponseBody
	@RequestMapping("/user/addAdvice")
	public BackJsonUtil addAdvice(@RequestParam(value="userId",required=false)Integer userId,@RequestParam("adviceInfo")String adviceInfo,HttpServletRequest request) {
		if(userId==null) {
			session = request.getSession();
			User user = (User)session.getAttribute("user");
			userId = user.getUserId();
		}
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String date =dateFormat.format(new Date());
		AdviceInfoListForSQL adviceInfoListForSQL = new AdviceInfoListForSQL(0,userId,date,adviceInfo);
		return adviceService.addAdvice(adviceInfoListForSQL);
	}
	
	//删除意见——管理员
	@ResponseBody
	@RequestMapping("/admin/deleteAdvice")
	public BackJsonUtil deleteAdvice(@RequestParam("adviceId")Integer adviceId) {
		return adviceService.deleteAdvice(adviceId);
	}
	
	//删除意见——用户
	@ResponseBody
	@RequestMapping("/user/deleteAdvice")
	public BackJsonUtil deleteAdviceByUser(@RequestParam("adviceId")Integer adviceId) {
		return adviceService.deleteAdvice(adviceId);
	}
	
	//查看所有意见(分页)——管理员
	@RequestMapping("/admin/advices_manage/{pageNum}")
	public ModelAndView getAllAdvice(@PathVariable(value="pageNum")Integer pageNum)
	{
		ModelAndView mv = new ModelAndView("admin/websiteManager/advices_manage");
		mv.addObject("pageName", "adminManage");
		List<AdviceInfoList> adviceInfoLists = adviceService.getAllAdvice(pageNum);
		mv.addObject("adviceInfoLists", adviceInfoLists);
		int pageNumeber = adviceService.getAllAdvicePageNumber();
		//System.out.println("后台取到pageNumber:"+pageNumeber);
		mv.addObject("pageNumeber", pageNumeber);
		mv.addObject("currentPage", pageNum);
		System.out.println("pageNum:"+pageNum+"\n\ntotalPages:"+pageNumeber+"\n\nadviceInfoLists:"+adviceInfoLists);
		return mv;//返回pageName用于导航栏显示选中；adviceInfoLists表示所有建议
	}
	
	//根据用户Id查看意见(分页)——管理员
	@RequestMapping("/admin/advices_manageByUserId/{pageNum}")
	public ModelAndView getAllAdviceByUserId(@PathVariable(value="pageNum")Integer pageNum,@RequestParam("userId")Integer userId)
	{
		ModelAndView mv = new ModelAndView("admin/websiteManager/advices_manage");
		mv.addObject("pageName", "adminManage");
		List<AdviceInfoList> adviceInfoLists = adviceService.getAllAdviceByUserId(pageNum,userId);
		mv.addObject("adviceInfoLists", adviceInfoLists);
		int pageNumeber = adviceService.getAllAdvicePageNumberByUserId(userId);
		//System.out.println("后台取到pageNumber:"+pageNumeber);
		mv.addObject("pageNumeber", pageNumeber);
		mv.addObject("currentPage", pageNum);
		System.out.println("pageNum:"+pageNum+"\n\ntotalPages:"+pageNumeber+"\n\nadviceInfoLists:"+adviceInfoLists);
		return mv;//返回pageName用于导航栏显示选中；adviceInfoLists表示所有建议
	}
	
	//根据用户Id查看意见(分页)——用户
	@ResponseBody
	@RequestMapping("/user/getAdviceByUserId/{pageNum}")
	public BackJsonUtil getAdviceByUserId(@PathVariable(value="pageNum")Integer pageNum,@RequestParam(value="userId",required=false)Integer userId,HttpServletRequest request)
	{
		if(userId==null) {
			session = request.getSession();
			User user = (User)session.getAttribute("user");
			userId = user.getUserId();
		}
		return adviceService.getAdviceByUserId(pageNum,userId);
	}
	
	
	@RequestMapping("/website_monitor")
	public ModelAndView getWebsiteMonitor() {
		ModelAndView mv = new ModelAndView("admin/websiteManager/website_monitor");
		return mv;
	}
	
}

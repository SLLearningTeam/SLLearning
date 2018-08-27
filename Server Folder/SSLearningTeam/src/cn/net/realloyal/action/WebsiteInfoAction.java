package cn.net.realloyal.action;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import cn.net.realloyal.core.util.BackJsonUtil;
import cn.net.realloyal.model.CarouselMap;
import cn.net.realloyal.model.DownloadRecording;
import cn.net.realloyal.model.User;
import cn.net.realloyal.service.WebsiteInfoService;

@Controller
@RequestMapping("/website")
public class WebsiteInfoAction {
	@Autowired
	private WebsiteInfoService websiteInfoService;
	
	HttpSession session;
	
	//轮播图相关
	//获取轮播图上传页面——管理员
	@RequestMapping("/admin/toAddCarouselMap")
	public ModelAndView toAddCarouselMap() {
		ModelAndView mv = new ModelAndView("admin/websiteManager/addCarouselMap");
		//显示管理推荐资源的Active样式
		mv.addObject("pageName","recommendManage");
		return mv;
	}
	
	//轮播图上传接口——管理员
	@RequestMapping("/admin/addCarouselMap")
	public String addCarouselMap(@RequestParam("carouselInstruction")String carouselInstruction,@RequestParam(value="carouselImg") CommonsMultipartFile carouselImg,@RequestParam("carouselLinkUrl")String carouselLinkUrl,HttpServletRequest request) {
		websiteInfoService.addCarouselMap(carouselInstruction,carouselImg,carouselLinkUrl,request);
		return "redirect:/website/admin/carouselMap_manage/1";
	}
	
	//轮播图删除接口JSON——管理员
	@ResponseBody
	@RequestMapping("/admin/deleteCarouselMap")
	public BackJsonUtil deleteCarouselMap(@RequestParam("carouselId")Integer carouselId) {
		return websiteInfoService.deleteCarouselMap(carouselId);
	}
	
	//获取轮播图修改页面——管理员
	@RequestMapping("/admin/toUpdateCarouselMap")
	public ModelAndView toUpdateCarouselMap(@RequestParam("carouselId")Integer carouselId) {
		ModelAndView mv = new ModelAndView("admin/websiteManager/updateCarouselMap");
		//显示管理推荐资源的Active样式
		mv.addObject("pageName","recommendManage");
		//查询当前轮播图的相关信息用于表单回显
		CarouselMap carouselMap = websiteInfoService.getCarouselMapInfo(carouselId);
		mv.addObject("carouselMap",carouselMap);
		System.out.println("carouselMap:"+carouselMap);
		return mv;
	}
	
	//轮播图修改接口——管理员
	@RequestMapping("/admin/updateCarouselMap")
	public String updateCarouselMap(@RequestParam("carouselId")Integer carouselId,@RequestParam("carouselInstruction")String carouselInstruction,@RequestParam(value="carouselImg",required=false) CommonsMultipartFile carouselImg,@RequestParam("carouselLinkUrl")String carouselLinkUrl,HttpServletRequest request) {
		websiteInfoService.updateCarouselMap(carouselId,carouselInstruction,carouselImg,carouselLinkUrl,request);
		return "redirect:/website/admin/carouselMap_manage/1";
	}
	
	//查看轮播图列表(分页)——管理员
	@RequestMapping("/admin/carouselMap_manage/{pageNum}")
	public ModelAndView getCarouselMapManage(@PathVariable("pageNum")Integer pageNum) {
		ModelAndView mv = new ModelAndView("admin/websiteManager/carouselMap_manage");
		//显示管理推荐资源的Active样式
		mv.addObject("pageName","recommendManage");
		//获取Carousel的总显示页数(10个一页)
		int pageNumber = websiteInfoService.getPageNumber();
		mv.addObject("pageNumber", pageNumber);
		//获取当前页号
		mv.addObject("currentPage",pageNum);
		//获取当前页的所有轮播图集合
		List<CarouselMap> carouselMaps = websiteInfoService.getCarouselMap(pageNum);
		mv.addObject("carouselMaps", carouselMaps);
		System.out.println("carouselMaps:"+carouselMaps+"\n\npageNumber:"+pageNumber+"\n\ncurrentPage"+pageNum);
		return mv;
	}
	
	//查看所有轮播图列表——管理员
	@RequestMapping("/admin/carouselMap_manage")
	public ModelAndView getCarouselMapManage() {
		ModelAndView mv = new ModelAndView("admin/websiteManager/carouselMap_manage");
		//显示管理推荐资源的Active样式
		mv.addObject("pageName","recommendManage");
		//获取Carousel的总显示页数(10个一页)
		mv.addObject("pageNumber", 1);
		//获取当前页号
		mv.addObject("currentPage",1);
		//获取当前页的所有轮播图集合
		List<CarouselMap> carouselMaps = websiteInfoService.getAllCarouselMap();
		mv.addObject("carouselMaps", carouselMaps);
		System.out.println("carouselMaps:"+carouselMaps+"\n\npageNumber:"+1+"\n\ncurrentPage"+1);
		return mv;
	}
	
	//查看所有轮播图列表JSON——用户
	@ResponseBody
	@RequestMapping("/user/getCarouselMaps")
	public BackJsonUtil getCarouselMaps() {
		return websiteInfoService.getCarouselMaps();
	}
	
	//分页查看所有下载的记录——管理员
	@RequestMapping("/admin/getDownloadRecordings/{pageNum}")
	public ModelAndView getDownloadRecordings(@PathVariable("pageNum")Integer pageNum){
		ModelAndView mv = new ModelAndView("admin/websiteManager/downloadRecording_manage");
		//显示管理下载列表的Active样式
		mv.addObject("pageName","downloadRecordingManage");
		//获取DownloadRecording的总显示页数(10个一页)
		int allPageNum = websiteInfoService.getDownloadRecordingPageNumber();
		mv.addObject("pageNumber", allPageNum);
		//获取当前页号
		mv.addObject("currentPage",pageNum);
		List<DownloadRecording> downloadRecordings = websiteInfoService.getDownloadRecordings(pageNum);
		//获取下载列表
		mv.addObject("downloadRecordings",downloadRecordings);
		System.out.println("downloadRecordings:"+downloadRecordings+"\n\npageNumber:"+allPageNum+"\n\ncurrentPage"+pageNum);
		return mv;
	}
	
	//删除指定用户指定下载的记录——用户
	//删除指定下载的记录——管理员
	@ResponseBody
	@RequestMapping(value= {"/admin/deleteDownloadRecording","/user/deleteDownloadRecording"})
	public BackJsonUtil deleteDownloadRecording(@RequestParam("downloadRecordingId")Integer downloadRecordingId) {
		return websiteInfoService.deleteDownloadRecording(downloadRecordingId);
	}

	//查看指定用户的所有下载的历史——用户
	@ResponseBody
	@RequestMapping("/user/getDownloadRecordings/{pageNum}")
	public BackJsonUtil getDownloadRecordingsByUser(@PathVariable("pageNum")Integer pageNum,@RequestParam(value="userId",required=false)Integer userId,HttpServletRequest request) {
		if(userId == null ) {
			session = request.getSession();
			User user = (User)session.getAttribute("user");
			userId = user.getUserId();
		}
		return websiteInfoService.getDownloadRecordingsByUser(pageNum,userId);
	}
	
	
	
	
	
	@RequestMapping("/website_monitor")
	public ModelAndView getWebsiteMonitor() {
		ModelAndView mv = new ModelAndView("admin/websiteManager/website_monitor");
		return mv;
	}
}

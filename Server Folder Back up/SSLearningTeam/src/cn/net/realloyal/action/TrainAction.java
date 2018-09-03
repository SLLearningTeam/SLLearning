package cn.net.realloyal.action;

import java.util.List;
import java.util.Map;

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
import cn.net.realloyal.model.LanguageType;
import cn.net.realloyal.model.ListeningCourse;
import cn.net.realloyal.model.SimulatedTest;
import cn.net.realloyal.model.User;
import cn.net.realloyal.service.RateTypeService;
import cn.net.realloyal.service.TrainService;
import cn.net.realloyal.vo.TestQuestionForSQL;
import cn.net.realloyal.vo.TestQuestionResultForSQL;

@Controller
@RequestMapping("/train")
public class TrainAction{
	@Autowired
	private TrainService trainService;
	@Autowired
	private RateTypeService rateTypeService;
	
	private HttpSession session;
	
	//跳转添加模拟套题页面——管理员
	@RequestMapping("/admin/toAddSimulatedTest")
	public ModelAndView toAddSimulatedTest() {
		ModelAndView mv = new ModelAndView("admin/resourceManager/addSimulatedTest");
		mv.addObject("pageName","trainManage");
		List<LanguageType>languageTypes = rateTypeService.getLanguages();
		mv.addObject("languageTypes", languageTypes);
		return mv;
	}
	
	//添加模拟套题信息——管理员
	@RequestMapping("/admin/addSimulatedTest")
	public String addSimulatedTest(@RequestParam("languageTypeId")Integer languageTypeId,@RequestParam("rateTypeId")Integer rateTypeId,@RequestParam("testName")String testName,@RequestParam("instructionImg")CommonsMultipartFile instructionImg,HttpServletRequest request) {
		trainService.addSimulatedTest(languageTypeId,rateTypeId,testName,instructionImg,request);
		return "redirect:/train/admin/simulatedtests_manage/1";
	}
	
	//删除模拟套题信息——管理员
	@ResponseBody
	@RequestMapping("/admin/deleteSimulatedTest")
	public BackJsonUtil deleteSimulatedTest(@RequestParam("simulatedTestId")Integer simulatedTestId) {
		return trainService.deleteSimulatedTest(simulatedTestId);
	}
	
	//查询指定模拟套卷的信息回显——管理员
	@RequestMapping("/admin/toUpdateSimulatedTest")
	public ModelAndView toUpdateListeningCourse(@RequestParam("simulatedTestId")Integer simulatedTestId) {
		ModelAndView mv = new ModelAndView("admin/resourceManager/updateSimulatedTest");
		mv.addObject("pageName","trainManage");
		//查看相关信息用于表单回显
		SimulatedTest simulatedTest = trainService.getSimulatedTestInfo(simulatedTestId);
		mv.addObject("simulatedTest",simulatedTest);
		//返回所有的languageType选项
		List<LanguageType>languageTypes = rateTypeService.getLanguages();
		mv.addObject("languageTypes", languageTypes);
		return mv;
	}
	
	//修改模拟套题信息——管理员
	@RequestMapping("/admin/updateSimulatedTest")
	public String updateSimulatedTest(@RequestParam("simulatedTestId")Integer simulatedTestId,@RequestParam("languageTypeId")Integer languageTypeId,@RequestParam("rateTypeId")Integer rateTypeId,@RequestParam("testName")String testName,@RequestParam(value="instructionImg",required=false)CommonsMultipartFile instructionImg,HttpServletRequest request) {
		trainService.updateSimulatedTest(simulatedTestId,languageTypeId,rateTypeId,testName,instructionImg,request);
		return "redirect:/train/admin/simulatedtests_manage/1";
	}
	
	//查询模拟套题列表(分页)——用户
	@ResponseBody
	@RequestMapping("/user/simulatedtests_manage/{pageNum}")
	public BackJsonUtil getAllSimulatedTestByUser(@PathVariable("pageNum")Integer pageNum) {
		return trainService.getAllSimulatedTestByUser(pageNum);
	}
	
	//查询模拟套题列表(分页)——管理员
	@RequestMapping("/admin/simulatedtests_manage/{pageNum}")
	public ModelAndView getAllSimulatedTest(@PathVariable("pageNum")Integer pageNum) {
		ModelAndView mv = new ModelAndView("admin/resourceManager/simulatedtests_manage");
		mv.addObject("pageName","trainManage");
		//返回综合课程信息
		List<SimulatedTest> simulatedTests = trainService.getAllSimulatedTest(pageNum);
		mv.addObject("simulatedTests", simulatedTests);
		//返回总页数
		int totalPages = trainService.allSimulatedTestTotalPages();
		mv.addObject("totalPages", totalPages);
		//返回当前页面页号
		mv.addObject("pageNum", pageNum);
		System.out.println("pageNum:"+pageNum+"\n\ntotalPages:"+totalPages+"\n\nsimulatedTests:"+simulatedTests);
		return mv;
	}
	
	//查询模拟套题信息的详情(套题信息+所有题目信息)——用户
	@ResponseBody
	@RequestMapping("/user/getAllSimulatedTestById")
	public BackJsonUtil getAllSimulatedTestById(@RequestParam("simulatedTestId")Integer simulatedTestId) {
		return trainService.getAllSimulatedTestById(simulatedTestId);
	}
	
	//根据课程类别查询课程问题——管理员
	@ResponseBody
	@RequestMapping("/admin/getAllQuestionByCourseType")
	public BackJsonUtil getAllQuestionByCourseType(@RequestParam("courseType")String courseType) {
		return trainService.getAllQuestionByCourseType(courseType);
	}
	
	//添加模拟套题的题目——管理员
	@ResponseBody
	@RequestMapping("/admin/addTestQuestion")
	public BackJsonUtil addTestQuestion(@RequestParam("testQuestionName")String testQuestionName,@RequestParam("simulatedTestId")Integer simulatedTestId,@RequestParam("courseType")String courseType,@RequestParam("courseId")Integer courseId) {
		TestQuestionForSQL testQuestionForSQL = new TestQuestionForSQL(0,testQuestionName,simulatedTestId,courseType,courseId);
		return trainService.addTestQuestion(testQuestionForSQL);
	}
	
	//删除模拟套题的题目——管理员
	@ResponseBody
	@RequestMapping("/admin/deleteTestQuestion")
	public BackJsonUtil deleteTestQuestion(@RequestParam("testQuestionId")Integer testQuestionId) {
		return trainService.deleteTestQuestion(testQuestionId);
	}
	
	//查询模拟套题的题目（查全部）——管理员
	@ResponseBody
	@RequestMapping("/admin/getAllTestQuestionBySimulatedTest")
	public BackJsonUtil getAllTestQuestionBySimulatedTest(@RequestParam("simulatedTestId")Integer simulatedTestId) {
		return trainService.getAllTestQuestionBySimulatedTest(simulatedTestId);
	}
	
	//添加指定用户指定模拟套题测试结果[判断之前有没有数据，没有则添加，有则修改]——用户
	@ResponseBody
	@RequestMapping("/user/addTestQuestionResult")
	public BackJsonUtil addTestQuestionResult(@RequestParam(value="userId",required=false)Integer userId,@RequestParam("simulatedTestId")Integer simulatedTestId,@RequestParam("resultScore")Integer resultScore,HttpServletRequest request) {
		if(userId==null) {
			session = request.getSession();
			User user = (User)session.getAttribute("user");
			userId = user.getUserId();
		}
		TestQuestionResultForSQL testQuestionResultForSQL = new TestQuestionResultForSQL(0,userId,simulatedTestId,resultScore);
		return trainService.addTestQuestionResult(testQuestionResultForSQL);
	}
	
	//查询指定用户指定模拟套题测试结果——用户
	@ResponseBody
	@RequestMapping("/user/getTestQuestionResultOfUserOnSimulatedTest")
	public BackJsonUtil getTestQuestionResultOfUserOnSimulatedTest(@RequestParam(value="userId",required=false)Integer userId,@RequestParam("simulatedTestId")Integer simulatedTestId,HttpServletRequest request) {
		if(userId==null) {
			session = request.getSession();
			User user = (User)session.getAttribute("user");
			userId = user.getUserId();
		}
		return trainService.getTestQuestionResultOfUserOnSimulatedTest(userId,simulatedTestId);
	}
	
	//查询指定用户所有模拟套题测试结果平均分——用户
	//查询指定用户所有模拟套题测试结果平均分——管理员
	@ResponseBody
	@RequestMapping(value= {"/user/getAvgTestQuestionResultOfUser","/admin/getAvgTestQuestionResultOfUser"})
	public BackJsonUtil getAvgTestQuestionResultOfUser(@RequestParam(value="userId",required=false)Integer userId,HttpServletRequest request) {
		if(userId==null) {
			session = request.getSession();
			User user = (User)session.getAttribute("user");
			userId = user.getUserId();
		}
		return trainService.getAvgTestQuestionResultOfUser(userId);
	}
	

	@RequestMapping("/trains_manage")
	public ModelAndView getTrainsManage() {
		ModelAndView mv = new ModelAndView("admin/resourceManager/trains_manage");
		return mv;
	}
	
}

package cn.net.realloyal.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cn.net.realloyal.core.util.BackJsonUtil;
import cn.net.realloyal.core.util.CalculateStartIndex;
import cn.net.realloyal.mapper.TrainMapper;
import cn.net.realloyal.model.Question;
import cn.net.realloyal.model.SimulatedTest;
import cn.net.realloyal.model.TestQuestion;
import cn.net.realloyal.model.TestQuestionResult;
import cn.net.realloyal.service.TrainService;
import cn.net.realloyal.vo.OralCourseForSQL;
import cn.net.realloyal.vo.QuestionForSQL;
import cn.net.realloyal.vo.SimulatedTestForSQL;
import cn.net.realloyal.vo.TestQuestionForSQL;
import cn.net.realloyal.vo.TestQuestionResultForSQL;
@Service
public class TrainServiceImpl implements TrainService {
	@Autowired
	private TrainMapper trainMapper;

	@Override
	public void addSimulatedTest(Integer languageTypeId, Integer rateTypeId,String testName,CommonsMultipartFile instructionImg,
			HttpServletRequest request) {
		// 源介绍图片资源文件名
 		String originalInstructionImgName = instructionImg.getOriginalFilename();
 		// 新介绍图片文件名  
         String newInstructionImgName = UUID.randomUUID() + originalInstructionImgName;
        // 获得项目的路径  
        ServletContext sc = request.getSession().getServletContext();  
        // 上传位置  
        String path = sc.getRealPath("/TrainRecourses") + "/"; // 设定文件保存的目录  
        File f = new File(path);  
        if (!f.exists())  
            f.mkdirs();  
        //将介绍图片文件写入磁盘
        if (!instructionImg.isEmpty()) {  
            try {  
                FileOutputStream fos = new FileOutputStream(path + newInstructionImgName);  
                InputStream in = instructionImg.getInputStream();  
                int b = 0;  
                while ((b = in.read()) != -1) {  
                    fos.write(b);  
                }  
                fos.close();  
                in.close();  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }
        String sourcePath = sc.getContextPath()+"/TrainRecourses/";
        String instructionImgUrl=sourcePath+newInstructionImgName;
        SimulatedTestForSQL simulatedTestForSQL = new SimulatedTestForSQL(0,languageTypeId,rateTypeId,testName,instructionImgUrl);
		trainMapper.addSimulatedTest(simulatedTestForSQL);
	}

	@Override
	public BackJsonUtil deleteSimulatedTest(Integer simulatedTestId) {
		int status = trainMapper.deleteSimulatedTest(simulatedTestId);
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		if(status!=0) {
			backJsonUtil.setStatus(true);
			backJsonUtil.setInfo("删除成功");
		}else {
			backJsonUtil.setStatus(false);
			backJsonUtil.setInfo("删除失败");
		}
		return backJsonUtil;
	}

	@Override
	public SimulatedTest getSimulatedTestInfo(Integer simulatedTestId) {
		return trainMapper.getSimulatedTestInfo(simulatedTestId);
	}

	@Override
	public void updateSimulatedTest(Integer simulatedTestId, Integer languageTypeId, Integer rateTypeId,
			String testName, CommonsMultipartFile instructionImg, HttpServletRequest request) {
		SimulatedTestForSQL simulatedTestForSQL=null;
		// 获得项目的路径  
        ServletContext sc = request.getSession().getServletContext();  
        // 上传位置  
        String path = sc.getRealPath("/TrainRecourses") + "/"; // 设定文件保存的目录  
        File f = new File(path);  
        if (!f.exists())  
            f.mkdirs();  
        //资源基本路径
        String sourcePath = sc.getContextPath()+"/TrainRecourses/";
		if(!instructionImg.isEmpty()) {
			// 源介绍图片资源文件名
	 		String originalInstructionImgName = instructionImg.getOriginalFilename();
	 		// 新介绍图片文件名  
	         String newInstructionImgName = UUID.randomUUID() + originalInstructionImgName;
	        //将介绍图片文件写入磁盘
            try {  
                FileOutputStream fos = new FileOutputStream(path + newInstructionImgName);  
                InputStream in = instructionImg.getInputStream();  
                int b = 0;  
                while ((b = in.read()) != -1) {  
                    fos.write(b);  
                }  
                fos.close();  
                in.close();  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
	        String instructionImgUrl=sourcePath+newInstructionImgName;
	        simulatedTestForSQL = new SimulatedTestForSQL(simulatedTestId,languageTypeId,rateTypeId,testName,instructionImgUrl);
	        trainMapper.updateSimulateTestWithImg(simulatedTestForSQL);
		}else {
			simulatedTestForSQL = new SimulatedTestForSQL(simulatedTestId,languageTypeId,rateTypeId,testName,"");
			trainMapper.updateSimulateTestWithoutImg(simulatedTestForSQL);
		}
	}

	@Override
	public List<SimulatedTest> getAllSimulatedTest(Integer pageNum) {
		int startIndex = CalculateStartIndex.getStartIndex(pageNum, 10);
		return trainMapper.getAllSimulatedTest(startIndex);
	}

	@Override
	public int allSimulatedTestTotalPages() {
		int simulatedTestNum=trainMapper.getAllSimulatedTestTotalPagesNum();
		int totalPages;
		if(simulatedTestNum%10==0) {
			totalPages=simulatedTestNum/10;
		}else {
			totalPages=(int)simulatedTestNum/10+1;
		}
		return totalPages;
	}

	@Override
	public BackJsonUtil getAllQuestionByCourseType(String courseType) {
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		List<QuestionForSQL>questions = trainMapper.getAllQuestionByCourseType(courseType);
		if(questions.isEmpty()) {
			backJsonUtil.setStatus(false);
			backJsonUtil.setInfo("该类课程暂没有题库题目");
		}else {
			backJsonUtil.setStatus(true);
			backJsonUtil.setInfo(questions);
		}
		return backJsonUtil;
	}

	@Override
	public BackJsonUtil addTestQuestion(TestQuestionForSQL testQuestionForSQL) {
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		int count = trainMapper.addTestQuestion(testQuestionForSQL);
		if(count == 0) {
			backJsonUtil.setStatus(false);
			backJsonUtil.setInfo("添加失败");
		}else {
			backJsonUtil.setStatus(true);
			backJsonUtil.setInfo("添加成功");
		}
		return backJsonUtil;
	}

	@Override
	public BackJsonUtil deleteTestQuestion(Integer testQuestionId) {
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		int count = trainMapper.deleteTestQuestion(testQuestionId);
		if(count == 0) {
			backJsonUtil.setStatus(false);
			backJsonUtil.setInfo("删除失败");
		}else {
			backJsonUtil.setStatus(true);
			backJsonUtil.setInfo("删除成功");
		}
		return backJsonUtil;
	}

	@Override
	public BackJsonUtil getAllTestQuestionBySimulatedTest(Integer simulatedTestId) {
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		List<TestQuestionForSQL>testQuestions = trainMapper.getAllTestQuestionBySimulatedTest(simulatedTestId);
		if(testQuestions.isEmpty()) {
			backJsonUtil.setStatus(false);
			backJsonUtil.setInfo("该套模拟题暂没有添加问题");
		}else {
			backJsonUtil.setStatus(true);
			backJsonUtil.setInfo(testQuestions);
		}
		return backJsonUtil;
	}

	@Override
	public BackJsonUtil addTestQuestionResult(TestQuestionResultForSQL testQuestionResultForSQL) {
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		TestQuestionResultForSQL TestQuestionResult = trainMapper.getTestQuestionResultOfUserOnSimulatedTest(testQuestionResultForSQL.getUserId(), testQuestionResultForSQL.getSimulatedTestId());
		int count = 0;
		if(TestQuestionResult==null) {
			count = trainMapper.addTestQuestionResult(testQuestionResultForSQL);
		}else {
			count = trainMapper.updateTestQuestionResult(testQuestionResultForSQL);
		}
		if(count == 0) {
			backJsonUtil.setStatus(false);
			backJsonUtil.setInfo("添加失败");
		}else {
			backJsonUtil.setStatus(true);
			backJsonUtil.setInfo("添加成功");
		}
		return backJsonUtil;
	}

	@Override
	public BackJsonUtil getTestQuestionResultOfUserOnSimulatedTest(Integer userId, Integer simulatedTestId) {
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		TestQuestionResultForSQL testQuestionResultForSQL = trainMapper.getTestQuestionResultOfUserOnSimulatedTest(userId,simulatedTestId);
		if(testQuestionResultForSQL == null) {
			backJsonUtil.setStatus(false);
			backJsonUtil.setInfo("用户没有参与模拟测试");
		}else {
			backJsonUtil.setStatus(true);
			backJsonUtil.setInfo(testQuestionResultForSQL.getResultScore());
		}
		return backJsonUtil;
	}

	@Override
	public BackJsonUtil getAvgTestQuestionResultOfUser(Integer userId) {
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		Object result  = trainMapper.getAvgTestQuestionResultOfUser(userId);
		if(result == null) {
			backJsonUtil.setStatus(false);
			backJsonUtil.setInfo("用户没有模拟题测试结果");
		}else {
			backJsonUtil.setStatus(true);
			backJsonUtil.setInfo(result);
		}
		return backJsonUtil;
	}

	@Override
	public BackJsonUtil getAllSimulatedTestById(Integer simulatedTestId) {
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		SimulatedTest simulatedTest = trainMapper.getAllSimulatedTestById(simulatedTestId);
		List<QuestionForSQL> questions = trainMapper.getAllQuestionBySimulatedTest(simulatedTestId);
		if(simulatedTest == null) {
			backJsonUtil.setStatus(false);
			backJsonUtil.setInfo("模拟测试查询有误");
		}else {
			if(questions.isEmpty()) {
				backJsonUtil.setStatus(false);
				backJsonUtil.setInfo("该模拟试题暂未添加题目");
			}else {
				backJsonUtil.setStatus(true);
				Map<String,Object> result = new HashMap<String,Object>();
				result.put("simulatedTest", simulatedTest);
				result.put("questions", questions);
				backJsonUtil.setInfo(result);
			}
		}
		return backJsonUtil;
	}

	@Override
	public BackJsonUtil getAllSimulatedTestByUser(Integer pageNum) {
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		List<SimulatedTest> simulatedTests = getAllSimulatedTest(pageNum);
		int simulatedTestNum=trainMapper.getAllSimulatedTestTotalPagesNum();
		int totalPages;
		if(simulatedTestNum%10==0) {
			totalPages=simulatedTestNum/10;
		}else {
			totalPages=(int)simulatedTestNum/10+1;
		}
		if(simulatedTestNum == 0) {
			backJsonUtil.setStatus(false);
			backJsonUtil.setInfo("暂时没有模拟套题记录");
		}else {
			backJsonUtil.setStatus(true);
			Map<String,Object> result =new HashMap<String,Object>();
			result.put("simulatedTests", simulatedTests);
			result.put("currentPage", pageNum);
			result.put("totalPages", totalPages);
			backJsonUtil.setInfo(result);
		}
		return backJsonUtil;
	}
}

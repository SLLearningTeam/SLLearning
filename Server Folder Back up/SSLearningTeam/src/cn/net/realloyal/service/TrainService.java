package cn.net.realloyal.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cn.net.realloyal.core.util.BackJsonUtil;
import cn.net.realloyal.model.SimulatedTest;
import cn.net.realloyal.vo.TestQuestionForSQL;
import cn.net.realloyal.vo.TestQuestionResultForSQL;

@Service
public interface TrainService {

	void addSimulatedTest(Integer languageTypeId, Integer rateTypeId, String testName, CommonsMultipartFile instructionImg,
			HttpServletRequest request);

	BackJsonUtil deleteSimulatedTest(Integer simulatedTestId);

	SimulatedTest getSimulatedTestInfo(Integer simulatedTestId);

	void updateSimulatedTest(Integer simulatedTestId, Integer languageTypeId, Integer rateTypeId, String testName,
			CommonsMultipartFile instructionImg, HttpServletRequest request);

	List<SimulatedTest> getAllSimulatedTest(Integer pageNum);

	int allSimulatedTestTotalPages();

	BackJsonUtil getAllQuestionByCourseType(String courseType);

	BackJsonUtil addTestQuestion(TestQuestionForSQL testQuestionForSQL);

	BackJsonUtil deleteTestQuestion(Integer testQuestionId);

	BackJsonUtil getAllTestQuestionBySimulatedTest(Integer simulatedTestId);

	BackJsonUtil addTestQuestionResult(TestQuestionResultForSQL testQuestionResultForSQL);

	BackJsonUtil getTestQuestionResultOfUserOnSimulatedTest(Integer userId, Integer simulatedTestId);

	BackJsonUtil getAvgTestQuestionResultOfUser(Integer userId);

	BackJsonUtil getAllSimulatedTestById(Integer simulatedTestId);

	BackJsonUtil getAllSimulatedTestByUser(Integer pageNum);

}

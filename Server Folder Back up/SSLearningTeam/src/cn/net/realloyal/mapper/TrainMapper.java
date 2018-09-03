package cn.net.realloyal.mapper;

import java.util.List;

import cn.net.realloyal.model.Question;
import cn.net.realloyal.model.SimulatedTest;
import cn.net.realloyal.model.TestQuestion;
import cn.net.realloyal.vo.QuestionForSQL;
import cn.net.realloyal.vo.SimulatedTestForSQL;
import cn.net.realloyal.vo.TestQuestionForSQL;
import cn.net.realloyal.vo.TestQuestionResultForSQL;

public interface TrainMapper {

	void addSimulatedTest(SimulatedTestForSQL simulatedTestForSQL);

	int deleteSimulatedTest(Integer simulatedTestId);

	SimulatedTest getSimulatedTestInfo(Integer simulatedTestId);

	void updateSimulateTestWithImg(SimulatedTestForSQL simulatedTestForSQL);

	void updateSimulateTestWithoutImg(SimulatedTestForSQL simulatedTestForSQL);

	int getAllSimulatedTestTotalPagesNum();

	List<SimulatedTest> getAllSimulatedTest(int startIndex);

	List<QuestionForSQL> getAllQuestionByCourseType(String courseType);

	int addTestQuestion(TestQuestionForSQL testQuestionForSQL);

	int deleteTestQuestion(Integer testQuestionId);

	List<TestQuestionForSQL> getAllTestQuestionBySimulatedTest(Integer simulatedTestId);

	int addTestQuestionResult(TestQuestionResultForSQL testQuestionResultForSQL);

	TestQuestionResultForSQL getTestQuestionResultOfUserOnSimulatedTest(Integer userId, Integer simulatedTestId);

	Object getAvgTestQuestionResultOfUser(Integer userId);

	SimulatedTest getAllSimulatedTestById(Integer simulatedTestId);

	List<QuestionForSQL> getAllQuestionBySimulatedTest(Integer simulatedTestId);

	int updateTestQuestionResult(TestQuestionResultForSQL testQuestionResultForSQL);

}

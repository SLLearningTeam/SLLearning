package cn.net.realloyal.mapper;

import java.util.List;

import cn.net.realloyal.model.EvaluationForm;
import cn.net.realloyal.model.HistoryRecording;
import cn.net.realloyal.model.ListeningCourse;
import cn.net.realloyal.model.OralCourse;
import cn.net.realloyal.model.ReadingCourse;
import cn.net.realloyal.model.SubscriptionRecording;
import cn.net.realloyal.vo.EvaluationFormForSQL;
import cn.net.realloyal.vo.HistoryRecordingForSQL;
import cn.net.realloyal.vo.ListeningCourseForSQL;
import cn.net.realloyal.vo.OralCourseForSQL;
import cn.net.realloyal.vo.OralCourseScoreForSQL;
import cn.net.realloyal.vo.QuestionForSQL;
import cn.net.realloyal.vo.ReadingCourseForSQL;
import cn.net.realloyal.vo.SubscriptionRecordingForSQL;

public interface CourseMapper {

	void addListeningCourse(ListeningCourseForSQL listeningCourse);

	void addOralCourse(OralCourseForSQL oralCourse);

	void addReadingCourse(ReadingCourseForSQL readingCourse);

	int deleteListeningCourse(Integer courseId);

	int deleteOralCourse(Integer courseId);

	int deleteReadingCourse(Integer courseId);

	ListeningCourse getListeningCourseInfo(Integer courseId);

	OralCourse getOralCourseInfo(Integer courseId);

	ReadingCourse getReadingCourseInfo(Integer courseId);

	void updateListeningCourseWithRousourceWithImg(ListeningCourseForSQL listeningCourse);

	void updateListeningCourseWithRousourceWithoutImg(ListeningCourseForSQL listeningCourse);

	void updateListeningCourseWithoutRousourceWithImg(ListeningCourseForSQL listeningCourse);

	void updateListeningCourseWithoutRousourceWithoutImg(ListeningCourseForSQL listeningCourse);

	void updateOralCourseWithImg(OralCourseForSQL oralCourse);

	void updateOralCourseWithoutImg(OralCourseForSQL oralCourse);

	void updateReadingCourseWithImg(ReadingCourseForSQL readingCourse);

	void updateReadingCourseWithoutImg(ReadingCourseForSQL readingCourse);

	//获取所有听力课程个数
	int getListeningCoursesNum();
	//获取所有口语课程个数
	int getOralCoursesNum();
	//获取所有阅读课程个数
	int getReadingCoursesNum();

	//获取指定索引的听力课程
	List<ListeningCourse> getListeningCourses(int startIndex, int needNum);

	//获取指定索引的口语课程
	List<OralCourse> getOralCourses(int startIndex, int needNum);

	//获取指定索引的阅读课程
	List<ReadingCourse> getReadingCourses(int startIndex, int needNum);

	List<ListeningCourse> getListeningCoursesByDownload(int startIndex, int needNum);

	//取听力课程的总页数——通过语言类别筛选
	int getListeningCoursesNumByLanguageType(Integer languageTypeId);

	//取听力课程的总页数——通过种类类别筛选
	int getListeningCoursesNumByRateType(Integer rateTypeId);

	//通过语言类别，取听力类型课程的内容
	List<ListeningCourse> getListeningCoursesByLanguageType(int startIndex, int i, Integer languageTypeId);

	//通过种类类别，取听力类型课程的内容
	List<ListeningCourse> getListeningCoursesByRateType(int startIndex, int i, Integer rateTypeId);
	
	//通过下载量排序，获取指定索引的口语课程
	List<OralCourse> getOralCoursesByDownload(int startIndex, int needNum);

	//通过下载量排序，获取指定索引的阅读课程
	List<ReadingCourse> getReadingCoursesByDownload(int startIndex, int needNum);

	//通过语言类别，取口语类型课程的内容
	List<OralCourse> getOralCoursesByLanguageType(int startIndex, int needNum, Integer languageTypeId);

	//通过语言类别，取阅读类型课程的内容
	List<ReadingCourse> getReadingCoursesByLanguageType(int startIndex, int needNum, Integer languageTypeId);

	//取口语课程的总页数——通过语言类别筛选
	int getOralCoursesNumByLanguageType(Integer languageTypeId);

	//取阅读课程的总页数——通过语言类别筛选
	int getReadingCoursesNumByLanguageType(Integer languageTypeId);

	//通过种类类别，取口语类型课程的内容
	List<OralCourse> getOralCoursesByRateType(int startIndex, int needNum, Integer rateTypeId);

	//通过种类类别，取阅读类型课程的内容
	List<ReadingCourse> getReadingCoursesByRateType(int startIndex, int needNum, Integer rateTypeId);

	//取口语课程的总页数——通过种类类别筛选
	int getOralCoursesNumByRateType(Integer rateTypeId);

	//取阅读课程的总页数——通过种类类别筛选
	int getReadingCoursesNumByRateType(Integer rateTypeId);

	//给课程添加问题
	int addQuestion(QuestionForSQL question);

	//删除课程问题
	int deleteQuestion(Integer questionId);

	//修改课程问题
	int changeQuestion(QuestionForSQL question);

	//通过ID获得问题
	QuestionForSQL getQuestionById(Integer questionId);

	//获得该课程的所有问题
	List<QuestionForSQL> getAllQuestion(String courseType, Integer courseId);

	//添加评分
	int addEvaluation(EvaluationFormForSQL evaluationFormForSQL);

	//删除评分
	int deleteEvaluation(Integer evaluationId);

	//获得课程的平均分
	Object getAvgEvaluation(String courseType, Integer courseId);

	//获得指定用户的所有评价（分页）
	List<EvaluationForm> getAllEvaluationOfUser(int startNum, Integer userId);

	//获得指定用户的所有评价个数
	int getAllEvaluationPageNumberOfUser(Integer userId);

	//获得指定课程的所有评价（分页）
	List<EvaluationForm> getAllEvaluationOfCourse(int startNum, String courseType, Integer courseId);

	//获得指定课程的所有评价个数
	int getAllEvaluationPageNumberOfCourse(String courseType, Integer courseId);

	//添加历史记录
	int addHistoryRecording(Integer userId, String courseType, Integer courseId, String nowDateTime, int viewTimes);

	//查看是否存在指定课程的历史记录
	HistoryRecordingForSQL checkHistoryRecordingExist(Integer userId, String string, Integer courseId);

	//修改历史记录
	void updateHistoryRecording(int userId, String courseType, int courseId, String nowDateTime, int viewTimes,int historyRecordingId);

	//删除历史记录
	int deleteHistoryRecording(Integer historyRecordingId);

	//指定用户浏览记录
	List<HistoryRecording> getHistoryRecordingOfUser(int startNum, Integer userId);
	
	//指定用户总浏览个数
	int getHistoryRecordingCountOfUser(Integer userId);

	//获取指定用户指定课程的口语测评成绩
	OralCourseScoreForSQL getScoreOfUserForOralCourse(String courseType, Integer courseId, Integer userId);

	//添加口语测评成绩
	int addOralCourseScore(String courseType, Integer courseId, Integer userId, Integer oralScore);

	//更新口语测评成绩
	int updateOralCourseScore(String courseType, Integer courseId, Integer userId, Integer oralScore,
			int oralCourseScoreId);

	//获得指定用户口语测评的平均成绩
	Object getAvgOralCourseScoreOfUser(Integer userId);

	//获取指定用户的指定课程订阅记录
	SubscriptionRecordingForSQL checkSubscriptionRecordingOfUser(String courseType, Integer courseId, Integer userId);

	//添加订阅记录
	int addSubscriptionRecording(SubscriptionRecordingForSQL record);

	//更新订阅记录
	int updateSubscriptionRecording(SubscriptionRecordingForSQL subscriptionRecordingForSQL);

	//删除订阅记录
	int deleteSubscriptionRecording(Integer subscriptionRecordingId);

	//获得指定用户所有的订阅记录个数
	int getSubscriptionRecordingCountOfUser(Integer userId);

	//获得指定用户所有的订阅记录
	List<SubscriptionRecording> getSubscriptionRecordingOfUser(int startNum, Integer userId);

	//获得指定课程所有的被订阅记录个数
	int getSubscriptionRecordingCountOfCourse(String courseType, Integer courseId);

	//获得指定课程所有的被订阅记录
	List<SubscriptionRecording> getSubscriptionRecordingOfCourse(int startNum, String courseType, Integer courseId);


}

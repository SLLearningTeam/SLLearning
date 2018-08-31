package cn.net.realloyal.mapper;

import java.util.List;

import cn.net.realloyal.model.ListeningCourse;
import cn.net.realloyal.model.OralCourse;
import cn.net.realloyal.model.ReadingCourse;
import cn.net.realloyal.vo.ListeningCourseForSQL;
import cn.net.realloyal.vo.OralCourseForSQL;
import cn.net.realloyal.vo.QuestionForSQL;
import cn.net.realloyal.vo.ReadingCourseForSQL;

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

}

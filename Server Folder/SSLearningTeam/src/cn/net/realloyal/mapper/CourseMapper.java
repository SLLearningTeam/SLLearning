package cn.net.realloyal.mapper;

import java.util.List;

import cn.net.realloyal.model.ListeningCourse;
import cn.net.realloyal.model.OralCourse;
import cn.net.realloyal.model.ReadingCourse;
import cn.net.realloyal.vo.ListeningCourseForSQL;
import cn.net.realloyal.vo.OralCourseForSQL;
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

	
	

}

package cn.net.realloyal.mapper;

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
	

}

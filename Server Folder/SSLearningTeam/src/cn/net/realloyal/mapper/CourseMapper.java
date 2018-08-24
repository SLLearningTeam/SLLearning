package cn.net.realloyal.mapper;

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
	
	

}

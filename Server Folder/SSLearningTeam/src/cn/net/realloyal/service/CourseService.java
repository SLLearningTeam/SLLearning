package cn.net.realloyal.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cn.net.realloyal.core.util.BackJsonUtil;
import cn.net.realloyal.model.ListeningCourse;
import cn.net.realloyal.model.OralCourse;
import cn.net.realloyal.model.ReadingCourse;

@Service
public interface CourseService {

	void addListeningCourse(Integer languageTypeId, Integer rateTypeId, String courseName, String courseChineseContent,
			String courseEnglishContent, CommonsMultipartFile courseResource, CommonsMultipartFile instructionImg, HttpServletRequest request);

	void addOralCourse(Integer languageTypeId, Integer rateTypeId, String courseName, String courseChineseContent,
			String courseEnglishContent, CommonsMultipartFile instructionImg, HttpServletRequest request);

	void addReadingCourse(Integer languageTypeId, Integer rateTypeId, String courseName, String courseChineseContent,
			String courseEnglishContent, CommonsMultipartFile instructionImg, HttpServletRequest request);

	BackJsonUtil deleteListeningCourse(Integer courseId);

	BackJsonUtil deleteOralCourse(Integer courseId);

	BackJsonUtil deleteReadingCourse(Integer courseId);

	ListeningCourse getListeningCourseInfo(Integer courseId);

	OralCourse getOralCourseInfo(Integer courseId);

	ReadingCourse getReadingCourseInfo(Integer courseId);

	void updateListeningCourse(Integer courseId,Integer languageTypeId, Integer rateTypeId, String courseName,
			String courseChineseContent, String courseEnglishContent, CommonsMultipartFile courseResource,@RequestParam("downloadNum")Integer downloadNum,
			CommonsMultipartFile instructionImg, HttpServletRequest request);

	void updateOralCourse(Integer courseId,Integer languageTypeId, Integer rateTypeId, String courseName, String courseChineseContent,
			String courseEnglishContent,@RequestParam("downloadNum")Integer downloadNum, CommonsMultipartFile instructionImg, HttpServletRequest request);

	void updateReadingCourse(Integer courseId,Integer languageTypeId, Integer rateTypeId, String courseName, String courseChineseContent,
			String courseEnglishContent,@RequestParam("downloadNum")Integer downloadNum, CommonsMultipartFile instructionImg, HttpServletRequest request);

}

package cn.net.realloyal.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cn.net.realloyal.core.util.BackJsonUtil;

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

}

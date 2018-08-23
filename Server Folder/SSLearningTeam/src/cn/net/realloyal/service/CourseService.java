package cn.net.realloyal.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Service
public interface CourseService {

	void addListeningCourse(Integer languageTypeId, Integer rateTypeId, String courseName, String courseChineseContent,
			String courseEnglishContent, CommonsMultipartFile courseResource, CommonsMultipartFile instructionImg, HttpServletRequest request);

	void addOralCourse(Integer languageTypeId, Integer rateTypeId, String courseName, String courseChineseContent,
			String courseEnglishContent, CommonsMultipartFile instructionImg, HttpServletRequest request);

	void addReadingCourse(Integer languageTypeId, Integer rateTypeId, String courseName, String courseChineseContent,
			String courseEnglishContent, CommonsMultipartFile instructionImg, HttpServletRequest request);

}

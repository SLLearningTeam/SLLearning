package cn.net.realloyal.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cn.net.realloyal.core.util.BackJsonUtil;
import cn.net.realloyal.model.ListeningCourse;
import cn.net.realloyal.model.OralCourse;
import cn.net.realloyal.model.ReadingCourse;
import cn.net.realloyal.vo.EvaluationFormForSQL;
import cn.net.realloyal.vo.QuestionForSQL;

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

	Map<String, List> getAllTypeCourses(Integer pageNum);

	int allTypesTotalPages();

	BackJsonUtil getCoursesManageByUser(Integer pageNum);

	Map<String, List> getListeningCourses(Integer pageNum);

	int getListeningCoursesTotalPages();

	Map<String, List> getListeningCoursesByDownload(Integer pageNum);

	BackJsonUtil getListeningCourses_manageByUser(Integer pageNum);

	BackJsonUtil getListeningCourses_manageByDownloadByUser(Integer pageNum);

	Map<String, List> getListeningCoursesByLanguageType(Integer pageNum, Integer languageTypeId);

	int getListeningCoursesTotalPagesByLanguageType(Integer languageTypeId);

	Map<String, List> getListeningCourses_manageByRateType(Integer pageNum, Integer rateTypeId);

	int getListeningCoursesTotalPagesByRateType(Integer rateTypeId);

	BackJsonUtil getListeningCourses_manageByLanguageTypeByUser(Integer pageNum, Integer languageTypeId);

	BackJsonUtil getListeningCourses_manageByRateTypeByUser(Integer pageNum, Integer rateTypeId);

	Map<String, List> getOralCourses(Integer pageNum);

	int getOralCoursesTotalPages();

	Map<String, List> getReadingCourses(Integer pageNum);

	int getReadingCoursesTotalPages();

	BackJsonUtil getOralCourses_manageByUser(Integer pageNum);

	BackJsonUtil getReadingCourses_manageByUser(Integer pageNum);

	Map<String, List> getOralCoursesByDownload(Integer pageNum);

	Map<String, List> getReadingCoursesByDownload(Integer pageNum);

	BackJsonUtil getOralCourses_manageByDownloadByUser(Integer pageNum);

	BackJsonUtil getReadingCourses_manageByDownloadByUser(Integer pageNum);

	Map<String, List> getOralCoursesByLanguageType(Integer pageNum, Integer languageTypeId);

	int getOralCoursesTotalPagesByLanguageType(Integer languageTypeId);

	Map<String, List> getReadingCoursesByLanguageType(Integer pageNum, Integer languageTypeId);

	int getReadingCoursesTotalPagesByLanguageType(Integer languageTypeId);

	BackJsonUtil getOralCourses_manageByLanguageTypeByUser(Integer pageNum, Integer languageTypeId);

	BackJsonUtil getReadingCourses_manageByLanguageTypeByUser(Integer pageNum, Integer languageTypeId);

	Map<String, List> getOralCourses_manageByRateType(Integer pageNum, Integer rateTypeId);

	int getOralCoursesTotalPagesByRateType(Integer rateTypeId);

	Map<String, List> getReadingCourses_manageByRateType(Integer pageNum, Integer rateTypeId);

	int getReadingCoursesTotalPagesByRateType(Integer rateTypeId);

	BackJsonUtil getOralCourses_manageByRateTypeByUser(Integer pageNum, Integer rateTypeId);

	BackJsonUtil getReadingCourses_manageByRateTypeByUser(Integer pageNum, Integer rateTypeId);

	BackJsonUtil addQuestion(QuestionForSQL question);

	BackJsonUtil deleteQuestion(Integer questionId);

	BackJsonUtil changeQuestion(QuestionForSQL question);

	BackJsonUtil getAllQuestion(String courseType, Integer courseId);

	BackJsonUtil toChangeQuestion(Integer questionId);

	BackJsonUtil addEvaluation(EvaluationFormForSQL evaluationFormForSQL);

	BackJsonUtil deleteEvaluation(Integer evaluationId);

	BackJsonUtil getAvgEvaluation(String courseType, Integer courseId);

	BackJsonUtil getAllEvaluationOfUser(Integer pageNum, Integer userId);

	BackJsonUtil getAllEvaluationOfCourse(Integer pageNum, String courseType, Integer courseId);

	BackJsonUtil getListeningCourseInfo(Integer courseId, Integer userId);

	BackJsonUtil getOralCourseInfo(Integer courseId, Integer userId);

	BackJsonUtil getReadingCourseInfo(Integer courseId, Integer userId);

	BackJsonUtil deleteHistoryRecording(Integer historyRecordingId);

	BackJsonUtil getHistoryRecordingOfUser(Integer pageNum, Integer userId);

	BackJsonUtil getScoreOfUserForOralCourse(String courseType, Integer courseId, Integer userId);

	BackJsonUtil addOralCourseScore(String courseType, Integer courseId, Integer userId, Integer oralScore);

	BackJsonUtil getAvgOralCourseScoreOfUser(Integer userId);

}

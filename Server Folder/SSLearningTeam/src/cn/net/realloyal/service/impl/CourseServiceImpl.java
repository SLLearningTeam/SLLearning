package cn.net.realloyal.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cn.net.realloyal.core.util.BackJsonUtil;
import cn.net.realloyal.mapper.CourseMapper;
import cn.net.realloyal.model.ListeningCourse;
import cn.net.realloyal.service.CourseService;
import cn.net.realloyal.vo.ListeningCourseForSQL;
import cn.net.realloyal.vo.OralCourseForSQL;
import cn.net.realloyal.vo.ReadingCourseForSQL;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseMapper courseMapper;

	@Override
	public void addListeningCourse(Integer languageTypeId, Integer rateTypeId, String courseName,
			String courseChineseContent, String courseEnglishContent, CommonsMultipartFile courseResource,
			CommonsMultipartFile instructionImg,HttpServletRequest request) {
		// 源听力资源文件名
		String originalCourseResourceName = courseResource.getOriginalFilename();
		// 新听力资源文件名  
        String newCourseResourceName = UUID.randomUUID() + originalCourseResourceName;
        // 源介绍图片资源文件名
 		String originalInstructionImgName = instructionImg.getOriginalFilename();
 		// 新介绍图片文件名  
         String newInstructionImgName = UUID.randomUUID() + originalInstructionImgName;
        // 获得项目的路径  
        ServletContext sc = request.getSession().getServletContext();  
        // 上传位置  
        String path = sc.getRealPath("/ListeningCourseResource") + "/"; // 设定文件保存的目录  
        File f = new File(path);  
        if (!f.exists())  
            f.mkdirs();  
        //将资源文件写入磁盘
        if (!courseResource.isEmpty()) {  
            try {  
                FileOutputStream fos = new FileOutputStream(path + newCourseResourceName);  
                InputStream in = courseResource.getInputStream();  
                int b = 0;  
                while ((b = in.read()) != -1) {  
                    fos.write(b);  
                }  
                fos.close();  
                in.close();  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }
        //将介绍图片文件写入磁盘
        if (!instructionImg.isEmpty()) {  
            try {  
                FileOutputStream fos = new FileOutputStream(path + newInstructionImgName);  
                InputStream in = instructionImg.getInputStream();  
                int b = 0;  
                while ((b = in.read()) != -1) {  
                    fos.write(b);  
                }  
                fos.close();  
                in.close();  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }
        String sourcePath = sc.getContextPath()+"/ListeningCourseResource/";
        String courseResourceUrl=sourcePath+newCourseResourceName;
        String instructionImgUrl=sourcePath+newInstructionImgName;
		ListeningCourseForSQL listeningCourse = new ListeningCourseForSQL(0,languageTypeId,rateTypeId,courseName,courseEnglishContent,courseChineseContent,courseResourceUrl,0,instructionImgUrl);
		courseMapper.addListeningCourse(listeningCourse);
	}

	@Override
	public void addOralCourse(Integer languageTypeId, Integer rateTypeId, String courseName,
			String courseChineseContent, String courseEnglishContent, CommonsMultipartFile instructionImg,HttpServletRequest request) {
		// 源介绍图片资源文件名
 		String originalInstructionImgName = instructionImg.getOriginalFilename();
 		// 新介绍图片文件名  
         String newInstructionImgName = UUID.randomUUID() + originalInstructionImgName;
        // 获得项目的路径  
        ServletContext sc = request.getSession().getServletContext();  
        // 上传位置  
        String path = sc.getRealPath("/OralCourseResource") + "/"; // 设定文件保存的目录  
        File f = new File(path);  
        if (!f.exists())  
            f.mkdirs();  
        //将介绍图片文件写入磁盘
        if (!instructionImg.isEmpty()) {  
            try {  
                FileOutputStream fos = new FileOutputStream(path + newInstructionImgName);  
                InputStream in = instructionImg.getInputStream();  
                int b = 0;  
                while ((b = in.read()) != -1) {  
                    fos.write(b);  
                }  
                fos.close();  
                in.close();  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }
        String sourcePath = sc.getContextPath()+"/OralCourseResource/";
        String instructionImgUrl=sourcePath+newInstructionImgName;
		OralCourseForSQL oralCourse = new OralCourseForSQL(0,languageTypeId,rateTypeId,courseName,courseEnglishContent,courseChineseContent,0,instructionImgUrl);
		courseMapper.addOralCourse(oralCourse);
	}

	@Override
	public void addReadingCourse(Integer languageTypeId, Integer rateTypeId, String courseName,
			String courseChineseContent, String courseEnglishContent, CommonsMultipartFile instructionImg,HttpServletRequest request) {
		// 源介绍图片资源文件名
 		String originalInstructionImgName = instructionImg.getOriginalFilename();
 		// 新介绍图片文件名  
         String newInstructionImgName = UUID.randomUUID() + originalInstructionImgName;
        // 获得项目的路径  
        ServletContext sc = request.getSession().getServletContext();  
        // 上传位置  
        String path = sc.getRealPath("/ReadingCourseResource") + "/"; // 设定文件保存的目录  
        File f = new File(path);  
        if (!f.exists())  
            f.mkdirs();  
        //将介绍图片文件写入磁盘
        if (!instructionImg.isEmpty()) {  
            try {  
                FileOutputStream fos = new FileOutputStream(path + newInstructionImgName);  
                InputStream in = instructionImg.getInputStream();  
                int b = 0;  
                while ((b = in.read()) != -1) {  
                    fos.write(b);  
                }  
                fos.close();  
                in.close();  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }
        String sourcePath = sc.getContextPath()+"/ReadingCourseResource/";
        String instructionImgUrl=sourcePath+newInstructionImgName;
		ReadingCourseForSQL readingCourse = new ReadingCourseForSQL(0,languageTypeId,rateTypeId,courseName,courseEnglishContent,courseChineseContent,0,instructionImgUrl);
		courseMapper.addReadingCourse(readingCourse);
	}

	//删除听力课程
	@Override
	public BackJsonUtil deleteListeningCourse(Integer courseId) {
		int status = courseMapper.deleteListeningCourse(courseId);
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		if(status!=0) {
			backJsonUtil.setStatus(true);
			backJsonUtil.setInfo("删除成功");
		}else {
			backJsonUtil.setStatus(false);
			backJsonUtil.setInfo("删除失败");
		}
		return backJsonUtil;
	}

	//删除口语课程
	@Override
	public BackJsonUtil deleteOralCourse(Integer courseId) {
		int status = courseMapper.deleteOralCourse(courseId);
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		if(status!=0) {
			backJsonUtil.setStatus(true);
			backJsonUtil.setInfo("删除成功");
		}else {
			backJsonUtil.setStatus(false);
			backJsonUtil.setInfo("删除失败");
		}
		return backJsonUtil;
	}

	//删除阅读课程
	@Override
	public BackJsonUtil deleteReadingCourse(Integer courseId) {
		int status = courseMapper.deleteReadingCourse(courseId);
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		if(status!=0) {
			backJsonUtil.setStatus(true);
			backJsonUtil.setInfo("删除成功");
		}else {
			backJsonUtil.setStatus(false);
			backJsonUtil.setInfo("删除失败");
		}
		return backJsonUtil;
	}
	
	

}

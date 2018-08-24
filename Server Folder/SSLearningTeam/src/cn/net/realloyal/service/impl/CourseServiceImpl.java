package cn.net.realloyal.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cn.net.realloyal.core.util.BackJsonUtil;
import cn.net.realloyal.core.util.CalculateStartIndex;
import cn.net.realloyal.mapper.CourseMapper;
import cn.net.realloyal.model.ListeningCourse;
import cn.net.realloyal.model.OralCourse;
import cn.net.realloyal.model.ReadingCourse;
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

	@Override
	public ListeningCourse getListeningCourseInfo(Integer courseId) {
		return courseMapper.getListeningCourseInfo(courseId);
	}

	@Override
	public OralCourse getOralCourseInfo(Integer courseId) {
		return courseMapper.getOralCourseInfo(courseId);
	}

	@Override
	public ReadingCourse getReadingCourseInfo(Integer courseId) {
		return courseMapper.getReadingCourseInfo(courseId);
	}

	//更新听力课程
	@Override
	public void updateListeningCourse(Integer courseId,Integer languageTypeId, Integer rateTypeId, String courseName,
			String courseChineseContent, String courseEnglishContent, CommonsMultipartFile courseResource,@RequestParam("downloadNum")Integer downloadNum,
			CommonsMultipartFile instructionImg, HttpServletRequest request) {
		ListeningCourseForSQL listeningCourse=null;
		// 获得项目的路径  
        ServletContext sc = request.getSession().getServletContext();  
        // 上传位置  
        String path = sc.getRealPath("/ListeningCourseResource") + "/"; // 设定文件保存的目录  
        File f = new File(path);  
        if (!f.exists())  
            f.mkdirs();  
        //资源基本路径
        String sourcePath = sc.getContextPath()+"/ListeningCourseResource/";
		if(!courseResource.isEmpty()) {
			// 源听力资源文件名
			String originalCourseResourceName = courseResource.getOriginalFilename();
			// 新听力资源文件名  
	        String newCourseResourceName = UUID.randomUUID() + originalCourseResourceName;
	        //将资源文件写入磁盘
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
	        String courseResourceUrl=sourcePath+newCourseResourceName;
			if(!instructionImg.isEmpty()) {
				// 源介绍图片资源文件名
		 		String originalInstructionImgName = instructionImg.getOriginalFilename();
		 		// 新介绍图片文件名  
		         String newInstructionImgName = UUID.randomUUID() + originalInstructionImgName;
		        //将介绍图片文件写入磁盘
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
		        String instructionImgUrl=sourcePath+newInstructionImgName;
		        listeningCourse = new ListeningCourseForSQL(courseId,languageTypeId,rateTypeId,courseName,courseEnglishContent,courseChineseContent,courseResourceUrl,downloadNum,instructionImgUrl);
		        courseMapper.updateListeningCourseWithRousourceWithImg(listeningCourse);
			}else {
				listeningCourse = new ListeningCourseForSQL(courseId,languageTypeId,rateTypeId,courseName,courseEnglishContent,courseChineseContent,courseResourceUrl,downloadNum,"");
				courseMapper.updateListeningCourseWithRousourceWithoutImg(listeningCourse);
			}
		}else {
			if(!instructionImg.isEmpty()) {
				// 源介绍图片资源文件名
		 		String originalInstructionImgName = instructionImg.getOriginalFilename();
		 		// 新介绍图片文件名  
		         String newInstructionImgName = UUID.randomUUID() + originalInstructionImgName;
		        //将介绍图片文件写入磁盘
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
		        String instructionImgUrl=sourcePath+newInstructionImgName;
		        listeningCourse = new ListeningCourseForSQL(courseId,languageTypeId,rateTypeId,courseName,courseEnglishContent,courseChineseContent,"",downloadNum,instructionImgUrl);
		        courseMapper.updateListeningCourseWithoutRousourceWithImg(listeningCourse);
			}else {
				listeningCourse = new ListeningCourseForSQL(courseId,languageTypeId,rateTypeId,courseName,courseEnglishContent,courseChineseContent,"",downloadNum,"");
				courseMapper.updateListeningCourseWithoutRousourceWithoutImg(listeningCourse);
			}
		}
	}
	
	//更新口语课程
	@Override
	public void updateOralCourse(Integer courseId, Integer languageTypeId, Integer rateTypeId, String courseName,
			String courseChineseContent, String courseEnglishContent,@RequestParam("downloadNum")Integer downloadNum, CommonsMultipartFile instructionImg,
			HttpServletRequest request) {
		OralCourseForSQL oralCourse=null;
		// 获得项目的路径  
        ServletContext sc = request.getSession().getServletContext();  
        // 上传位置  
        String path = sc.getRealPath("/OralCourseResource") + "/"; // 设定文件保存的目录  
        File f = new File(path);  
        if (!f.exists())  
            f.mkdirs();  
        //资源基本路径
        String sourcePath = sc.getContextPath()+"/OralCourseResource/";
		if(!instructionImg.isEmpty()) {
			// 源介绍图片资源文件名
	 		String originalInstructionImgName = instructionImg.getOriginalFilename();
	 		// 新介绍图片文件名  
	         String newInstructionImgName = UUID.randomUUID() + originalInstructionImgName;
	        //将介绍图片文件写入磁盘
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
	        String instructionImgUrl=sourcePath+newInstructionImgName;
	        oralCourse = new OralCourseForSQL(courseId,languageTypeId,rateTypeId,courseName,courseEnglishContent,courseChineseContent,downloadNum,instructionImgUrl);
	        courseMapper.updateOralCourseWithImg(oralCourse);
		}else {
			oralCourse = new OralCourseForSQL(courseId,languageTypeId,rateTypeId,courseName,courseEnglishContent,courseChineseContent,downloadNum,"");
			courseMapper.updateOralCourseWithoutImg(oralCourse);
		}
	}

	//更新阅读课程
	@Override
	public void updateReadingCourse(Integer courseId, Integer languageTypeId, Integer rateTypeId, String courseName,
			String courseChineseContent, String courseEnglishContent,@RequestParam("downloadNum")Integer downloadNum, CommonsMultipartFile instructionImg,
			HttpServletRequest request) {
		ReadingCourseForSQL readingCourse=null;
		// 获得项目的路径  
        ServletContext sc = request.getSession().getServletContext();  
        // 上传位置  
        String path = sc.getRealPath("/ReadingCourseResource") + "/"; // 设定文件保存的目录  
        File f = new File(path);  
        if (!f.exists())  
            f.mkdirs();  
        //资源基本路径
        String sourcePath = sc.getContextPath()+"/ReadingCourseResource/";
		if(!instructionImg.isEmpty()) {
			// 源介绍图片资源文件名
	 		String originalInstructionImgName = instructionImg.getOriginalFilename();
	 		// 新介绍图片文件名  
	         String newInstructionImgName = UUID.randomUUID() + originalInstructionImgName;
	        //将介绍图片文件写入磁盘
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
	        String instructionImgUrl=sourcePath+newInstructionImgName;
	        readingCourse = new ReadingCourseForSQL(courseId,languageTypeId,rateTypeId,courseName,courseEnglishContent,courseChineseContent,downloadNum,instructionImgUrl);
	        courseMapper.updateReadingCourseWithImg(readingCourse);
		}else {
			readingCourse = new ReadingCourseForSQL(courseId,languageTypeId,rateTypeId,courseName,courseEnglishContent,courseChineseContent,downloadNum,"");
			courseMapper.updateReadingCourseWithoutImg(readingCourse);
		}
	}

	@Override
	public Map<String, List> getAllTypeCourses(Integer pageNum) {
		//听力先取，取完为止；口语再取，取完为止；阅读再取，取完为止
		int startIndex = CalculateStartIndex.getStartIndex(pageNum, 10);
		Map<String,List> allTypeCourses = new HashMap<String,List>();
		allTypeCourses.put("listeningCourses", new ArrayList<ListeningCourse>());
		allTypeCourses.put("oralCourses", new ArrayList<OralCourse>());
		allTypeCourses.put("readingCourses", new ArrayList<ReadingCourse>());
		if(startIndex<courseMapper.getListeningCoursesNum()) {
			List<ListeningCourse> listeningCourses = courseMapper.getListeningCourses(startIndex,10);
			allTypeCourses.replace("listeningCourses", listeningCourses);
			if(listeningCourses.size()<10) {
				int lastNum = 10-listeningCourses.size();
				List<OralCourse> oralCourses = courseMapper.getOralCourses(0,lastNum);
				allTypeCourses.replace("oralCourses",oralCourses);
				if(oralCourses.size()<lastNum) {
					int finalNum = lastNum - oralCourses.size();
					List<ReadingCourse> readingCourses = courseMapper.getReadingCourses(0,finalNum);
					allTypeCourses.replace("readingCourses", readingCourses);
				}
			}
		}else {
			startIndex = startIndex-courseMapper.getListeningCoursesNum();
			if(startIndex<courseMapper.getOralCoursesNum()) {
				List<OralCourse> oralCourses = courseMapper.getOralCourses(startIndex,10);
				allTypeCourses.replace("oralCourses",oralCourses);
				if(oralCourses.size()<10) {
					int lastNum = 10 - oralCourses.size();
					List<ReadingCourse> readingCourses = courseMapper.getReadingCourses(0,lastNum);
					allTypeCourses.replace("readingCourses", readingCourses);
				}
			}else {
				startIndex = startIndex-courseMapper.getOralCoursesNum();
				List<ReadingCourse> readingCourses = courseMapper.getReadingCourses(startIndex,10);
				allTypeCourses.replace("readingCourses", readingCourses);
			}
		}
		System.out.println(allTypeCourses);
		return allTypeCourses;
	}

	@Override
	public int allTypesTotalPages() {
		int listeningCoursesNum=courseMapper.getListeningCoursesNum();
		int oralCoursesNum=courseMapper.getOralCoursesNum();
		int readingCoursesNum=courseMapper.getReadingCoursesNum();
		int totalPages = (int)(listeningCoursesNum+oralCoursesNum+readingCoursesNum)/10+1;
		return totalPages;
	}

	@Override
	public BackJsonUtil getCoursesManageByUser(Integer pageNum) {
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		int listeningCoursesNum=courseMapper.getListeningCoursesNum();
		int oralCoursesNum=courseMapper.getOralCoursesNum();
		int readingCoursesNum=courseMapper.getReadingCoursesNum();
		int totalPages = (int)(listeningCoursesNum+oralCoursesNum+readingCoursesNum)/10+1;
		if(pageNum>totalPages) {
			backJsonUtil.setStatus(false);
			backJsonUtil.setInfo("您的访问页数有误，请重新选择!");
		}else {
			backJsonUtil.setStatus(true);
			Map<String,Object>result = new HashMap<String,Object>();
			result.put("totalPages", totalPages);
			result.put("currentPage", pageNum);
			int startIndex = CalculateStartIndex.getStartIndex(pageNum, 10);
			Map<String,List> allTypeCourses = new HashMap<String,List>();
			allTypeCourses.put("listeningCourses", new ArrayList<ListeningCourse>());
			allTypeCourses.put("oralCourses", new ArrayList<OralCourse>());
			allTypeCourses.put("readingCourses", new ArrayList<ReadingCourse>());
			if(startIndex<listeningCoursesNum) {
				List<ListeningCourse> listeningCourses = courseMapper.getListeningCourses(startIndex,10);
				allTypeCourses.replace("listeningCourses", listeningCourses);
				if(listeningCourses.size()<10) {
					int lastNum = 10-listeningCourses.size();
					List<OralCourse> oralCourses = courseMapper.getOralCourses(0,lastNum);
					allTypeCourses.replace("oralCourses",oralCourses);
					if(oralCourses.size()<lastNum) {
						int finalNum = lastNum - oralCourses.size();
						List<ReadingCourse> readingCourses = courseMapper.getReadingCourses(0,finalNum);
						allTypeCourses.replace("readingCourses", readingCourses);
					}
				}
			}else {
				startIndex = startIndex-listeningCoursesNum;
				if(startIndex<oralCoursesNum) {
					List<OralCourse> oralCourses = courseMapper.getOralCourses(startIndex,10);
					allTypeCourses.replace("oralCourses",oralCourses);
					if(oralCourses.size()<10) {
						int lastNum = 10 - oralCourses.size();
						List<ReadingCourse> readingCourses = courseMapper.getReadingCourses(0,lastNum);
						allTypeCourses.replace("readingCourses", readingCourses);
					}
				}else {
					startIndex = startIndex-oralCoursesNum;
					List<ReadingCourse> readingCourses = courseMapper.getReadingCourses(startIndex,10);
					allTypeCourses.replace("readingCourses", readingCourses);
				}
			}
			result.put("allTypeCourses", allTypeCourses);
			backJsonUtil.setInfo(result);
		}
		return backJsonUtil;
	}
	
	

}

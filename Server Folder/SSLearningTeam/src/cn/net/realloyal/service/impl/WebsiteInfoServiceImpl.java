package cn.net.realloyal.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cn.net.realloyal.core.util.BackJsonUtil;
import cn.net.realloyal.core.util.CalculateStartIndex;
import cn.net.realloyal.mapper.WebsiteInfoMapper;
import cn.net.realloyal.model.CarouselMap;
import cn.net.realloyal.model.DownloadRecording;
import cn.net.realloyal.model.LanguageType;
import cn.net.realloyal.model.User;
import cn.net.realloyal.service.WebsiteInfoService;
import cn.net.realloyal.vo.DownloadRecordingForSQL;

@Service
public class WebsiteInfoServiceImpl implements WebsiteInfoService {
	@Autowired
	private WebsiteInfoMapper websiteInfoMapper;
	
	@Override
	public void addCarouselMap(String carouselInstruction, CommonsMultipartFile carouselImg, String carouselLinkUrl,HttpServletRequest request) {
		CarouselMap carouselMap = new CarouselMap();
        // 新文件名  
        String newFileName = UUID.randomUUID() + "_carouselMap.png";  
        System.out.println("新文件名:" + newFileName); 
        // 获得项目的路径  
        ServletContext sc = request.getSession().getServletContext();  
        // 上传位置  
        String path = sc.getRealPath("/CarouselMaps") + "/"; // 设定文件保存的目录  
        File f = new File(path);  
        if (!f.exists())  
            f.mkdirs();  
        if (!carouselImg.isEmpty()) {  
            try {  
                FileOutputStream fos = new FileOutputStream(path + newFileName);  
                InputStream in = carouselImg.getInputStream();  
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
        carouselMap.setCarouselImgUrl(sc.getContextPath()+"/CarouselMaps/"+newFileName);
        carouselMap.setCarouselLinkUrl(carouselLinkUrl);
        carouselMap.setCarouselInstruction(carouselInstruction);
        websiteInfoMapper.addCarouselMap(carouselMap);
	}

	@Override
	public BackJsonUtil deleteCarouselMap(Integer carouselId) {
		int status = websiteInfoMapper.deleteCarouselMap(carouselId);
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
	public CarouselMap getCarouselMapInfo(Integer carouselId) {
		return websiteInfoMapper.getCarouselMapInfo(carouselId);
	}

	@Override
	public void updateCarouselMap(Integer carouselId,String carouselInstruction, CommonsMultipartFile carouselImg, String carouselLinkUrl,HttpServletRequest request) {
		CarouselMap carouselMap = new CarouselMap();
		carouselMap.setCarouselId(carouselId);
		carouselMap.setCarouselLinkUrl(carouselLinkUrl);
        carouselMap.setCarouselInstruction(carouselInstruction);
        if (!carouselImg.isEmpty()) { 
        		// 新文件名  
            String newFileName = UUID.randomUUID() + "_carouselMap.png";  
            System.out.println("新文件名:" + newFileName); 
            // 获得项目的路径  
            ServletContext sc = request.getSession().getServletContext();  
            // 上传位置  
            String path = sc.getRealPath("/CarouselMaps") + "/"; // 设定文件保存的目录  
            File f = new File(path);  
            if (!f.exists())  
                f.mkdirs();  
            try {  
                FileOutputStream fos = new FileOutputStream(path + newFileName);  
                InputStream in = carouselImg.getInputStream();  
                int b = 0;  
                while ((b = in.read()) != -1) {  
                    fos.write(b);  
                }  
                fos.close();  
                in.close();  
            } catch (Exception e) {  
                e.printStackTrace();  
            } 
            carouselMap.setCarouselImgUrl(sc.getContextPath()+"/CarouselMaps/"+newFileName);
            websiteInfoMapper.updateCarouselMapWithImg(carouselMap);
        }else {
        		websiteInfoMapper.updateCarouselMapWithoutImg(carouselMap);
        }
	}

	@Override
	public int getPageNumber() {
		int carouselMapCount = websiteInfoMapper.getCarouselMapCount();
		int pageNumber = (int)carouselMapCount/10+1;
		return pageNumber;
	}

	@Override
	public List<CarouselMap> getCarouselMap(Integer pageNum) {
		int startNum = CalculateStartIndex.getStartIndex(pageNum, 10);
		return websiteInfoMapper.getCarouselMapManage(startNum);
	}

	@Override
	public List<CarouselMap> getAllCarouselMap() {
		return websiteInfoMapper.getAllCarouselMaps();
	}

	@Override
	public BackJsonUtil getCarouselMaps() {
		List<CarouselMap>carouselMaps = websiteInfoMapper.getAllCarouselMaps();
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		backJsonUtil.setStatus(true);
		backJsonUtil.setInfo(carouselMaps);
		return backJsonUtil;
	}

	//添加课程下载记录
	@Override
	public void addDownloadRecordingForCourse(Integer userId, String courseType, Integer courseId) throws ParseException {
		DownloadRecordingForSQL downloadRecording = new DownloadRecordingForSQL();
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String downloadRecordingTime = df.format(date);
		System.out.println(downloadRecordingTime);
		downloadRecording.setUserId(userId);
		downloadRecording.setCourseType(courseType);
		downloadRecording.setCourseId(courseId);
		downloadRecording.setDownloadRecordingTime(downloadRecordingTime);
		websiteInfoMapper.addDownloadRecordingForCourse(downloadRecording);
		websiteInfoMapper.addCourseDownloadNum(courseType,courseId);
	}

	@Override
	public int getDownloadRecordingPageNumber() {
		int downloadRecordingCount = websiteInfoMapper.getDownloadRecordingCount();
		int pageNumber = (int)downloadRecordingCount/10+1;
		return pageNumber;
	}

	@Override
	public List<DownloadRecording> getDownloadRecordings(Integer pageNum) {
		int startNum = CalculateStartIndex.getStartIndex(pageNum, 10);
		return websiteInfoMapper.getDownloadRecordings(startNum);
	}

	@Override
	public BackJsonUtil deleteDownloadRecording(Integer downloadRecordingId) {
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		if(websiteInfoMapper.deleteDownloadRecording(downloadRecordingId)!=0) {
			//删除成功
			backJsonUtil.setStatus(true);
			backJsonUtil.setInfo("删除成功");
		}else {
			//删除失败
			backJsonUtil.setStatus(false);
			backJsonUtil.setInfo("删除失败");
		}
		return backJsonUtil;
	}

	@Override
	public BackJsonUtil getDownloadRecordingsByUser(Integer pageNum, Integer userId) {
		int startNum = CalculateStartIndex.getStartIndex(pageNum, 10);
		List<DownloadRecording>downloadRecordings = websiteInfoMapper.getDownloadRecordingsByUser(startNum,userId);
		int pageNumber = getDownloadRecordingPageNumber();
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		backJsonUtil.setStatus(true);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("totalPage", pageNumber);
		map.put("currentPage", pageNum);
		map.put("downloadRecordings", downloadRecordings);
		backJsonUtil.setInfo(map);
		return backJsonUtil;
	}
	
}

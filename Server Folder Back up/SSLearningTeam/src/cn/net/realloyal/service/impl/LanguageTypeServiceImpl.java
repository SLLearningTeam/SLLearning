package cn.net.realloyal.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cn.net.realloyal.core.util.BackJsonUtil;
import cn.net.realloyal.core.util.CalculateStartIndex;
import cn.net.realloyal.mapper.LanguageTypeMapper;
import cn.net.realloyal.model.LanguageType;
import cn.net.realloyal.service.LanguageTypeService;

@Service
public class LanguageTypeServiceImpl implements LanguageTypeService {
	
	@Autowired
	public LanguageTypeMapper languageTypeMapper;

	@Override
	public List<LanguageType> getLanguagesManage(Integer pageNum) {
		int startNum = CalculateStartIndex.getStartIndex(pageNum, 10);
		return languageTypeMapper.getLanguagesManage(startNum);
	}

	@Override
	public void addlanguage(String languageName, CommonsMultipartFile languageIcon,HttpServletRequest request) {
		LanguageType languageType = new LanguageType();
        // 新文件名  
        String newFileName = UUID.randomUUID() + "_language.png";  
        System.out.println("新文件名:" + newFileName); 
        // 获得项目的路径  
        ServletContext sc = request.getSession().getServletContext();  
        // 上传位置  
        String path = sc.getRealPath("/Languages") + "/"; // 设定文件保存的目录  
        File f = new File(path);  
        if (!f.exists())  
            f.mkdirs();  
        if (!languageIcon.isEmpty()) {  
            try {  
                FileOutputStream fos = new FileOutputStream(path + newFileName);  
                InputStream in = languageIcon.getInputStream();  
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
        languageType.setLanguageIconUrl(sc.getContextPath()+"/Languages/"+newFileName);
		languageType.setLanguageName(languageName);
		languageTypeMapper.addlanguage(languageType);
	}

	@Override
	public BackJsonUtil deletelanguage(Integer languageTypeId) {
		int status = languageTypeMapper.deletelanguage(languageTypeId);
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
	public LanguageType getLanguageTypeInfo(Integer languageTypeId) {
		return languageTypeMapper.getLanguageTypeInfo(languageTypeId);
	}

	//此处后期待优化
	//当前的操作为每次修改提交的图片，不管是否更新都会添加一个图片到服务端
	@Override
	public void updateLanguage(Integer languageTypeId, String languageName, CommonsMultipartFile languageIcon,
			HttpServletRequest request) {
		LanguageType languageType = new LanguageType();
		languageType.setLanguageTypeId(languageTypeId);
		languageType.setLanguageName(languageName);
		if(!languageIcon.isEmpty()) { 
	        // 新文件名  
	        String newFileName = UUID.randomUUID() + "_language.png";  
	        System.out.println("新文件名:" + newFileName); 
	        // 获得项目的路径  
	        ServletContext sc = request.getSession().getServletContext();  
	        // 上传位置  
	        String path = sc.getRealPath("/Languages") + "/"; // 设定文件保存的目录  
	        File f = new File(path);  
	        if (!f.exists())  
	            f.mkdirs();  
            try {  
                FileOutputStream fos = new FileOutputStream(path + newFileName);  
                InputStream in = languageIcon.getInputStream();  
                int b = 0;  
                while ((b = in.read()) != -1) {  
                    fos.write(b);  
                }  
                fos.close();  
                in.close();  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
	        languageType.setLanguageIconUrl(sc.getContextPath()+"/Languages/"+newFileName);
	        languageTypeMapper.updatelanguageWithIcon(languageType);
		}else {
			languageTypeMapper.updatelanguageWithoutIcon(languageType);
		}
	}

	@Override
	public BackJsonUtil getLanguages(Integer pageNum) {
		int startNum = CalculateStartIndex.getStartIndex(pageNum, 10);
		List<LanguageType>languageTypes = languageTypeMapper.getLanguagesManage(startNum);
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		backJsonUtil.setStatus(true);
		backJsonUtil.setInfo(languageTypes);
		return backJsonUtil;
	}

	@Override
	public int getPageNumber() {
		int languagesCount = languageTypeMapper.getLanguagesCount();
		int pageNumber = (int)languagesCount/10+1;
		return pageNumber;
	}

	@Override
	public BackJsonUtil getAllLanguages() {
		List<LanguageType>languageTypes = languageTypeMapper.getAllLanguages();
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		backJsonUtil.setStatus(true);
		backJsonUtil.setInfo(languageTypes);
		return backJsonUtil;
	}

	@Override
	public BackJsonUtil selectLanguageNameRepeat(String languageName) {
		BackJsonUtil backJson = new BackJsonUtil();
		if(languageTypeMapper.selectLanguageNameRepeat(languageName)!=0) {
			backJson.setStatus(false);
			backJson.setInfo("您输入的语言类别名称已存在，请重新输入!");
		}else {
			backJson.setStatus(true);
			backJson.setInfo("您输入的语言类别不存在，可以使用该名称!");
		}
		return backJson;
	}

}

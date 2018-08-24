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
import cn.net.realloyal.mapper.RateTypeMapper;
import cn.net.realloyal.model.LanguageType;
import cn.net.realloyal.model.RateType;
import cn.net.realloyal.service.RateTypeService;
import cn.net.realloyal.vo.RateTypeForSQL;

@Service
public class RateTypeServiceImpl implements RateTypeService {
	
	@Autowired
	private RateTypeMapper rateTypeMapper;
	@Autowired
	private LanguageTypeMapper languageTypeMapper;
	
	@Override
	public void addRateType(Integer languageTypeId, String rateName, CommonsMultipartFile rateIcon,
			HttpServletRequest request) {
		RateTypeForSQL rateType = new RateTypeForSQL();
        // 新文件名  
        String newFileName = UUID.randomUUID() + "_ratetype.png";
        // 获得项目的路径  
        ServletContext sc = request.getSession().getServletContext();  
        // 上传位置  
        String path = sc.getRealPath("/Ratetypes") + "/"; // 设定文件保存的目录  
        File f = new File(path);  
        if (!f.exists())  
            f.mkdirs();  
        if (!rateIcon.isEmpty()) {  
            try {  
                FileOutputStream fos = new FileOutputStream(path + newFileName);  
                InputStream in = rateIcon.getInputStream();  
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
        rateType.setRateIconUrl(sc.getContextPath()+"/Ratetypes/"+newFileName);
        rateType.setLanguageTypeId(languageTypeId);
        rateType.setRateName(rateName);
        rateTypeMapper.addRateType(rateType);
	}

	@Override
	public List<RateType> getRatetypesManage(Integer pageNum) {
		int startNum = CalculateStartIndex.getStartIndex(pageNum, 10);
		return rateTypeMapper.getRateTypes(startNum);
	}

	@Override
	public RateType getRateTypeInfo(Integer rateTypeId) {
		return rateTypeMapper.getRateTypeInfo(rateTypeId);
	}

	@Override
	public BackJsonUtil deleteRateType(Integer rateTypeId) {
		int status = rateTypeMapper.deleteRateType(rateTypeId);
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
	public BackJsonUtil getRateTypes(Integer pageNum) {
		int startNum = CalculateStartIndex.getStartIndex(pageNum, 10);
		List<RateType>rateTypes = rateTypeMapper.getRateTypes(startNum);
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		backJsonUtil.setStatus(true);
		backJsonUtil.setInfo(rateTypes);
		return backJsonUtil;
	}

	@Override
	public void updateRateType(Integer rateTypeId, Integer languageTypeId, String rateName,
			CommonsMultipartFile rateIcon, HttpServletRequest request) {
		RateTypeForSQL rateType = new RateTypeForSQL();
		rateType.setRateTypeId(rateTypeId);
		rateType.setLanguageTypeId(languageTypeId);
        rateType.setRateName(rateName);
        if(!rateIcon.isEmpty()) {
        		// 新文件名  
            String newFileName = UUID.randomUUID() + "_ratetype.png";
            // 获得项目的路径  
            ServletContext sc = request.getSession().getServletContext();  
            // 上传位置  
            String path = sc.getRealPath("/Ratetypes") + "/"; // 设定文件保存的目录  
            File f = new File(path);  
            if (!f.exists())  
                f.mkdirs();  
            try {  
                FileOutputStream fos = new FileOutputStream(path + newFileName);  
                InputStream in = rateIcon.getInputStream();  
                int b = 0;  
                while ((b = in.read()) != -1) {  
                    fos.write(b);  
                }  
                fos.close();  
                in.close();  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
            rateType.setRateIconUrl(sc.getContextPath()+"/Ratetypes/"+newFileName);
            rateTypeMapper.updateRateTypeWithIcon(rateType);
        }else {
        		rateTypeMapper.updateRateTypeWithoutIcon(rateType);
        } 
	}

	@Override
	public List<LanguageType> getLanguages() {
		return languageTypeMapper.getAllLanguages();
	}

	@Override
	public List<RateTypeForSQL> getRateTypes() {
		return rateTypeMapper.getAllRateTypes();
	}

	@Override
	public BackJsonUtil getRateTypesByLanguageTypeId(Integer languageTypeId) {
		List<RateTypeForSQL>rateTypes = rateTypeMapper.getRateTypesByLanguageTypeId(languageTypeId);
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		backJsonUtil.setStatus(true);
		backJsonUtil.setInfo(rateTypes);
		return backJsonUtil;
	}

	@Override
	public int getPageNumber() {
		int rateTypesCount = rateTypeMapper.getRateTypesCount();
		int pageNumber = (int)rateTypesCount/10+1;
		return pageNumber;
	}

}

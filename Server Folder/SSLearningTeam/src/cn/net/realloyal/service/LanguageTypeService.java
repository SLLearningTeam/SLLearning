package cn.net.realloyal.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cn.net.realloyal.core.util.BackJsonUtil;
import cn.net.realloyal.model.LanguageType;

@Service
public interface LanguageTypeService {
	public List<LanguageType> getLanguagesManage(Integer pageNum);

	public void addlanguage(String languageName, CommonsMultipartFile languageIcon, HttpServletRequest request);

	public BackJsonUtil deletelanguage(Integer languageTypeId);

	public LanguageType getLanguageTypeInfo(Integer languageTypeId);

	public void updateLanguage(Integer languageTypeId, String languageName, CommonsMultipartFile languageIcon,
			HttpServletRequest request);

	public BackJsonUtil getLanguages(Integer pageNum);

	public int getPageNumber();

	public BackJsonUtil getAllLanguages();

}

package cn.net.realloyal.mapper;

import java.util.List;

import cn.net.realloyal.model.LanguageType;

public interface LanguageTypeMapper {

	List<LanguageType> getLanguagesManage(Integer startNum);

	void addlanguage(LanguageType languageType);

	int deletelanguage(Integer languageTypeId);

	LanguageType getLanguageTypeInfo(Integer languageTypeId);

	void updatelanguageWithIcon(LanguageType languageType);

	void updatelanguageWithoutIcon(LanguageType languageType);

}

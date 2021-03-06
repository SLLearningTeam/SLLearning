package cn.net.realloyal.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cn.net.realloyal.core.util.BackJsonUtil;
import cn.net.realloyal.model.LanguageType;
import cn.net.realloyal.model.RateType;
import cn.net.realloyal.vo.RateTypeForSQL;

@Service
public interface RateTypeService {

	void addRateType(Integer languageTypeId, String rateName, CommonsMultipartFile rateIcon,
			HttpServletRequest request);

	List<RateType> getRatetypesManage(Integer pageNum);

	RateType getRateTypeInfo(Integer rateTypeId);

	

	BackJsonUtil deleteRateType(Integer rateTypeId);

	BackJsonUtil getRateTypes(Integer pageNum);

	void updateRateType(Integer rateTypeId, Integer languageTypeId, String rateName, CommonsMultipartFile rateIcon,
			HttpServletRequest request);

	List<LanguageType> getLanguages();
	
	List<RateTypeForSQL> getRateTypes();

	BackJsonUtil getRateTypesByLanguageTypeId(Integer languageTypeId);

	int getPageNumber();

	BackJsonUtil selectRateNameRepeat(String rateName);

}

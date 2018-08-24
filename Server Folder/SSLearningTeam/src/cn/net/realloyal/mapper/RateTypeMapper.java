package cn.net.realloyal.mapper;

import java.util.List;

import cn.net.realloyal.model.RateType;
import cn.net.realloyal.vo.RateTypeForSQL;

public interface RateTypeMapper {

	void addRateType(RateTypeForSQL rateType);

	RateType getRateTypeInfo(Integer rateTypeId);

	int deleteRateType(Integer rateTypeId);

	List<RateType> getRateTypes(int startNum);

	void updateRateTypeWithIcon(RateTypeForSQL rateType);

	void updateRateTypeWithoutIcon(RateTypeForSQL rateType);

	List<RateTypeForSQL> getAllRateTypes();

	List<RateTypeForSQL> getRateTypesByLanguageTypeId(Integer languageTypeId);

	int getRateTypesCount();

}

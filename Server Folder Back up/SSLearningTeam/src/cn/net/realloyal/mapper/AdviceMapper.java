package cn.net.realloyal.mapper;

import java.util.List;

import cn.net.realloyal.model.AdviceInfoList;
import cn.net.realloyal.vo.AdviceInfoListForSQL;

public interface AdviceMapper {

	int addAdvice(AdviceInfoListForSQL adviceInfoListForSQL);

	int deleteAdvice(Integer adviceId);

	List<AdviceInfoList> getAllAdvice(Integer pageNum);

	int getAllAdvicePageNumber();

	int getAllAdvicePageNumberByUserId(Integer userId);

	List<AdviceInfoList> getAllAdviceByUserId(Integer pageNum, Integer userId);
}

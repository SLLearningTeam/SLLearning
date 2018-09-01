package cn.net.realloyal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.net.realloyal.core.util.BackJsonUtil;
import cn.net.realloyal.model.AdviceInfoList;
import cn.net.realloyal.vo.AdviceInfoListForSQL;

@Service
public interface AdviceService {

	BackJsonUtil addAdvice(AdviceInfoListForSQL adviceInfoListForSQL);

	BackJsonUtil deleteAdvice(Integer adviceId);

	List<AdviceInfoList> getAllAdvice(Integer pageNum);

	int getAllAdvicePageNumber();

	int getAllAdvicePageNumberByUserId(Integer userId);

	List<AdviceInfoList> getAllAdviceByUserId(Integer pageNum, Integer userId);

	BackJsonUtil getAdviceByUserId(Integer pageNum, Integer userId);
}

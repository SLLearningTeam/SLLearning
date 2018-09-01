package cn.net.realloyal.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.realloyal.core.util.BackJsonUtil;
import cn.net.realloyal.core.util.CalculateStartIndex;
import cn.net.realloyal.mapper.AdviceMapper;
import cn.net.realloyal.model.AdviceInfoList;
import cn.net.realloyal.vo.AdviceInfoListForSQL;

@Service
public class AdviceServiceImpl implements cn.net.realloyal.service.AdviceService {
	@Autowired
	private AdviceMapper adviceMapper;
	
	@Override
	public BackJsonUtil addAdvice(AdviceInfoListForSQL adviceInfoListForSQL) {
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		if(adviceMapper.addAdvice(adviceInfoListForSQL)==0) {
			backJsonUtil.setStatus(false);
			backJsonUtil.setInfo("添加失败");
		}else {
			backJsonUtil.setStatus(true);
			backJsonUtil.setInfo("添加成功");
		}
		return backJsonUtil;
	}

	@Override
	public BackJsonUtil deleteAdvice(Integer adviceId) {
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		if(adviceMapper.deleteAdvice(adviceId)==0) {
			backJsonUtil.setStatus(false);
			backJsonUtil.setInfo("删除失败");
		}else {
			backJsonUtil.setStatus(true);
			backJsonUtil.setInfo("删除成功");
		}
		return backJsonUtil;
	}

	@Override
	public List<AdviceInfoList> getAllAdvice(Integer pageNum) {
		int startNum = CalculateStartIndex.getStartIndex(pageNum, 10); 
		List<AdviceInfoList>adviceInfoLists = adviceMapper.getAllAdvice(startNum);
		return adviceInfoLists;
	}

	@Override
	public int getAllAdvicePageNumber() {
		int advicesCount = adviceMapper.getAllAdvicePageNumber();
		int pageNumber = (int)advicesCount/10+1;
		return pageNumber;
	}

	@Override
	public int getAllAdvicePageNumberByUserId(Integer userId) {
		int advicesCount = adviceMapper.getAllAdvicePageNumberByUserId(userId);
		int pageNumber = (int)advicesCount/10+1;
		return pageNumber;
	}

	@Override
	public List<AdviceInfoList> getAllAdviceByUserId(Integer pageNum, Integer userId) {
		int startNum = CalculateStartIndex.getStartIndex(pageNum, 10); 
		return adviceMapper.getAllAdviceByUserId(startNum,userId);
	}

	@Override
	public BackJsonUtil getAdviceByUserId(Integer pageNum, Integer userId) {
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		Map<String,Object>result = new HashMap<String,Object>();
		result.put("adviceInfoList",getAllAdviceByUserId(pageNum,userId));
		result.put("pageNumeber", getAllAdvicePageNumberByUserId(userId));
		result.put("currentPage",pageNum);
		backJsonUtil.setStatus(true);
		backJsonUtil.setInfo(result);
		return backJsonUtil;
	}
}

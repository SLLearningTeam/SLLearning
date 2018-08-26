package cn.net.realloyal.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;


import cn.net.realloyal.core.util.BackJsonUtil;
import cn.net.realloyal.model.CarouselMap;

@Service
public interface WebsiteInfoService {

	void addCarouselMap(String carouselInstruction, CommonsMultipartFile carouselImg, String carouselLinkUrl,HttpServletRequest request);

	BackJsonUtil deleteCarouselMap(Integer carouselId);

	CarouselMap getCarouselMapInfo(Integer carouselId);

	void updateCarouselMap(Integer carouselId,String carouselInstruction, CommonsMultipartFile carouselImg, String carouselLinkUrl,HttpServletRequest request);

	int getPageNumber();

	List<CarouselMap> getCarouselMap(Integer pageNum);

	List<CarouselMap> getAllCarouselMap();

	BackJsonUtil getCarouselMaps();

}

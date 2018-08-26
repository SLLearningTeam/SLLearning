package cn.net.realloyal.mapper;

import java.util.List;

import cn.net.realloyal.model.CarouselMap;

public interface WebsiteInfoMapper {

	void addCarouselMap(CarouselMap carouselMap);

	int deleteCarouselMap(Integer carouselId);

	CarouselMap getCarouselMapInfo(Integer carouselId);

	void updateCarouselMapWithImg(CarouselMap carouselMap);

	void updateCarouselMapWithoutImg(CarouselMap carouselMap);

	int getCarouselMapCount();

	List<CarouselMap> getCarouselMapManage(int startNum);

	List<CarouselMap> getAllCarouselMaps();

}

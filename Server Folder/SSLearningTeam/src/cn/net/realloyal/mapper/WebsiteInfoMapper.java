package cn.net.realloyal.mapper;

import java.util.List;

import cn.net.realloyal.model.CarouselMap;
import cn.net.realloyal.model.DownloadRecording;
import cn.net.realloyal.vo.DownloadRecordingForSQL;

public interface WebsiteInfoMapper {

	void addCarouselMap(CarouselMap carouselMap);

	int deleteCarouselMap(Integer carouselId);

	CarouselMap getCarouselMapInfo(Integer carouselId);

	void updateCarouselMapWithImg(CarouselMap carouselMap);

	void updateCarouselMapWithoutImg(CarouselMap carouselMap);

	int getCarouselMapCount();

	List<CarouselMap> getCarouselMapManage(int startNum);

	List<CarouselMap> getAllCarouselMaps();

	void addDownloadRecordingForCourse(DownloadRecordingForSQL downloadRecording);

	void addCourseDownloadNum(String courseType, Integer courseId);

	int getDownloadRecordingCount();

	List<DownloadRecording> getDownloadRecordings(int startNum);

	int deleteDownloadRecording(Integer downloadRecordingId);

	List<DownloadRecording> getDownloadRecordingsByUser(int startNum, Integer userId);

	
}

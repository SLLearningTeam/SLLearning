package cn.net.realloyal.model;

public class ReadingCourse extends Course {

	private String courseChineseContent;

	public String getCourseChineseContent() {
		return courseChineseContent;
	}

	public void setCourseChineseContent(String courseChineseContent) {
		this.courseChineseContent = courseChineseContent;
	}

	public ReadingCourse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReadingCourse(int courseId, LanguageType languageType, RateType rateType, String courseName,
			String courseChineseContent,String courseEnglishContent, String courseResourceUrl, int downloadNum, String instructionImgUrl) {
		super(courseId, languageType, rateType, courseName, courseEnglishContent, courseResourceUrl, downloadNum,
				instructionImgUrl);
		this.courseChineseContent=courseChineseContent;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Course [courseId=" + this.getCourseId() + ", languageType=" + this.getLanguageType() + ", rateType=" + this.getRateType()
				+ ", courseName=" + this.getCourseName() + ", courseEnglishContent=" + getCourseEnglishContent()+ ", courseChineseContent=" + getCourseChineseContent()
				+ ", courseResourceUrl=" + this.getCourseResourceUrl() + ", downloadNum=" + this.getDownloadNum() + ", instructionImgUrl="
				+ this.getInstructionImgUrl() + "]";
	}
	
	
	
	

}

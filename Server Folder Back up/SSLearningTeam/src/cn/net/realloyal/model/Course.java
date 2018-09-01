package cn.net.realloyal.model;

public class Course {
	private int courseId;

	private LanguageType languageType;

	private RateType rateType;

	private String courseName;

	private String courseEnglishContent;

	private String courseResourceUrl;

	private int downloadNum;

	private String instructionImgUrl;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public LanguageType getLanguageType() {
		return languageType;
	}

	public void setLanguageType(LanguageType languageType) {
		this.languageType = languageType;
	}

	public RateType getRateType() {
		return rateType;
	}

	public void setRateType(RateType rateType) {
		this.rateType = rateType;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseEnglishContent() {
		return courseEnglishContent;
	}

	public void setCourseEnglishContent(String courseEnglishContent) {
		this.courseEnglishContent = courseEnglishContent;
	}

	public String getCourseResourceUrl() {
		return courseResourceUrl;
	}

	public void setCourseResourceUrl(String courseResourceUrl) {
		this.courseResourceUrl = courseResourceUrl;
	}

	public int getDownloadNum() {
		return downloadNum;
	}

	public void setDownloadNum(int downloadNum) {
		this.downloadNum = downloadNum;
	}

	public String getInstructionImgUrl() {
		return instructionImgUrl;
	}

	public void setInstructionImgUrl(String instructionImgUrl) {
		this.instructionImgUrl = instructionImgUrl;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", languageType=" + languageType + ", rateType=" + rateType
				+ ", courseName=" + courseName + ", courseEnglishContent=" + courseEnglishContent
				+ ", courseResourceUrl=" + courseResourceUrl + ", downloadNum=" + downloadNum + ", instructionImgUrl="
				+ instructionImgUrl + "]";
	}

	public Course() {
		super();
	}

	public Course(int courseId, LanguageType languageType, RateType rateType, String courseName,
			String courseEnglishContent, String courseResourceUrl, int downloadNum, String instructionImgUrl) {
		super();
		this.courseId = courseId;
		this.languageType = languageType;
		this.rateType = rateType;
		this.courseName = courseName;
		this.courseEnglishContent = courseEnglishContent;
		this.courseResourceUrl = courseResourceUrl;
		this.downloadNum = downloadNum;
		this.instructionImgUrl = instructionImgUrl;
	}
	
}

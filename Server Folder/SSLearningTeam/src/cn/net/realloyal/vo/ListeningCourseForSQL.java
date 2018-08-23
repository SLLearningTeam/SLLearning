package cn.net.realloyal.vo;


public class ListeningCourseForSQL {
	private int courseId;

	private int languageTypeId;

	private int rateTypeId;

	private String courseName;

	private String courseEnglishContent;
	
	private String courseChineseContent;

	private String courseResourceUrl;

	private int downloadNum;

	private String instructionImgUrl;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getLanguageTypeId() {
		return languageTypeId;
	}

	public void setLanguageTypeId(int languageTypeId) {
		this.languageTypeId = languageTypeId;
	}

	public int getRateTypeId() {
		return rateTypeId;
	}

	public void setRateTypeId(int rateTypeId) {
		this.rateTypeId = rateTypeId;
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

	public String getCourseChineseContent() {
		return courseChineseContent;
	}

	public void setCourseChineseContent(String courseChineseContent) {
		this.courseChineseContent = courseChineseContent;
	}

	@Override
	public String toString() {
		return "ListeningCourseForSQL [courseId=" + courseId + ", languageTypeId=" + languageTypeId + ", rateTypeId="
				+ rateTypeId + ", courseName=" + courseName + ", courseEnglishContent=" + courseEnglishContent
				+ ", courseChineseContent=" + courseChineseContent + ", courseResourceUrl=" + courseResourceUrl
				+ ", downloadNum=" + downloadNum + ", instructionImgUrl=" + instructionImgUrl + "]";
	}

	public ListeningCourseForSQL(int courseId, int languageTypeId, int rateTypeId, String courseName,
			String courseEnglishContent, String courseChineseContent, String courseResourceUrl, int downloadNum,
			String instructionImgUrl) {
		super();
		this.courseId = courseId;
		this.languageTypeId = languageTypeId;
		this.rateTypeId = rateTypeId;
		this.courseName = courseName;
		this.courseEnglishContent = courseEnglishContent;
		this.courseChineseContent = courseChineseContent;
		this.courseResourceUrl = courseResourceUrl;
		this.downloadNum = downloadNum;
		this.instructionImgUrl = instructionImgUrl;
	}

	public ListeningCourseForSQL() {
		super();
	}
}

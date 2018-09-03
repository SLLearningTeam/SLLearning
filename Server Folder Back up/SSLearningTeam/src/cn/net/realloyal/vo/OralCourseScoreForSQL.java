package cn.net.realloyal.vo;

public class OralCourseScoreForSQL {
	
	private int oralCourseScoreId;
	private String courseType;
	private int courseId;
	private int userId;
	private int oralScore;
	public int getOralCourseScoreId() {
		return oralCourseScoreId;
	}
	public void setOralCourseScoreId(int oralCourseScoreId) {
		this.oralCourseScoreId = oralCourseScoreId;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getOralScore() {
		return oralScore;
	}
	public void setOralScore(int oralScore) {
		this.oralScore = oralScore;
	}
	@Override
	public String toString() {
		return "OralCourseScoreForSQL [oralCourseScoreId=" + oralCourseScoreId + ", courseType=" + courseType
				+ ", courseId=" + courseId + ", userId=" + userId + ", oralScore=" + oralScore + "]";
	}
	public OralCourseScoreForSQL(int oralCourseScoreId, String courseType, int courseId, int userId, int oralScore) {
		super();
		this.oralCourseScoreId = oralCourseScoreId;
		this.courseType = courseType;
		this.courseId = courseId;
		this.userId = userId;
		this.oralScore = oralScore;
	}
	public OralCourseScoreForSQL() {
		super();
	}

}

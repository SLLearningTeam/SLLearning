package cn.net.realloyal.model;

public class OralCourseScore {

	private int oralCourseScoreId;

	private Course course;

	private User user;

	private int oralScore;

	public int getOralCourseScoreId() {
		return oralCourseScoreId;
	}

	public void setOralCourseScoreId(int oralCourseScoreId) {
		this.oralCourseScoreId = oralCourseScoreId;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getOralScore() {
		return oralScore;
	}

	public void setOralScore(int oralScore) {
		this.oralScore = oralScore;
	}

	@Override
	public String toString() {
		return "OralCourseScore [oralCourseScoreId=" + oralCourseScoreId + ", course=" + course + ", user=" + user
				+ ", oralScore=" + oralScore + "]";
	}

	public OralCourseScore() {
		super();
	}

	public OralCourseScore(int oralCourseScoreId, Course course, User user, int oralScore) {
		super();
		this.oralCourseScoreId = oralCourseScoreId;
		this.course = course;
		this.user = user;
		this.oralScore = oralScore;
	}
	
	

}

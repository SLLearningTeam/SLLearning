package cn.net.realloyal.vo;

public class HistoryRecordingForSQL {
	private int historyRecordingId;
	private int userId;
	private String courseType;
	private int courseId;
	private String recentRecordingTime;
	private int viewTimes;
	public HistoryRecordingForSQL(int historyRecordingId, int userId, String courseType, int courseId,
			String recentRecordingTime, int viewTimes) {
		super();
		this.historyRecordingId = historyRecordingId;
		this.userId = userId;
		this.courseType = courseType;
		this.courseId = courseId;
		this.recentRecordingTime = recentRecordingTime;
		this.viewTimes = viewTimes;
	}
	@Override
	public String toString() {
		return "HistoryRecordingForSQL [historyRecordingId=" + historyRecordingId + ", userId=" + userId
				+ ", courseType=" + courseType + ", courseId=" + courseId + ", recentRecordingTime="
				+ recentRecordingTime + ", viewTimes=" + viewTimes + "]";
	}
	public int getHistoryRecordingId() {
		return historyRecordingId;
	}
	public void setHistoryRecordingId(int historyRecordingId) {
		this.historyRecordingId = historyRecordingId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getRecentRecordingTime() {
		return recentRecordingTime;
	}
	public void setRecentRecordingTime(String recentRecordingTime) {
		this.recentRecordingTime = recentRecordingTime;
	}
	public int getViewTimes() {
		return viewTimes;
	}
	public void setViewTimes(int viewTimes) {
		this.viewTimes = viewTimes;
	}
	public HistoryRecordingForSQL() {
		super();
	}
	
}

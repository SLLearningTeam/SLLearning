package cn.net.realloyal.vo;

import java.util.Date;

public class DownloadRecordingForSQL {
	private int downloadRecordingId;
	private int userId;
	private String courseType;
	private int courseId;
	private String downloadRecordingTime;
	public int getDownloadRecordingId() {
		return downloadRecordingId;
	}
	public void setDownloadRecordingId(int downloadRecordingId) {
		this.downloadRecordingId = downloadRecordingId;
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
	public String getDownloadRecordingTime() {
		return downloadRecordingTime;
	}
	public void setDownloadRecordingTime(String downloadRecordingTime) {
		this.downloadRecordingTime = downloadRecordingTime;
	}
	@Override
	public String toString() {
		return "DownloadRecordingForSQL [downloadRecordingId=" + downloadRecordingId + ", userId=" + userId
				+ ", courseType=" + courseType + ", courseId=" + courseId + ", downloadRecordingTime="
				+ downloadRecordingTime + "]";
	}
	public DownloadRecordingForSQL(int downloadRecordingId, int userId, String courseType, int courseId,
			String downloadRecordingTime) {
		super();
		this.downloadRecordingId = downloadRecordingId;
		this.userId = userId;
		this.courseType = courseType;
		this.courseId = courseId;
		this.downloadRecordingTime = downloadRecordingTime;
	}
	public DownloadRecordingForSQL() {
		super();
	}
	
}

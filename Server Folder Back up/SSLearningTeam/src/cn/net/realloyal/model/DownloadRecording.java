package cn.net.realloyal.model;

import java.util.Date;

public class DownloadRecording {

	private int downloadRecordingId;

	private User user;

	private String courseType;

	private Course course;

	private Date downloadRecordingTime;

	public int getDownloadRecordingId() {
		return downloadRecordingId;
	}

	public void setDownloadRecordingId(int downloadRecordingId) {
		this.downloadRecordingId = downloadRecordingId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Date getDownloadRecordingTime() {
		return downloadRecordingTime;
	}

	public void setDownloadRecordingTime(Date downloadRecordingTime) {
		this.downloadRecordingTime = downloadRecordingTime;
	}

	@Override
	public String toString() {
		return "DownloadRecording [downloadRecordingId=" + downloadRecordingId + ", user=" + user + ", courseType="
				+ courseType + ", course=" + course + ", downloadRecordingTime=" + downloadRecordingTime + "]";
	}

	public DownloadRecording(int downloadRecordingId, User user, String courseType, Course course,
			Date downloadRecordingTime) {
		super();
		this.downloadRecordingId = downloadRecordingId;
		this.user = user;
		this.courseType = courseType;
		this.course = course;
		this.downloadRecordingTime = downloadRecordingTime;
	}

	public DownloadRecording() {
		super();
	}
	
	

}

package cn.net.realloyal.model;

import java.util.Date;

public class HistoryRecording {

	private int historyRecordingId;

	private User user;

	private Course course;

	private Date recentRecordingTime;

	private int viewTimes;

	public int getHistoryRecordingId() {
		return historyRecordingId;
	}

	public void setHistoryRecordingId(int historyRecordingId) {
		this.historyRecordingId = historyRecordingId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Date getRecentRecordingTime() {
		return recentRecordingTime;
	}

	public void setRecentRecordingTime(Date recentRecordingTime) {
		this.recentRecordingTime = recentRecordingTime;
	}

	public int getViewTimes() {
		return viewTimes;
	}

	public void setViewTimes(int viewTimes) {
		this.viewTimes = viewTimes;
	}

	@Override
	public String toString() {
		return "HistoryRecording [historyRecordingId=" + historyRecordingId + ", user=" + user + ", course=" + course
				+ ", recentRecordingTime=" + recentRecordingTime + ", viewTimes=" + viewTimes + "]";
	}

	public HistoryRecording() {
		super();
	}

	public HistoryRecording(int historyRecordingId, User user, Course course, Date recentRecordingTime, int viewTimes) {
		super();
		this.historyRecordingId = historyRecordingId;
		this.user = user;
		this.course = course;
		this.recentRecordingTime = recentRecordingTime;
		this.viewTimes = viewTimes;
	}
	
	

}

package cn.net.realloyal.model;

import java.util.Date;

public class SubscriptionRecording {

	private int subscriptionRecordingId;

	private Date subscriptionTime;

	private User user;

	private Course course;

	public int getSubscriptionRecordingId() {
		return subscriptionRecordingId;
	}

	public void setSubscriptionRecordingId(int subscriptionRecordingId) {
		this.subscriptionRecordingId = subscriptionRecordingId;
	}

	public Date getSubscriptionTime() {
		return subscriptionTime;
	}

	public void setSubscriptionTime(Date subscriptionTime) {
		this.subscriptionTime = subscriptionTime;
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

	@Override
	public String toString() {
		return "SubscriptionRecording [subscriptionRecordingId=" + subscriptionRecordingId + ", subscriptionTime="
				+ subscriptionTime + ", user=" + user + ", course=" + course + "]";
	}

	public SubscriptionRecording(int subscriptionRecordingId, Date subscriptionTime, User user, Course course) {
		super();
		this.subscriptionRecordingId = subscriptionRecordingId;
		this.subscriptionTime = subscriptionTime;
		this.user = user;
		this.course = course;
	}

	public SubscriptionRecording() {
		super();
	}

}

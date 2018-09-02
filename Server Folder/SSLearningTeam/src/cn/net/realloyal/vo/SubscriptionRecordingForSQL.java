package cn.net.realloyal.vo;

public class SubscriptionRecordingForSQL {
	
	private int subscriptionRecordingId;
	private String subscriptionTime;
	private int userId;
	private String courseType;
	private int courseId;
	public SubscriptionRecordingForSQL(int subscriptionRecordingId, String subscriptionTime, int userId,
			String courseType, int courseId) {
		super();
		this.subscriptionRecordingId = subscriptionRecordingId;
		this.subscriptionTime = subscriptionTime;
		this.userId = userId;
		this.courseType = courseType;
		this.courseId = courseId;
	}
	public SubscriptionRecordingForSQL() {
		super();
	}
	@Override
	public String toString() {
		return "SubscriptionRecordingForSQL [subscriptionRecordingId=" + subscriptionRecordingId + ", subscriptionTime="
				+ subscriptionTime + ", userId=" + userId + ", courseType=" + courseType + ", courseId=" + courseId
				+ "]";
	}
	public int getSubscriptionRecordingId() {
		return subscriptionRecordingId;
	}
	public void setSubscriptionRecordingId(int subscriptionRecordingId) {
		this.subscriptionRecordingId = subscriptionRecordingId;
	}
	public String getSubscriptionTime() {
		return subscriptionTime;
	}
	public void setSubscriptionTime(String subscriptionTime) {
		this.subscriptionTime = subscriptionTime;
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
}

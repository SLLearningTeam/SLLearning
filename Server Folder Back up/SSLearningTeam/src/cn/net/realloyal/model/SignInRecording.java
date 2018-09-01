package cn.net.realloyal.model;

import java.util.Date;

public class SignInRecording {

	private int signInId;

	private User user;

	private int totalTimes;

	private Date recentMark;

	public int getSignInId() {
		return signInId;
	}

	public void setSignInId(int signInId) {
		this.signInId = signInId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getTotalTimes() {
		return totalTimes;
	}

	public void setTotalTimes(int totalTimes) {
		this.totalTimes = totalTimes;
	}

	public Date getRecentMark() {
		return recentMark;
	}

	public void setRecentMark(Date recentMark) {
		this.recentMark = recentMark;
	}

	@Override
	public String toString() {
		return "SignInRecording [signInId=" + signInId + ", user=" + user + ", totalTimes=" + totalTimes
				+ ", recentMark=" + recentMark + "]";
	}

	public SignInRecording(int signInId, User user, int totalTimes, Date recentMark) {
		super();
		this.signInId = signInId;
		this.user = user;
		this.totalTimes = totalTimes;
		this.recentMark = recentMark;
	}

	public SignInRecording() {
		super();
	}

}

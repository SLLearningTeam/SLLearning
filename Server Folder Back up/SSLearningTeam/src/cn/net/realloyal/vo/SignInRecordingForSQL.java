package cn.net.realloyal.vo;

public class SignInRecordingForSQL {

	private int signInId;
	private int userId;
	private int totalTimes;
	private String recentMark;
	public SignInRecordingForSQL(int signInId, int userId, int totalTimes, String recentMark) {
		super();
		this.signInId = signInId;
		this.userId = userId;
		this.totalTimes = totalTimes;
		this.recentMark = recentMark;
	}
	public SignInRecordingForSQL() {
		super();
	}
	@Override
	public String toString() {
		return "SignInRecordingForSQL [signInId=" + signInId + ", userId=" + userId + ", totalTimes=" + totalTimes
				+ ", recentMark=" + recentMark + "]";
	}
	public int getSignInId() {
		return signInId;
	}
	public void setSignInId(int signInId) {
		this.signInId = signInId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getTotalTimes() {
		return totalTimes;
	}
	public void setTotalTimes(int totalTimes) {
		this.totalTimes = totalTimes;
	}
	public String getRecentMark() {
		return recentMark;
	}
	public void setRecentMark(String recentMark) {
		this.recentMark = recentMark;
	}
}

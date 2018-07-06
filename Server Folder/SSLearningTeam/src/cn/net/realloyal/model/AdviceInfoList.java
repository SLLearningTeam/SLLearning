package cn.net.realloyal.model;

import java.util.Date;

public class AdviceInfoList {

	private int adviceId;

	private User user;

	private Date adviceSendTime;

	private String adviceInfo;

	private boolean adviceReviewStatus;

	private int adviceReviewAdminId;

	public int getAdviceId() {
		return adviceId;
	}

	public void setAdviceId(int adviceId) {
		this.adviceId = adviceId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getAdviceSendTime() {
		return adviceSendTime;
	}

	public void setAdviceSendTime(Date adviceSendTime) {
		this.adviceSendTime = adviceSendTime;
	}

	public String getAdviceInfo() {
		return adviceInfo;
	}

	public void setAdviceInfo(String adviceInfo) {
		this.adviceInfo = adviceInfo;
	}

	public boolean isAdviceReviewStatus() {
		return adviceReviewStatus;
	}

	public void setAdviceReviewStatus(boolean adviceReviewStatus) {
		this.adviceReviewStatus = adviceReviewStatus;
	}

	public int getAdviceReviewAdminId() {
		return adviceReviewAdminId;
	}

	public void setAdviceReviewAdminId(int adviceReviewAdminId) {
		this.adviceReviewAdminId = adviceReviewAdminId;
	}

	@Override
	public String toString() {
		return "AdviceInfoList [adviceId=" + adviceId + ", user=" + user + ", adviceSendTime=" + adviceSendTime
				+ ", adviceInfo=" + adviceInfo + ", adviceReviewStatus=" + adviceReviewStatus + ", adviceReviewAdminId="
				+ adviceReviewAdminId + "]";
	}

	public AdviceInfoList(int adviceId, User user, Date adviceSendTime, String adviceInfo, boolean adviceReviewStatus,
			int adviceReviewAdminId) {
		super();
		this.adviceId = adviceId;
		this.user = user;
		this.adviceSendTime = adviceSendTime;
		this.adviceInfo = adviceInfo;
		this.adviceReviewStatus = adviceReviewStatus;
		this.adviceReviewAdminId = adviceReviewAdminId;
	}

	public AdviceInfoList() {
		super();
	}
	

}

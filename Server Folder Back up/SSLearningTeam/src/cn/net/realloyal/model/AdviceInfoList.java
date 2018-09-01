package cn.net.realloyal.model;

import java.util.Date;

public class AdviceInfoList {

	private int adviceId;

	private User user;

	private Date adviceSendTime;

	private String adviceInfo;

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

	public AdviceInfoList(int adviceId, User user, Date adviceSendTime, String adviceInfo) {
		super();
		this.adviceId = adviceId;
		this.user = user;
		this.adviceSendTime = adviceSendTime;
		this.adviceInfo = adviceInfo;
	}

	@Override
	public String toString() {
		return "AdviceInfoList [adviceId=" + adviceId + ", user=" + user + ", adviceSendTime=" + adviceSendTime
				+ ", adviceInfo=" + adviceInfo + "]";
	}

	public AdviceInfoList() {
		super();
	}
	

}

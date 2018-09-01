package cn.net.realloyal.vo;

public class AdviceInfoListForSQL {
	private int adviceId;
	private int userId;
	private String adviceSendTime;
	private String adviceInfo;
	public int getAdviceId() {
		return adviceId;
	}
	public void setAdviceId(int adviceId) {
		this.adviceId = adviceId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getAdviceSendTime() {
		return adviceSendTime;
	}
	public void setAdviceSendTime(String adviceSendTime) {
		this.adviceSendTime = adviceSendTime;
	}
	public String getAdviceInfo() {
		return adviceInfo;
	}
	public void setAdviceInfo(String adviceInfo) {
		this.adviceInfo = adviceInfo;
	}
	@Override
	public String toString() {
		return "AdviceInfoListForSQL [adviceId=" + adviceId + ", userId=" + userId + ", adviceSendTime="
				+ adviceSendTime + ", adviceInfo=" + adviceInfo + "]";
	}
	public AdviceInfoListForSQL(int adviceId, int userId, String adviceSendTime, String adviceInfo) {
		super();
		this.adviceId = adviceId;
		this.userId = userId;
		this.adviceSendTime = adviceSendTime;
		this.adviceInfo = adviceInfo;
	}
	public AdviceInfoListForSQL() {
		super();
	}
}

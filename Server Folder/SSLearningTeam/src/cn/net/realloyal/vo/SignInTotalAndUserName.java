package cn.net.realloyal.vo;

public class SignInTotalAndUserName {
	private String userName;
	private int totalTimes;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getTotalTimes() {
		return totalTimes;
	}
	public void setTotalTimes(int totalTimes) {
		this.totalTimes = totalTimes;
	}
	@Override
	public String toString() {
		return "SignInTotalAndUserName [userName=" + userName + ", totalTimes=" + totalTimes + "]";
	}
	public SignInTotalAndUserName(String userName, int totalTimes) {
		super();
		this.userName = userName;
		this.totalTimes = totalTimes;
	}
	public SignInTotalAndUserName() {
		super();
	}
}

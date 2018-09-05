package cn.net.realloyal.vo;

public class SignInTimeAndCount {
	private String recentMarkTime;
	private int count;
	public String getRecentMarkTime() {
		return recentMarkTime;
	}
	public void setRecentMarkTime(String recentMarkTime) {
		this.recentMarkTime = recentMarkTime;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "SignInTimeAndCount [recentMarkTime=" + recentMarkTime + ", count=" + count + "]";
	}
	public SignInTimeAndCount(String recentMarkTime, int count) {
		super();
		this.recentMarkTime = recentMarkTime;
		this.count = count;
	}
	public SignInTimeAndCount() {
		super();
	}
}

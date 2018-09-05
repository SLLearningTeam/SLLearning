package cn.net.realloyal.vo;

public class DownloadNumAndCount {
	private String downloadRecordingTime;
	private int count;
	public String getDownloadRecordingTime() {
		return downloadRecordingTime;
	}
	public void setDownloadRecordingTime(String downloadRecordingTime) {
		this.downloadRecordingTime = downloadRecordingTime;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "DownloadNumAndCount [downloadRecordingTime=" + downloadRecordingTime + ", count=" + count + "]";
	}
	public DownloadNumAndCount(String downloadRecordingTime, int count) {
		super();
		this.downloadRecordingTime = downloadRecordingTime;
		this.count = count;
	}
	public DownloadNumAndCount() {
		super();
	}
}

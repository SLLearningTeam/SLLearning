package cn.net.realloyal.core.util;

public class BackJsonUtil {
	
	private Boolean status;
	private Object info;
	public BackJsonUtil() {
		
	}
	public BackJsonUtil(Boolean status,Object info) {
		this.status = status;
		this.info = info;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Object getInfo() {
		return info;
	}
	public void setInfo(Object info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "{\"status\":" + status + ",\"info\":" + info+"}";
	}
	
}

package cn.net.realloyal.vo;

public class RateTypeForSQL {
	private int rateTypeId;
	private int languageTypeId;
	private String rateName;
	private String rateIconUrl;
	public int getRateTypeId() {
		return rateTypeId;
	}
	public void setRateTypeId(int rateTypeId) {
		this.rateTypeId = rateTypeId;
	}
	public int getLanguageTypeId() {
		return languageTypeId;
	}
	public void setLanguageTypeId(int languageTypeId) {
		this.languageTypeId = languageTypeId;
	}
	public String getRateName() {
		return rateName;
	}
	public void setRateName(String rateName) {
		this.rateName = rateName;
	}
	public String getRateIconUrl() {
		return rateIconUrl;
	}
	public void setRateIconUrl(String rateIconUrl) {
		this.rateIconUrl = rateIconUrl;
	}
	@Override
	public String toString() {
		return "RateTypeForSQL [rateTypeId=" + rateTypeId + ", languageTypeId=" + languageTypeId + ", rateName="
				+ rateName + ", rateIconUrl=" + rateIconUrl + "]";
	}
}

package cn.net.realloyal.model;

public class RateType {

	private int rateTypeId;

	private LanguageType languageType;

	private String rateName;

	private String rateIconUrl;

	public int getRateTypeId() {
		return rateTypeId;
	}

	public void setRateTypeId(int rateTypeId) {
		this.rateTypeId = rateTypeId;
	}

	public LanguageType getLanguageType() {
		return languageType;
	}

	public void setLanguageType(LanguageType languageType) {
		this.languageType = languageType;
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
		return "RateType [rateTypeId=" + rateTypeId + ", languageType=" + languageType + ", rateName=" + rateName
				+ ", rateIconUrl=" + rateIconUrl + "]";
	}

	public RateType() {
		super();
	}

	public RateType(int rateTypeId, LanguageType languageType, String rateName, String rateIconUrl) {
		super();
		this.rateTypeId = rateTypeId;
		this.languageType = languageType;
		this.rateName = rateName;
		this.rateIconUrl = rateIconUrl;
	}
	
	

}

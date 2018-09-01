package cn.net.realloyal.model;

public class LanguageType {

	private int languageTypeId;

	private String languageName;

	private String languageIconUrl;

	public int getLanguageTypeId() {
		return languageTypeId;
	}

	public void setLanguageTypeId(int languageTypeId) {
		this.languageTypeId = languageTypeId;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public String getLanguageIconUrl() {
		return languageIconUrl;
	}

	public void setLanguageIconUrl(String languageIconUrl) {
		this.languageIconUrl = languageIconUrl;
	}

	@Override
	public String toString() {
		return "LanguageType [languageTypeId=" + languageTypeId + ", languageName=" + languageName
				+ ", languageIconUrl=" + languageIconUrl + "]";
	}

	public LanguageType() {
		super();
	}

	public LanguageType(int languageTypeId, String languageName, String languageIconUrl) {
		super();
		this.languageTypeId = languageTypeId;
		this.languageName = languageName;
		this.languageIconUrl = languageIconUrl;
	}
	
	

}

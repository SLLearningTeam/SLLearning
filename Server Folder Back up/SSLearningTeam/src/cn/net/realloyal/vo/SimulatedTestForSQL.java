package cn.net.realloyal.vo;

public class SimulatedTestForSQL {
	private int simulatedTestId;
	private int languageTypeId;
	private int rateTypeId;
	private String testName;
	private String instructionImgUrl;
	public SimulatedTestForSQL(int simulatedTestId, int languageTypeId, int rateTypeId, String testName,
			String instructionImgUrl) {
		super();
		this.simulatedTestId = simulatedTestId;
		this.languageTypeId = languageTypeId;
		this.rateTypeId = rateTypeId;
		this.testName = testName;
		this.instructionImgUrl = instructionImgUrl;
	}
	public SimulatedTestForSQL() {
		super();
	}
	@Override
	public String toString() {
		return "SimulatedTestForSQL [simulatedTestId=" + simulatedTestId + ", languageTypeId=" + languageTypeId
				+ ", rateTypeId=" + rateTypeId + ", testName=" + testName + ", instructionImgUrl=" + instructionImgUrl
				+ "]";
	}
	public int getSimulatedTestId() {
		return simulatedTestId;
	}
	public void setSimulatedTestId(int simulatedTestId) {
		this.simulatedTestId = simulatedTestId;
	}
	public int getLanguageTypeId() {
		return languageTypeId;
	}
	public void setLanguageTypeId(int languageTypeId) {
		this.languageTypeId = languageTypeId;
	}
	public int getRateTypeId() {
		return rateTypeId;
	}
	public void setRateTypeId(int rateTypeId) {
		this.rateTypeId = rateTypeId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getInstructionImgUrl() {
		return instructionImgUrl;
	}
	public void setInstructionImgUrl(String instructionImgUrl) {
		this.instructionImgUrl = instructionImgUrl;
	}
	
}

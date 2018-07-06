package cn.net.realloyal.model;

public class SimulatedTest {

	private int simulatedTestId;

	private LanguageType languageType;

	private RateType rateType;

	private String testName;

	private String instructionImgUrl;

	public int getSimulatedTestId() {
		return simulatedTestId;
	}

	public void setSimulatedTestId(int simulatedTestId) {
		this.simulatedTestId = simulatedTestId;
	}

	public LanguageType getLanguageType() {
		return languageType;
	}

	public void setLanguageType(LanguageType languageType) {
		this.languageType = languageType;
	}

	public RateType getRateType() {
		return rateType;
	}

	public void setRateType(RateType rateType) {
		this.rateType = rateType;
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

	@Override
	public String toString() {
		return "SimulatedTest [simulatedTestId=" + simulatedTestId + ", languageType=" + languageType + ", rateType="
				+ rateType + ", testName=" + testName + ", instructionImgUrl=" + instructionImgUrl + "]";
	}

	public SimulatedTest() {
		super();
	}

	public SimulatedTest(int simulatedTestId, LanguageType languageType, RateType rateType, String testName,
			String instructionImgUrl) {
		super();
		this.simulatedTestId = simulatedTestId;
		this.languageType = languageType;
		this.rateType = rateType;
		this.testName = testName;
		this.instructionImgUrl = instructionImgUrl;
	}
	
	

}

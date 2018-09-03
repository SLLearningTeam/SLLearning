package cn.net.realloyal.vo;

public class TestQuestionResultForSQL {
	private int testQuestionResultId;
	private int userId;
	private int simulatedTestId;
	private int resultScore;
	public int getTestQuestionResultId() {
		return testQuestionResultId;
	}
	public void setTestQuestionResultId(int testQuestionResultId) {
		this.testQuestionResultId = testQuestionResultId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getSimulatedTestId() {
		return simulatedTestId;
	}
	public void setSimulatedTestId(int simulatedTestId) {
		this.simulatedTestId = simulatedTestId;
	}
	public int getResultScore() {
		return resultScore;
	}
	public void setResultScore(int resultScore) {
		this.resultScore = resultScore;
	}
	@Override
	public String toString() {
		return "TestQuestionResultForSQL [testQuestionResultId=" + testQuestionResultId + ", userId=" + userId
				+ ", simulatedTestId=" + simulatedTestId + ", resultScore=" + resultScore + "]";
	}
	public TestQuestionResultForSQL(int testQuestionResultId, int userId, int simulatedTestId, int resultScore) {
		super();
		this.testQuestionResultId = testQuestionResultId;
		this.userId = userId;
		this.simulatedTestId = simulatedTestId;
		this.resultScore = resultScore;
	}
	public TestQuestionResultForSQL() {
		super();
	}
}

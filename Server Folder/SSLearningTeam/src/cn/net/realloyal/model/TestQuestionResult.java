package cn.net.realloyal.model;

public class TestQuestionResult {

	private int testQuestionResultId;

	private User user;

	private SimulatedTest simulatedTest;

	private int resultScore;

	public int getTestQuestionResultId() {
		return testQuestionResultId;
	}

	public void setTestQuestionResultId(int testQuestionResultId) {
		this.testQuestionResultId = testQuestionResultId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public SimulatedTest getSimulatedTest() {
		return simulatedTest;
	}

	public void setSimulatedTest(SimulatedTest simulatedTest) {
		this.simulatedTest = simulatedTest;
	}

	public int getResultScore() {
		return resultScore;
	}

	public void setResultScore(int resultScore) {
		this.resultScore = resultScore;
	}

	@Override
	public String toString() {
		return "TestQuestionResult [testQuestionResultId=" + testQuestionResultId + ", user=" + user
				+ ", simulatedTest=" + simulatedTest + ", resultScore=" + resultScore + "]";
	}

	public TestQuestionResult(int testQuestionResultId, User user, SimulatedTest simulatedTest, int resultScore) {
		super();
		this.testQuestionResultId = testQuestionResultId;
		this.user = user;
		this.simulatedTest = simulatedTest;
		this.resultScore = resultScore;
	}

	public TestQuestionResult() {
		super();
	}
	

}

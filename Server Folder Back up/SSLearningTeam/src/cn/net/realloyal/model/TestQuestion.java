package cn.net.realloyal.model;

public class TestQuestion {

	private int testQuestionId;

	private String testQuestionName;

	private SimulatedTest simulatedTest;

	private Course course;

	public int getTestQuestionId() {
		return testQuestionId;
	}

	public void setTestQuestionId(int testQuestionId) {
		this.testQuestionId = testQuestionId;
	}

	public String getTestQuestionName() {
		return testQuestionName;
	}

	public void setTestQuestionName(String testQuestionName) {
		this.testQuestionName = testQuestionName;
	}

	public SimulatedTest getSimulatedTest() {
		return simulatedTest;
	}

	public void setSimulatedTest(SimulatedTest simulatedTest) {
		this.simulatedTest = simulatedTest;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "TestQuestion [testQuestionId=" + testQuestionId + ", testQuestionName=" + testQuestionName
				+ ", simulatedTest=" + simulatedTest + ", course=" + course + "]";
	}

	public TestQuestion(int testQuestionId, String testQuestionName, SimulatedTest simulatedTest, Course course) {
		super();
		this.testQuestionId = testQuestionId;
		this.testQuestionName = testQuestionName;
		this.simulatedTest = simulatedTest;
		this.course = course;
	}

	public TestQuestion() {
		super();
	}
	
	

}

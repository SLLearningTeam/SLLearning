package cn.net.realloyal.vo;

public class TestQuestionForSQL {
	private int testQuestionId;
	private String testQuestionName;
	private int simulatedTestId;
	private String courseType;
	private int courseId;
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
	public int getSimulatedTestId() {
		return simulatedTestId;
	}
	public void setSimulatedTestId(int simulatedTestId) {
		this.simulatedTestId = simulatedTestId;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	@Override
	public String toString() {
		return "TestQuestionForSQL [testQuestionId=" + testQuestionId + ", testQuestionName=" + testQuestionName
				+ ", simulatedTestId=" + simulatedTestId + ", courseType=" + courseType + ", courseId=" + courseId
				+ "]";
	}
	public TestQuestionForSQL(int testQuestionId, String testQuestionName, int simulatedTestId, String courseType,
			int courseId) {
		super();
		this.testQuestionId = testQuestionId;
		this.testQuestionName = testQuestionName;
		this.simulatedTestId = simulatedTestId;
		this.courseType = courseType;
		this.courseId = courseId;
	}
	public TestQuestionForSQL() {
		super();
	}
}

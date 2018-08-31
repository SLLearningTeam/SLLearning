package cn.net.realloyal.vo;


public class QuestionForSQL {
	private int questionId;

	private String courseType;
	
	private int courseId;

	private String questionContent;

	private String answerA;

	private String answerB;

	private String answerC;

	private String answerD;

	private int answerReal;

	private String answerReason;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
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

	public String getQuestionContent() {
		return questionContent;
	}

	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}

	public String getAnswerA() {
		return answerA;
	}

	public void setAnswerA(String answerA) {
		this.answerA = answerA;
	}

	public String getAnswerB() {
		return answerB;
	}

	public void setAnswerB(String answerB) {
		this.answerB = answerB;
	}

	public String getAnswerC() {
		return answerC;
	}

	public void setAnswerC(String answerC) {
		this.answerC = answerC;
	}

	public String getAnswerD() {
		return answerD;
	}

	public void setAnswerD(String answerD) {
		this.answerD = answerD;
	}

	public int getAnswerReal() {
		return answerReal;
	}

	public void setAnswerReal(int answerReal) {
		this.answerReal = answerReal;
	}

	public String getAnswerReason() {
		return answerReason;
	}

	public void setAnswerReason(String answerReason) {
		this.answerReason = answerReason;
	}

	@Override
	public String toString() {
		return "QuestionForSQL [questionId=" + questionId + ", courseType=" + courseType + ", courseId=" + courseId
				+ ", questionContent=" + questionContent + ", answerA=" + answerA + ", answerB=" + answerB
				+ ", answerC=" + answerC + ", answerD=" + answerD + ", answerReal=" + answerReal + ", answerReason="
				+ answerReason + "]";
	}

	public QuestionForSQL(int questionId, String courseType, int courseId, String questionContent, String answerA,
			String answerB, String answerC, String answerD, int answerReal, String answerReason) {
		super();
		this.questionId = questionId;
		this.courseType = courseType;
		this.courseId = courseId;
		this.questionContent = questionContent;
		this.answerA = answerA;
		this.answerB = answerB;
		this.answerC = answerC;
		this.answerD = answerD;
		this.answerReal = answerReal;
		this.answerReason = answerReason;
	}

	public QuestionForSQL() {
		super();
	}
	
}

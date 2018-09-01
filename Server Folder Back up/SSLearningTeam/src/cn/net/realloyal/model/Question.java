package cn.net.realloyal.model;

public class Question {

	private int questionId;

	private Course course;

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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
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
		return "Question [questionId=" + questionId + ", course=" + course + ", questionContent=" + questionContent
				+ ", answerA=" + answerA + ", answerB=" + answerB + ", answerC=" + answerC + ", answerD=" + answerD
				+ ", answerReal=" + answerReal + ", answerReason=" + answerReason + "]";
	}

	public Question() {
		super();
	}

	public Question(int questionId, Course course, String questionContent, String answerA, String answerB,
			String answerC, String answerD, int answerReal, String answerReason) {
		super();
		this.questionId = questionId;
		this.course = course;
		this.questionContent = questionContent;
		this.answerA = answerA;
		this.answerB = answerB;
		this.answerC = answerC;
		this.answerD = answerD;
		this.answerReal = answerReal;
		this.answerReason = answerReason;
	}
	
	

}

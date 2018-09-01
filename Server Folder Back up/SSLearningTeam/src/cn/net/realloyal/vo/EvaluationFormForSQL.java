package cn.net.realloyal.vo;

public class EvaluationFormForSQL {
	private int evaluationId;
	private String courseType;
	private int courseId;
	private int userId;
	private int evaluationLevel;
	public int getEvaluationId() {
		return evaluationId;
	}
	public void setEvaluationId(int evaluationId) {
		this.evaluationId = evaluationId;
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
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getEvaluationLevel() {
		return evaluationLevel;
	}
	public void setEvaluationLevel(int evaluationLevel) {
		this.evaluationLevel = evaluationLevel;
	}
	public EvaluationFormForSQL(int evaluationId, String courseType, int courseId, int userId, int evaluationLevel) {
		super();
		this.evaluationId = evaluationId;
		this.courseType = courseType;
		this.courseId = courseId;
		this.userId = userId;
		this.evaluationLevel = evaluationLevel;
	}
	public EvaluationFormForSQL() {
		super();
	}
	@Override
	public String toString() {
		return "evaluationFormForSQL [evaluationId=" + evaluationId + ", courseType=" + courseType + ", courseId="
				+ courseId + ", userId=" + userId + ", evaluationLevel=" + evaluationLevel + "]";
	}
}

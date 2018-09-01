package cn.net.realloyal.model;

public class EvaluationForm {

	private int evaluationId;

	private Course course;

	private User user;

	private int evaluationLevel;

	public int getEvaluationId() {
		return evaluationId;
	}

	public void setEvaluationId(int evaluationId) {
		this.evaluationId = evaluationId;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getEvaluationLevel() {
		return evaluationLevel;
	}

	public void setEvaluationLevel(int evaluationLevel) {
		this.evaluationLevel = evaluationLevel;
	}

	@Override
	public String toString() {
		return "EvaluationForm [evaluationId=" + evaluationId + ", course=" + course + ", user=" + user
				+ ", evaluationLevel=" + evaluationLevel + "]";
	}

	public EvaluationForm() {
		super();
	}

	public EvaluationForm(int evaluationId, Course course, User user, int evaluationLevel) {
		super();
		this.evaluationId = evaluationId;
		this.course = course;
		this.user = user;
		this.evaluationLevel = evaluationLevel;
	}
	

}

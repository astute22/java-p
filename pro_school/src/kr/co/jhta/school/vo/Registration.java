package kr.co.jhta.school.vo;

public class Registration {
	private String score;
	private Student student;
	private Course course;
	public Registration() {
		// TODO Auto-generated constructor stub
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Registration [score=" + score + ", student=" + student + ", course=" + course + "]";
	}
}

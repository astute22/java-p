package kr.co.jhta.school.vo;

import java.util.List;

public class Course {
	private int no;
	private int room;
	private int quota;
	private int regNum;
	private Subject subject;
	private Professor professor;
	
	private List<Student> students;
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public int getQuota() {
		return quota;
	}
	public void setQuota(int quota) {
		this.quota = quota;
	}
	public int getRegNum() {
		return regNum;
	}
	public void setRegNum(int regNum) {
		this.regNum = regNum;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Course [no=" + no + ", room=" + room + ", quota=" + quota + ", regNum=" + regNum + ", subject="
				+ subject + ", professor=" + professor + ", students=" + students + "]";
	}
}

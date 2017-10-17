package kr.co.jhta.school.vo;

import java.util.List;

public class Professor {
	private int no;
	private String name;
	private String position;
	private Dept dept;
	
	private List<Student> students; //지도학생들
	private List<Course> courses; //담당과목
	public Professor() {
		// TODO Auto-generated constructor stub
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Professor [no=" + no + ", name=" + name + ", position=" + position + ", dept=" + dept + ", students="
				+ students + ", courses=" + courses + ", getNo()=" + getNo() + ", getName()=" + getName()
				+ ", getPosition()=" + getPosition() + ", getDept()=" + getDept() + ", getStudents()=" + getStudents()
				+ ", getCourses()=" + getCourses() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}

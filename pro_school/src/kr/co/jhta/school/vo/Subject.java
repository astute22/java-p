package kr.co.jhta.school.vo;

public class Subject {
	private int no;
	private String name;
	private String type;
	private Dept dept;
	public Subject() {
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Subject [no=" + no + ", name=" + name + ", type=" + type + ", dept=" + dept + "]";
	}
}

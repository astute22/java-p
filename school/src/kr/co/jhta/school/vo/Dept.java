package kr.co.jhta.school.vo;

public class Dept {
	private int no;
	private String name;
	public Dept() {
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
	@Override
	public String toString() {
		return name + " [" + no + "]";
	}
	
}

package example5;

import java.util.Date;

public class Rental {
	private long no;			//대여번호
	private String title;		//대여한 비디오
	private String username;	//대여자 이름
	private String rentDate;	//대여일
	private int back;			//대출가능여부
	private String backDate;
	public Rental() {
		// TODO Auto-generated constructor stub
	}
	public Rental(String title, String username) {
		super();
		this.no = System.currentTimeMillis();
		this.title = title;
		this.username = username;
		this.rentDate = "2017/07/04";
		this.backDate = " ";
	}
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRentDate() {
		return rentDate;
	}
	public void setRentDate(String rentDate) {
		this.rentDate = rentDate;
	}
	public String getBackDate() {
		return backDate;
	}
	public void setBackDate(String backDate) {
		this.backDate = backDate;
	}
	public int back() {
		return back;
	}
	public void setBack(int back) {
		this.back = back;
	}
	@Override
	public String toString() {
		return no + "," + title + "," + username + "," + rentDate + ","
				+ back + "," + backDate;
	}
	
}

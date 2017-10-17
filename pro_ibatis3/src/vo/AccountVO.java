package vo;

import java.util.Date;

public class AccountVO {
	private int no;
	private String title;
	private String owner;
	private long balance;
	private double rates;
	private Date createDate;
	public AccountVO() {
		// TODO Auto-generated constructor stub
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public double getRates() {
		return rates;
	}
	public void setRates(double rates) {
		this.rates = rates;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "AccountVO [no=" + no + ", title=" + title + ", owner=" + owner + ", balance=" + balance + ", rates="
				+ rates + ", createDate=" + createDate + "]";
	}
	
}

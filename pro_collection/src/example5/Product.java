package example5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
	private int no;
	private String category;
	private String name;
	private int price;
	private Date pubdate;
	private boolean isSoldOut;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int no, String category, String name, int price, Date pubdate, boolean isSoldOut) {
		super();
		this.no = no;
		this.category = category;
		this.name = name;
		this.price = price;
		this.pubdate = pubdate;
		this.isSoldOut = isSoldOut;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getPubdate() {
		return pubdate;
	}
	public void setPubdate(Date pubdate) {
		this.pubdate = pubdate;
	}
	public boolean getIsSoldOut() {
		return isSoldOut;
	}
	public void setIsSoldOut(boolean isSoldOut) {
		this.isSoldOut = isSoldOut;
	}
	@Override
	public String toString() {
		return "Product [no=" + no + ", category=" + category + ", name=" + name + ", price=" + price + ", pubdate="
				+ pubdate + ", isSoldOut=" + isSoldOut + "]";
	}
	public String getPubdateString(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(pubdate);
	}
}

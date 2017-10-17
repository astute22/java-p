package example1;

public class Car {
	private String name;
	private String inc;
	private int year;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(String name, String inc, int year) {
		super();
		this.name = name;
		this.inc = inc;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInc() {
		return inc;
	}
	public void setInc(String inc) {
		this.inc = inc;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", inc=" + inc + ", year=" + year + "]";
	}
	

}

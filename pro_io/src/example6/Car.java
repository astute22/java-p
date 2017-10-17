package example6;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Car implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int year;
	private String name;
	private String comp;
	private int price;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [year=" + year + ", name=" + name + ", comp=" + comp + ", price=" + price + "]";
	}
	private void writeObject(ObjectOutputStream out) throws IOException{
		//직렬화시 자동실행
		System.out.println("Car의 writeObject()가 실행됨");
		out.writeInt(year);
		out.writeUTF(name);
		out.writeUTF(comp);
	}
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
		//역직렬화시 자동실행
		System.out.println("Car의 readObject()가 실행됨");
		this.year = in.readInt();
		this.name = in.readUTF();
		this.comp = in.readUTF();
	}
	
}

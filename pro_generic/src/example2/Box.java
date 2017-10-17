package example2;

public class Box<T> {
	private T item;
	public Box() {
		// TODO Auto-generated constructor stub
	}
	public void put(T item){
		this.item = item;
	}
	public T get(){
		return item;
	}
		
}

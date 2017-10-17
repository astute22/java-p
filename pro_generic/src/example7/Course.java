package example7;

public class Course<T> {
	private String name;
	private T[] students;
	private int position;
	
	public Course(String name, int capacity){
		this.name = name;
		students = (T[])(new Object[capacity]);
	}
	public String getName(){
		return name;
	}
	public void add(T t){
		students[position++] = t;
	}
}

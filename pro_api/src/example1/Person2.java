package example1;

public class Person2 implements Cloneable{
	private String name;
	private int age;
	private Car myCar;
	public Person2() {
		// TODO Auto-generated constructor stub
	}
	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Car getMyCar() {
		return myCar;
	}
	public void setMyCar(Car myCar) {
		this.myCar = myCar;
	}
	public Person2 getPerson2() throws CloneNotSupportedException {
		return (Person2)clone();
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//1. Object의 clone()을 이용해서 Person2객체를 얕은복제한다.
		Person2 copy = (Person2) super.clone();
		//2. Car를 수동으로 복사
		Car copyCar = new Car();
		copyCar.setName(myCar.getName());
		copyCar.setInc(myCar.getInc());
		copyCar.setYear(myCar.getYear());
		copy.setMyCar(copyCar);
		return copy;
	}
	@Override
	public String toString() {
		return "Person2 [name=" + name + ", age=" + age + ", myCar=" + myCar + "]";
	}
	

}

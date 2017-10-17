package example1;

public class ObjectDemo6 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Person2 org = new Person2("훔바훔바",37);
		Car car = new Car("Audi R8 Spyder", "Audi", 2017);
		org.setMyCar(car);
		
		Person2 copy = org.getPerson2();
		
		System.out.println("원  본 : " + org);
		System.out.println("복사본 : " + copy);
		
		//복사본 조작
		copy.setAge(50);
		copy.getMyCar().setYear(2014);
		
		System.out.println("원  본 : " + org);
		System.out.println("복사본 : " + copy);
		
	}

}

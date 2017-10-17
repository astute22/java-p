package example1;

public class ObjectDemo8 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//example1.Car 클래스를 메모리에 로딩
		//설계도 정보가 들어있는 class객체를 반환한다
		Class clazz = Class.forName("example1.Car");
		
		Car car = (Car)clazz.newInstance();
		car.setName("뉴비틀");
		car.setInc("볼프스바겐");
		car.setYear(2017);
		
		System.out.println(car);
	}

}

package example6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		User user = new User();
		user.setUserId("양쪼다");
		user.setEmail("Kia@gmail.com");
		user.setUserPw("zxcv1234");
		Car car = new Car();
		car.setYear(1986);
		car.setName("AE86");
		car.setComp("TOYOTA");
		car.setPrice(5000000);
		user.setMyCar(car);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:/Temp/user.sav"));
		oos.writeObject(user);
		oos.close();
	}

}

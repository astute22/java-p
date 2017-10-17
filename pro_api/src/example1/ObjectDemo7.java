package example1;
import java.lang.reflect.Method;
public class ObjectDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		//getClass()는 객체의 설계도 정보를 반환한다
		Class<?> clazz = car.getClass();
		
		String className = clazz.getName();
		System.out.println("패키지 포함 클래스명 : " + className);
		String simpleName = clazz.getSimpleName();
		System.out.println("클래스명 : " + simpleName);
		String packagePath = clazz.getPackage().getName();
		System.out.println("패키지경로 : " + packagePath);
		
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods ){
			String methodName = method.getName();
			System.out.println(methodName);
			
		}
	}

}

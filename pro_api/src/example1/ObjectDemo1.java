package example1;

public class ObjectDemo1 {
	
	public static void main(String[] args) {
		
			Person p1 = new Person("홍길동", 23);
			Person p2 = new Person("김유신", 31);
			Person p3 = p1;
			Person p4 = new Person("홍길동", 23);
			
			boolean result= p1.equals(p2);
			System.out.println(result);		// 다른 객체여서 false
			
			result = p1.equals(p3);
			System.out.println(result);		// p3은 p1과 같은 참조값을 가지고 있고 같은 객체를 가리키고 있어서 true
			
			result = p1.equals(p4);
			System.out.println(result);		// 값의 내용은 같지만 p1과 p4는 서로 다른 다른 객체여서 false
	}
}
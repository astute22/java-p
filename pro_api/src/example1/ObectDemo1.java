package example1;

public class ObectDemo1 {
	public static void main(String[] args) {
		Person p1 = new Person("훔바훔바", 36);
		Person p2 = new Person("황가드", 26);
		Person p3 = p1;
		Person p4 = new Person("훔바훔바", 36);
		
		boolean res = p1.equals(p2);
		System.out.println(res);
		
		res = p1.equals(p3);
		System.out.println(res);
		
		res = p1.equals(p4);
		System.out.println(res);
	}
}

package example1;

public class ObjectDemo2 {
	public static void main(String[] args) {
		Person p1 = new Person("훔바훔바", 36);
		Person p2 = new Person("황가드", 26);
		
		System.out.println(p1);
		System.out.println(p1.toString());
		
		System.out.println(p2);
		
		int hashCode1 = p1.hashCode();
		int hashCode2 = p2.hashCode();
		System.out.println("해시코드 : " + hashCode1);
		System.out.println("해시코드 : " + hashCode2);
		
	}
}
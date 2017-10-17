package example2;

public class WrapperDemo2 {
	public static void main(String[] args) {
		//오토박싱/언박싱
		//기본자료형과 대응되는 Wrapper객체간의 전환
		//java5부터 지원되는 기능
		
		//오토박싱
		Integer a = 10;	//Integer a = new Integer(10);
		Integer b = new Integer(10);
		System.out.println(a+b);	//a.intValue() + b.intValue();
		//언박싱
		int c = a;	//int c = a.intValue();
		int d = b;	//int d = b.intValue();
		System.out.println(c);
		System.out.println(d);
		System.out.println(c + d);
	}
}

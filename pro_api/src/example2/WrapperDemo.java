package example2;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수 10을 가지는 Wrapper객체 생성
		Integer a = new Integer(10);
		Integer b = new Integer("10");
		//오토박싱
		Integer c = 10;
		
		//실수 3.14를 가지는 Wrapper 객체 생성
		Double d = new Double(3.14);
		Double e = new Double("3.14");
		//오토박싱
		Double f = 3.14;
		
		//Wrapper 객체로 포장된 값을 비교할때 ==, != 사용금지
		System.out.println(a == b);
		System.out.println(a.equals(b));		
	}

}

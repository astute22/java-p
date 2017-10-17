package example2;

public class WrapperDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer, Double의 주요 API
		//상수 : MIN_VALE, MAX_VALUE 등등
		//생성자 : new Integer(int), new Integer(String), new Double(Double), new Double(String)
		//메소드 : byteValue(),intValue(), longValue(), doubleValue().....
		//		min(int, int), max(int, int), min(double, double), max(double, double)
		//정적메소드
		//		int Integer.parseInt(String txt);
		//		double Double.parseDouble(String txt)
		
		//Integer의 주요 API
		//상수
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		String txt1 = "10";
		String txt2 = "3.14";
		String txt3 = "1000000000000";
		
		int no1 = Integer.parseInt(txt1);
		double no2	=	Double.parseDouble(txt2);
		long no3 = Long.parseLong(txt3);
		
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
		
		String txt4 = "100";
		int no4 = Integer.parseInt(txt4,10);	//텍스트의 숫자를 10진수로 계산
		int no5 = Integer.parseInt(txt4, 2);	//텍스트의 숫자를 2진수로 계산
		System.out.println(no4);
		System.out.println(no5);
		

	}

}

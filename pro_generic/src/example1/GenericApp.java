package example1;

public class GenericApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String을 담기위한 객체 생성
		Box box = new Box();
		box.put(new String("세이콘"));
		//꺼낼때마다 타입형변환 필요
		String value = (String)box.get();
		System.out.println(value);
		
		//String이 아닌 다른 타입을 담아도 문제없음. 이렇기때문에 어떤 타입이 들어가있는지 모를 경우가 큼
		box.put(new Double(3.14));
		
		Box box2 = new Box();
		box2.put(new Integer(9));
		int value2 = (int) box2.get();
		System.out.println(value2);

	}

}

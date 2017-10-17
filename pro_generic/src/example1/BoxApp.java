package example1;

public class BoxApp {
	// object타입에 값을 담을 때는 이와 같이 형변환이 필요하다.
	public static void main(String[] args) {
		// String을 담기 위해 box1객체 생성
		Box box1 = new Box();
		box1.put(new String("홍길동"));
		// 꺼낼 때마다 타입형변환을 해야 한다.
		String item1 = (String) box1.get();
		System.out.println(item1);
		
		// String이 아닌 다른 타입의 객체가 저장되는 것을 막을 수 없다.
		box1.put(new Double(2.15));
		
		Box box2 = new Box();
		box2.put(new Integer(3));
		Integer item2 = (Integer) box2.get();
		System.out.println(item2);
		
	}
}
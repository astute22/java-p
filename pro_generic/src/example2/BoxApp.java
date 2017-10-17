package example2;

public class BoxApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box1 = new Box<String>();
		box1.put("황짜르트");
		System.out.println(box1.get());
		
		//box1.put(new Double(2.6));
	}

}

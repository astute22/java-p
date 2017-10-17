package example1;

public class ObjectDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score original = new Score("훔바훔바",70,40,100);
		Score copy = original;
		System.out.println("원  본 : " + original);
//		복사본의 값을 변경
		copy.setKor(90);
		System.out.println("원  본 : " + original);
		System.out.println("복사본 : " + copy);

	}

}

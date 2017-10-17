package example1;

public class ObjectDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score original = new Score("훔바훔바",70,40,100);
		Score clone = original.cloneScore();
		
		System.out.println("원  본 : " + original);
		System.out.println("복사본 : " + clone);
		
		//복사본 값 변경
		clone.setKor(100);
		
		System.out.println("원  본 : " + original);
		System.out.println("복사본 : " + clone);
	}

}

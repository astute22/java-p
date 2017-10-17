package example5;

public class ColorMoniter implements Moniter{

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("컬러모니터가 켜졌습니다");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("컬러모니터가 꺼졌습니다");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("콘텐츠화면이 출력되었습니다");
	}
	

}

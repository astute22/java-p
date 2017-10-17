package example5;

public class ColorMonitor implements Monitor {

	@Override
	public void on() {
		System.out.println("컬러 모니터를 켜다.");	
	}
	
	@Override
	public void off() {
		System.out.println("컬러 모니터를 끄다.");	
	}
	
	@Override
	public void display() {
		System.out.println("컬러화면에 컨텐츠를 표시한다.");	
	}
}
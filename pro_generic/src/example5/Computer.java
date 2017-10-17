package example5;

public class Computer <M extends Moniter>{
	//M은 moniter를 구현한 것만 받을 수 있음.
	private M moniter;
	public Computer(){}
	public Computer(M moniter) {
		this.moniter = moniter;
	}
	public void setMoniter(M moniter){
		this.moniter = moniter;
	}
	public void turnOnMoniter(){
		moniter.on();
	}
	public void turnOffMoniter(){
		moniter.off();
	}
	public void displayContents(){
		moniter.display();
	}

}

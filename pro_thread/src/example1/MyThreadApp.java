package example1;

public class MyThreadApp {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		//new Thread 생성
		Thread t = new MyThread();
		t.start();
		for(int i = 0; i<100 ; i++){
			System.out.println("메인쓰레드 : " + i);
			Thread.sleep(300);
		}
	}

}

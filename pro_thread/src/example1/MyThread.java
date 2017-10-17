package example1;

public class MyThread extends Thread {
	//새로운 쓰레드를 생성해서 실행할 코드를 작성
	@Override
	public void run() {
		for(int i = 0; i<100 ; i++){
			System.out.println("마이쓰레드 : " + i);
			try{
				Thread.sleep(100);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

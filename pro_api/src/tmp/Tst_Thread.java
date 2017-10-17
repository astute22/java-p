package tmp;

public class Tst_Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(){
			public void run(){
				for(int i = 0; i<50; i++){
					System.out.println("1번쓰레드 : " + i);
					try{
						Thread.sleep(100);
					}catch (InterruptedException e){
						e.printStackTrace();
					}
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				for(int i = 0; i<50; i++){
					System.out.println("2번쓰레드 : " + i);
					try{
						Thread.sleep(200);
					}catch (InterruptedException e){
						e.printStackTrace();
					}
				}
			}
		};
		t1.start();
		t2.start();
		for(int i = 0; i<50; i++){
			System.out.println("메인쓰레드 : " + i);
			Thread.sleep(300);
		}
	}

}

package example6;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new MyRunnable();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		Thread t4 = new Thread(r);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
	//collection에 숫자를 저장하는 쓰레드
	public static class MyRunnable implements Runnable{
		public void run(){
			ArrayList<Integer> num = new ArrayList<>();
			for(int i = 0; i<1000; i++)
				num.add(i);
		}
	}

}

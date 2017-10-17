package example1;

public class FileBackupApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new FileBackpThread("b1.backup");
		Thread t2 = new FileBackpThread("b2.backup");
		Thread t3 = new FileBackpThread("b3.backup");
		
		t1.start();
		t2.start();
		t3.start();
	}

}

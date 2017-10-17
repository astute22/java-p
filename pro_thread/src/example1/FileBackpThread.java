package example1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileBackpThread extends Thread{
	private String filename;

	public FileBackpThread(String filename) {
		super();
		this.filename = filename;
	}
	public void run(){
		try{
			FileInputStream fis = new FileInputStream("src/example1/BANDIZIP-SETUP-KR.exe");
			FileOutputStream fos = new FileOutputStream("src/example1/" + filename);
			int value = 0;
			while((value=fis.read())!= -1){
				fos.write(value);
			}
		}catch( Exception e){
			e.printStackTrace();
		}
		
	}
}
	

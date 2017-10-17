package example2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		long beginTime = System.currentTimeMillis();
		FileInputStream fis = new FileInputStream("c:/Temp/BANDIZIP-SETUP-KR.exe");
		FileOutputStream fos = new FileOutputStream("c:/Temp/BANDIZIP-SETUP-KR_backup.exe");
		int value = 0;
		while((value = fis.read()) != -1){
			fos.write(value);
		}
		fis.close();
		fos.close();
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (endTime - beginTime) + "밀리초");
	}

}

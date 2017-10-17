package example2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		long beginTime = System.currentTimeMillis();
		FileInputStream fis = new FileInputStream("c:/Temp/eclipse-jee-neon-3-win32-x86_64.zip");
		FileOutputStream fos = new FileOutputStream("c:/Temp/eclipse-jee-neon-3-win32-x86_64_backup.zip");
		byte[] buf = new byte[1024*8];
		int len = 0;
		while((len = fis.read(buf))!= -1){
			fos.write(buf, 0, len);
		}
		
		fis.close();
		fos.close();
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (endTime - beginTime) + "밀리초");
	}

}

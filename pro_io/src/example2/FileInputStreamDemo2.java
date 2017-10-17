package example2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamDemo2 {
	public static void main(String[] args) throws IOException{
		File file = new File("c:/Temp","sample.txt");
		FileInputStream fis = new FileInputStream(file);
		byte[] buf = new byte[1024];
		int len1 = fis.read(buf);
		System.out.println(len1);
		int len2 = fis.read(buf);
		System.out.println(len2);
		
		String txt = new String(buf,"euc-kr");
		System.out.println(txt);
	}
}

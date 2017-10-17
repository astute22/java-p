package example2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo3 {

	public static void main(String[] args) throws IOException, FileNotFoundException{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("c:/Temp/sample.txt");
		StringBuffer sb = new StringBuffer();
		byte[] buf = new byte[1024];
		int len = 0;
		while((len = fis.read(buf))!=-1){
			String str = new String(buf, 0, len,"euc-kr");
			sb.append(str);
		}
		String fullTxt = sb.toString();
		System.out.println(fullTxt);
	}

}

package example2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("c:/Temp/sample.txt");
		StringBuffer sb = new StringBuffer();
		int value = 0;
		while((value = fis.read()) != -1){
			sb.append((char)value);
		}
		fis.close();
		String txt = sb.toString();
		System.out.println("파일의 내용 : " + txt);
	}

}

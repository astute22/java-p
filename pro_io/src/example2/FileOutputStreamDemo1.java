package example2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class FileOutputStreamDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("c:/Temp/sample3.txt",true);
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("전화번호 : ");
		String ph = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		String data = name + ", " + ph + ", " + email + System.lineSeparator();
		byte[] b = data.getBytes();
		fos.write(b);
		fos.close();
	}

}

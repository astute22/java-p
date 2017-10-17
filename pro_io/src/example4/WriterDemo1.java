package example4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterDemo1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileWriter writer = new FileWriter("c:/Temp/sample4.txt");
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		writer.write(name);
		writer.flush();
		
		System.out.print("전화번호 : ");
		String ph = sc.next();
		writer.write(ph);
		writer.flush();
		
		writer.close();
		sc.close();
	}

}

package example4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriterDemo2 {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter("c:/Temp/sample5.txt"),true);
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		pw.println("이름 : " + name);
		
		System.out.print("전화번호 : ");
		String ph = sc.next();
		pw.println("전화번호 : " + ph);
		
		pw.close();
		sc.close();
	}
}

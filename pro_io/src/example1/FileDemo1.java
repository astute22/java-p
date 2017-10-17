package example1;

import java.io.File;

public class FileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("c:/jave_workspace","Hello.java");
		System.out.println("파일이 존재하는가? " + f.exists());
		System.out.println("이름 : " + f.getName());
		System.out.println("경로 : " + f.getParent());
		System.out.println("경로 : " + f.getAbsolutePath());
		System.out.println("파일 크기 : " + f.length());
		

	}

}

package example1;

import java.io.File;
import java.util.Date;

public class FileDemo {
	public static void main(String[] args) {
		//C:/ 루트 디렉토리의 정보를 담고있는 파일 객체 생성
		File f = new File("c:/");
		System.out.println("파일인가? " + f.isFile());
		System.out.println("디렉토리인가? " + f.isDirectory());
		System.out.println("크기 : " + f.length());
		System.out.println("이름 : " + f.getName());
		System.out.println("경로 : " + f.getAbsolutePath());
		System.out.println("최종 수정일 : " + new Date(f.lastModified()));
		String[] list = f.list();
		for(String s : list)
			System.out.println(s);
	}
}

package eXample5;

import java.util.Arrays;

public abstract class SystemDemo2 {
	public static void main(String[] args) {
		String[] names = {"홍진호", "조용호", "이영호", "고강민"};
		String[] users = new String[10];
		
		/*
		 *	System.arraycopy(src,		원본배열 
		 *					 srcPos, 	원본배열에서 복사 시작 위치
		 *					 dest, 		복사 받을 배열
		 *					 destPos, 	복사 받을 배열에서 복사 시작 위치
		 *					 length);	복사할 원소 갯수
		 *
		 */
		System.arraycopy(names, 0, users, 2, 4);
		System.out.println(Arrays.toString(users));
	}
}

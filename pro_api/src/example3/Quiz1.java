package example3;

import java.util.StringTokenizer;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// "김"씨 성을 가진 사용자는 모두 몇명인가
		String text = "김유신,강감찬,이순신,김시민,김좌진,홍길동,을지문덕,윤관,김시습";
		int c = 0;
		StringTokenizer st = new StringTokenizer(text, ",");
		while(st.hasMoreTokens()){
			 if(st.nextToken().startsWith("김"))
				 c++;
			
		}
		System.out.println("김씨성을 가진 사람은 " + c + "명이다");
	}

}
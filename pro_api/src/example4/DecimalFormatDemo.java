package example4;

import java.text.DecimalFormat;

public class DecimalFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 숫자에 , 넣어 표시하는 방법
		 * 1. DecimalFormat 객체 생성
		 * 2. DecimalFormat의 format(숫자)를 실행하면 지정된 숫자를 특정패턴의 문자열로 변환
		 */
		double num = 1000000000.247;
		DecimalFormat df1 = new DecimalFormat("#,###.##");
		String fn = df1.format(num);
		System.out.println(fn);
		
		DecimalFormat df2 = new DecimalFormat("0,000.00");
		String fn2 = df2.format(num);
		System.out.println(fn2);
	}

}

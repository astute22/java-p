package example4;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 시스템의 현재 시간정보를 가진 Date객체 생성하기
		Date now = new Date();
		System.out.println(now);
		
		// 1970년 0시 0분 0초부터 현재 시간까지를 밀리초단위로 환산한 값 얻기
		long time = now.getTime();
		System.out.println(time);
		
		now.setTime(1000);
		System.out.println(now);
	}

}

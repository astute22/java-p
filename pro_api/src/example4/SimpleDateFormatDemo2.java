package example4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		/*
		 * 날짜형식의 문자열로부터 Date 객체 생성하기
		 * 1. SimpleDateFormat의 parse(String source) 메소드는 지정된 날짜형식의 문자열을 해석해서 Date 객체를 생성한다
		 * 2. 문자열을 해석하기 위해서는 SimpleDateFormat객체를 생성할 때 해석할 문자열의 패턴을 지정해야함 
		 */
		String txt = "2017.01.30";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date date = sdf.parse(txt);
		System.out.println(date);
	}

}

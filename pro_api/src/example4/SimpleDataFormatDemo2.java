package example4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDataFormatDemo2 {

	public static void main(String[] args) throws ParseException {
		
		/*
		 *날짜형식의 문자열로부터 Date객체 생성하기
		 * - SimpleDateFormat의 parse(String source) 메소드는
		 * 	지정된 날짜형식의 문자열을 해석해서 date 객체를 생성한다.
		 * - 문자열을 해석하기 위해서는  SimpleDateFormat객체를 생성할 때 
		 * 	해석할 문자열의 패턴을 지정해야 한다.
		 */
		
		String text = "2017.05.29";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM,dd");
		Date date = sdf.parse(text);
		System.out.println(date);
	}
}

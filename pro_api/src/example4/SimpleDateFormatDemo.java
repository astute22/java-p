package example4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	public static void foramttingDate(String pattern){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String fd = sdf.format(date);
		System.out.println(fd);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foramttingDate("yyyy.M.d");
		foramttingDate("yyyy.MM.dd");
		foramttingDate("yyyy.MM.dd E");
		foramttingDate("yyyy.MM.dd EEEE");
		foramttingDate("yyyy.MM.dd EEEE a");
		foramttingDate("a hh:mm:ss");
		foramttingDate("a HH:mm:ss");
		foramttingDate("yyyy년 M월 d일 EEEE a HH:mm:ss");
		
		
	}

}

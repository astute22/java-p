package example4;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtils {

	private static DecimalFormat df1 = new DecimalFormat("#,###");
	private static SimpleDateFormat cal1 = new SimpleDateFormat("yyyy.MM.dd");
	private static SimpleDateFormat cal2 = new SimpleDateFormat("yyyy-MM-dd");
	
	public static String numWithComma(int num){
		return df1.format(num);
	}
	public static String cal(Date date){
		return cal1.format(date);
	}
	public static String calWithHyphen(Date date){
		return cal2.format(date);
	}

}

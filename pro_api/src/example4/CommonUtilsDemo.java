package example4;

import java.util.Date;

public class CommonUtilsDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int num = 100000000;
		String str1 = CommonUtils.numWithComma(num);
		System.out.println(str1);
		Date now = new Date();
		String str2 = CommonUtils.cal(now);
		System.out.println(str2);
		String str3 = CommonUtils.calWithHyphen(now);
		System.out.println(str3);
	}

}

package example2;

import java.util.StringTokenizer;

public class StringTokenizerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "린가드:남:010-1111-1122:lingard@gmail.net";
		String text2 = "제라드:남::gerrard@gmai.com";
		
		String items[] = text1.split(":");
		StringTokenizer st = new StringTokenizer(text2, ":");
		for(String item : items)
			System.out.println(item);
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}

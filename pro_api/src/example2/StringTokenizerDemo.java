package example2;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "this is a text";
		StringTokenizer st = new StringTokenizer(text);
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}

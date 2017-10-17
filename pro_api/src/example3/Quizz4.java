package example3;

public class Quizz4 {
	
	static String[] unitNames = {"만", "억", "조", "경"};
	static String[] positionNames = {"십", "백", "천"};
	static String[] numberNames = {"일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
	
	public static void printKoreanNumber(String text) {
		
		String t = "";
		for (int i=0; i<text.length(); i++) {
			String n = text.substring(i, i+1);
			int number = Integer.parseInt(n);
			if (number != 0) {
				t += numberNames[Integer.parseInt(n)-1];
			}
			if (number != 0 && i!=3 ) {
				t += positionNames[positionNames.length-i-1];
			}			
		}
		System.out.println(t);
		
	}
	
	public static void main(String[] args) {
		
		// 숫자를 한글로 바꾸기
		printKoreanNumber("0201");	// 삼천이백오십일
		
	}
}

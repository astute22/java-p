package example3.answer;

public class Quizz2 {

	public static void printMiddle(String text) {
		int size = text.length();
		int middlePoint = size/2;
		
		String middleText = null;
		if (size%2 == 1) {
			middleText = text.substring(middlePoint, middlePoint+1);
		} else {
			middleText = text.substring(middlePoint-1, middlePoint+1);
		}
		System.out.println(middleText);
	}
	
	public static void main(String[] args) {
		
		// 가운데 글자는 무엇인가?
		printMiddle("power");		// w
		printMiddle("program");		// g
		printMiddle("full");		// ul
	}
}

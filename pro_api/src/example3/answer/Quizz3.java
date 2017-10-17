package example3.answer;

public class Quizz3 {

	public static void hideNumber(String phone) {		
	
		String firstPart = phone.substring(0, phone.lastIndexOf("-"));
		String secondPart = phone.substring(phone.lastIndexOf("-"));
		
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<firstPart.length(); i++) {
			if (firstPart.charAt(i) == '-') {
				sb.append("-");
			} else {
				sb.append("*");
			}
		}
		System.out.println(sb.toString() + secondPart);	
	}
	
	public static void main(String[] args) {
		// 전화 번호 가리기
		hideNumber("010-1110-1111");	// ***-****-1111
		hideNumber("02-123-4567");		// **-***-1111
	}
}

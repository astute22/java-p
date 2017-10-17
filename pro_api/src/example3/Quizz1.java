package example3;

public class Quizz1 {

	public static void main(String[] args) {
		// "김"씨성을 가진 사람은 모두 몇명인가?
		String text = "김유신,강감찬,이순신,김시민,김좌진,홍길동,을지문덕,윤관,김시습";
		
		String[] names = text.split(",");
		int count = 0;
		for (String name : names) {
			if (name.startsWith("김")) {
				count++;
			}
		}
		System.out.println("인원수: " + count);
	}
}





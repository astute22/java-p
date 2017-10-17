package example2;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "2017,1,대흥민,국어,영어,수학,영어회화";
		
		//문자열길이
		int len = str.length();
		System.out.println("문자열의 길이 : " + len);
		
		//특정위치 문자 조회
		char ch = str.charAt(5);
		System.out.println("학년 : " + ch);
		
		//지정된 문자의 등장위치 조회
		int c1 = str.indexOf("영어");
		System.out.println("영어라는 글자가 처음으로 등장하는 위치 : " + c1);
		int c2 = str.lastIndexOf("영어");
		System.out.println("영어라는 글자가 마지막으로 등장하는 위치 : " + c2);
		int c3 = str.indexOf("인문학");
		System.out.println("인문학라는 글자가 처음으로 등장하는 위치 : " + c3);
		
		//지정된 글자를 포함하고있는지 여부
		boolean con1 = str.contains("대흥민");
		System.out.println("문장에 대흥민이 포함되어있는가 : " + con1);
		boolean con2 = str.contains("훔바");
		System.out.println("문장에 훔바가 포함되어있는가 : " + con2);
		
		//지정된 글자로 시작/끝나는지 알아보기
		boolean start = str.startsWith("대흥");
		System.out.println("문장이 대흥으로 시작하는가 : " + start);
		boolean end = str.endsWith("회화");
		System.out.println("문장이 회화로 끝나는가 : " + end);
		
		//문자열이 비어있는지 여부
		String txt = "";
		boolean emt = txt.isEmpty();
		System.out.println("문자열이 비어있는가? " + emt);
		
		//문자열의 좌/우에 있는 의미없는 공백을 제거한 새로운 문자열 생성
		String tst = "                hello,          world          ";
		String fixtst = tst.trim();
		System.out.println("원  본 : " + tst);
		System.out.println("수정본 : " + fixtst);
	}

}

package example2;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * StringBuilder와 Stringbuffer
		 *  	- 내부저장소를 갖고있는 객체다
		 *  	- append() 메소드를 사용해 내부저장소에 여러 데이터를 추가할 수 있다.
		 *  	- toString() 메소드를 사용해서 내부저장소의 값을 문자열로 꺼낼 수 있다.
		 *  	- + 연산자를 사용함으로써 문자열객체가 불필요하게 생성되는 것을 방지할 목적으로 사용한다
		 */
		String name = "린가드";
		int kor = 100;
		int eng = 82;
		int math = 70;
		
		StringBuilder sb = new StringBuilder();
		sb.append("이름 : ");
		sb.append(name);
		sb.append(" , ");
		sb.append("국어점수 : ");
		sb.append(kor);
		sb.append(" , ");
		sb.append("영어점수 : ");
		sb.append(eng);
		sb.append(" , ");
		sb.append("수학점수 : ");
		sb.append(math);
		String txt = sb.toString();
		System.out.println(txt);
		
		StringBuffer sB = new StringBuffer();
		sB.append("국어점수 = ").append(kor).append(" , ").append("영어점수 = ").append(eng).append(" , ").append("수학점수 = ").append(math);
		String txt2 = sB.toString();
		System.out.println(txt2);
	}

}

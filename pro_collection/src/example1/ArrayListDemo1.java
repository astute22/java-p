package example1;

import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		//배열과 ArrayList
		String[] namesArr = new String[10];
		namesArr[0] = "김기동";
//		for(String s : namesArr)
//			System.out.println(s);
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("손흥민");
		names.add("이청용");
		names.add("기성용");
		names.add("황희찬");
		names.add("권창훈");
		names.add("백승호");
		names.add("이승우");
		
		ArrayList<String> namesList = new ArrayList<String>();
		namesList.add("염기훈");
		namesList.add("김진수");
		namesList.add("김형범");
		namesList.add("이승기");
		namesList.add("이근호");
		namesList.add("윤빛가람");
		namesList.add("유주안");
		namesList.add("이동국");
		namesList.add("이재성");
		namesList.add("이승기");	//동일한 객체 저장 가능
		namesList.add("이승기");
		namesList.add("이승기");
		namesList.add("이승기");
		namesList.addAll(names);	//다른 Collection도 저장 가능
				
		for(String s : namesList)
			System.out.println(s);

		//ArrayList 안의 모든 요소 삭제
		//namesList.clear();
		
		//ArrayList에 지정된 요소가 존재하는지 여부를 반환
		//boolean exist = namesList.contains("이근호");
		//System.out.println(exist);
		
		//ArrayList에 저장된 요소가 없을때 true반환
		//boolean empty = namesList.isEmpty();
		//System.out.println(empty);

	}
}

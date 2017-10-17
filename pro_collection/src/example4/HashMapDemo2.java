package example4;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 책정보 담는법
		 * 1-1. 클래스 정의
		 * 		Book book = new Book();
		 * 1-2. Book 객체를 여러개 담을 수 있는 ArrayList 객체 생성
		 * 		ArrayList<Book> booklist = new ArraList<>();
		 * 2-1 맵을 활용한다.
		 * 		HashMap<String, Obeject> book = new HashMap<>();
		 * 		book.put("no",10);
		 * 		book.put("title","수도원기행");
		 * 		book.put("auther","공지영");
		 * 2-2 책정보를 한권에 담은 Map 객체를 여러개 담을 수 있는 ArrayList 객체 생성
		 * 		ArrayList<HashMap<String,Object>> booklist = new ArraList<>();
		 */
		ArrayList<HashMap<String, Object>> book = new ArrayList<>();
		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("no", 11);
		map1.put("title", "이것이 자바다");
		map1.put("price", 35000);
		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("no", 12);
		map2.put("title", "자바의 정석");
		map2.put("price", 35000);
		HashMap<String, Object> map3 = new HashMap<>();
		map3.put("no", 13);
		map3.put("title", "예제로 배우는 쉬운 자료구조");
		map3.put("price", 28000);
		
		book.add(map1);
		book.add(map2);
		book.add(map3);
		
		for(HashMap<String, Object> m : book){
			int no = (Integer)m.get("no");
			String title = (String) m.get("title");
			int price = (Integer) m.get("price");
			System.out.println(no + "\t" + title + "\t" + price);
		}
		

	}

}

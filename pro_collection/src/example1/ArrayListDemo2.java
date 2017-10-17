package example1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		//
		ArrayList<String> names = new ArrayList<>();
		names.add("제라드");
		names.add("램파드");
		names.add("바클리");
		names.add("아자르");
		names.add("스콜스");
		names.add("산체스");
		names.add("테베즈");
		names.add("음바페");
		
		/*
		for(String s : names)
			System.out.println(s);
		*/
		
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		
		//자바8 방식
		names.stream()
		.forEach(e -> System.out.println(e));
	}

}

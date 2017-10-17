package example2;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> bookList = new ArrayList<>();
		bookList.add(new Book("10","오직 두 사람", "김영하","문학동네", 11700));
		bookList.add(new Book("11","잠2", "베르나르 베르베르","열린책들", 12420));
		bookList.add(new Book("12","언어의 온도", "이기주","말글터", 12420));
		bookList.add(new Book("13","잠1", "베르나르 베르베르","열린책들", 12420));
		bookList.add(new Book("14","82년생 김지영", "조남주","민음사", 11700));
		/*
		int total = 0;
		for(Book b : bookList){
			
			total += b.getPrice();
		}
		System.out.println("전체 주문금액 : " + total + "원");
		System.out.println(bookList);
		*/
		Book book = new Book("12","언어의 온도", "이기주","말글터", 12420);
		boolean exist = bookList.contains(book);
		System.out.println(exist);
	}

}

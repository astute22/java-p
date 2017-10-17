package example4;

import java.sql.SQLException;

public class BookApp {

	public static void main(String[] args)throws SQLException {
		// TODO Auto-generated method stub
		BookDAO dao = new BookDAO();
		Book book = new Book();
		book.setTitle("얼음과 불의 노래");
		book.setAuthor("J.R.R.Martin");
		book.setPublisher("황금가지");
		book.setPrice(35000);
		dao.addBook(book);
	}

}

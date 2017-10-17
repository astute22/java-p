package sample;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import vo.BookVO;

public class IbatisSample {
	public static void main(String[] args) throws Exception {
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		SqlMapClient sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(reader);
		//sqlMapClient.delete("deleteAllBooks");
		/*
		BookVO book = new BookVO();
		book.setTitle("주홍색 연구");
		book.setAuthor("코난 도일");
		book.setPublisher("자음과모음");
		book.setPrice(13000);
		sqlMapClient.insert("addBook", book);
		*/
		//sqlMapClient.delete("deleteBooksByNo", 2041);
		//BookVO book1 = (BookVO)sqlMapClient.queryForObject("getBookByNo", 2042);
		//System.out.println(book1.toString());
		//List<BookVO> books = sqlMapClient.queryForList("getBooksByPublisher","자음과모음");
		//for(BookVO bo : books)
		//	System.out.println(bo.toString());
		//List<BookVO> books = sqlMapClient.queryForList("getBooksByAuthor","윤현승");
		//for(BookVO bo : books)
		//	System.out.println(bo.toString());
		
		HashMap<String, Object> mp = (HashMap<String, Object>)sqlMapClient.queryForObject("getJobById", "IT_PROG");
		System.out.println(mp);
		String jobTitle = (String) mp.get("JOB_TITLE");
		System.out.println("업종제목 : " + jobTitle);
	}
}
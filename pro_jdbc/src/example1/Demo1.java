package example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//java - db 연동절차
		/*
		 * 1. jdbc 드라이버 메모리에 로딩
		 * 2. db와 연결
		 * 3. sql구문을 전송하는 객체 쇡득
		 * 4. sql을 db로 보내서 실행
		 * 5. sql 실행결과 처리
		 * 6. db와 연결 해제
		 */
		//1.jdbc 드라이버를 메모리에 로딩하고 드라이버레지스트리에 등록
		Class.forName("oracle.jdbc.OracleDriver");
		
		//2.DriverManager를 사용해서 DB에 연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "zxcv1234";
		Connection connection = DriverManager.getConnection(url, user, password);

		//3.sql구문을 db로 전송해주는 객체(statement) 획득
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("select department_id, manager_id, department_name from departments");
		while(rs.next()){
			int id = rs.getInt("department_id");
			int mgid = rs.getInt("manager_id");
			String name = rs.getString("department_name");
			System.out.println(id + ",\t" + mgid + ",\t" + name);
		}
		//5.자원해제
		rs.close();
		stmt.close();
		connection.close();
	}

}

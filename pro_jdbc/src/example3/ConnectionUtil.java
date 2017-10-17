package example3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	public static Connection getconnection() throws SQLException{
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "zxcv1234");
			return con;
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}

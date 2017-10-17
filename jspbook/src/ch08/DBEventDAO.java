package ch08;
import java.sql.*;
import java.util.ArrayList;
public class DBEventDAO implements EventDAO{
	private String jdbc_driver = "com.mysql.jdbc.driver";
	private String jdbc_url="jdbc:mysql://localhost:3306/mydb?characterEncoding=euckr";
	private Connection conn;
	private Statement stmt;
	private void connect(){
		try{
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "root", "webservice");
			stmt = conn.createStatement();
		}catch (Exception e){
		}
	}
	private void disconnect(){
		try{
			stmt.close();
			conn.close();
		}catch (Exception e){
		}
	}
	public void addEvent (EventBean event){
		String sql = "insert into event value('"
				+ event.getId()+"', '"
				+ event.getTitle()+"', '"
				+ event.getOwner()+"', '"
				+ event.getContent()+"')";
		try{
			connect();
			stmt.executeUpdate(sql);
			disconnect();
		}catch (Exception e){
		}
	}
	public ArrayList getAllEvent(){
		String sql =  "select id, title, owner from event where id="
	}
}

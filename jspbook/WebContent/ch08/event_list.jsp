<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Event List</title>
</head>
<% request.setCharacterEncoding("euc-kr"); %>
<%
	String jdbc_driver="com.mysql.jdbc.Driver";
	String jdbc_url="jdbc:mysql://localhost:3306/mydb?characterEncoding=euckr";
	Class.forName(jdbc_driver);
	Connection conn=DriverManager.getConnection(jdbc_url,"root","webservice");
	Statement stmt=conn.createStatement();
	String sql = "select id, title, owner from event";
	ResultSet rs = stmt.executeQuery(sql);
%>
<body>
<h2>이벤트 목록</h2>
<table border="1">
<tr>
<th>Index</th>
<th>Title</th>
<th>Owner</th>
<%
	while(rs.next()){
%>
<tr>
	<td><%=rs.getInt("id") %></td>
	<td>
		<a href="event_view.jsp?id=<%=rs.getString("id") %>">
			<%=rs.getString("title") %>
		</a>
	</td>
	<td><%=rs.getString("owner") %></td>
</tr>
<%
	}
	rs.close();
	stmt.close();
	conn.close();
%>
</table>
<br><hr>
<form action="event_add.jsp" method="post">
	ID<input type="text" name="id" size="5">
	Title<input type="text" name="title" size="15">
	Owner<input type="text" name="owner" size="10"><br>
	Content<input type="text" name="content" size="40"><br>
	<input type="submit" value="이벤트 추가">
</form>
</body>
</html>
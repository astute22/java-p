<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Event View</title>
</head>
<%
	request.setCharacterEncoding("euc-kr");
	String jdbc_driver="com.mysql.jdbc.Driver";
	String jdbc_url="jdbc:mysql://localhost:3306/mydb?characterEncoding=euckr";
	Class.forName(jdbc_driver);
	Connection conn=DriverManager.getConnection(jdbc_url,"root","webservice");
	Statement stmt=conn.createStatement();
	String sql = "select id, title, owner, content from event where id=" + request.getParameter("id");
	ResultSet rs = stmt.executeQuery(sql);
	rs.next();
%>
<body>
<h2>이벤트 내용</h2>
<table border=1>
<tr>	<td>ID</td>
		<td><%=rs.getInt("id") %></td>
<tr>	<td>Title</td>
		<td><%=rs.getString("title") %></td>
<tr>	<td>Owner</td>
		<td><%=rs.getString("owner") %></td>
<tr>	<td>Content</td>
		<td><%=rs.getString("content") %></td>
</table>
<br><a href="event_list.jsp">이벤트 목록 보기</a>		
</body>
</html>
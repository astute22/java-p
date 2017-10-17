<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Event Add</title>
</head>
<%
	request.setCharacterEncoding("euc-kr");
	String jdbc_driver="com.mysql.jdbc.Driver";
	String jdbc_url="jdbc:mysql://localhost:3306/mydb?characterEncoding=euckr";
	Class.forName(jdbc_driver);
	Connection conn=DriverManager.getConnection(jdbc_url,"root","webservice");
	String sql = "insert into event values(?,?,?,?)";
	PreparedStatement stmt=conn.prepareStatement(sql);
%>
<body>
<h2>이벤트 추가</h2>
ID : <%=request.getParameter("id") %><br>
Title : <%=request.getParameter("title") %><br>
Owner : <%=request.getParameter("owner") %><br>
Content : <%=request.getParameter("content") %><br>
<%
	stmt.setInt(1, Integer.parseInt(request.getParameter("id")));
	stmt.setString(2, request.getParameter("title"));
	stmt.setString(3, request.getParameter("owner"));
	stmt.setString(4, request.getParameter("content"));
	stmt.executeUpdate();
	stmt.close();
	conn.close();
%>
위 일정이 추가되었습니다.
<br><a href="event_list.jsp">이벤트 목록 보기</a></body>
</html>
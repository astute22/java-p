<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="login" class="ch07.LoginBean" scope="request"/>
<jsp:setProperty name="login" property="*"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<center><h2>�α��� ����</h2>
<hr>
<%
	if(!login.checkUser()){
		out.println("login fail!!!");
	} else{
		out.println("login success!");
	}
%>
<hr>
����� ���̵� : <jsp:getProperty name="login" property="userid"/><br>
����� �н����� : <jsp:getProperty name="login" property="passwd"/></center>

</body>
</html>
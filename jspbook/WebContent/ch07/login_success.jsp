<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="validuser" class="ch07.LoginBean2" scope="request"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Login Success</title>
</head>
<body>
<center>
<h2>Login Success!</h2>
<hr>
사용자 아이디 : <jsp:getProperty property="userid" name="validuser"/>
<br>
사용자 패스워드 : <jsp:getProperty property="passwd" name="validuser"/>
</center>
</body>
</html>
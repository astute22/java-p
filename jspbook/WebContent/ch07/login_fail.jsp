<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="invaliduser" class="ch07.LoginBean2" scope="request"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Login Fail</title>
</head>
<body>
<center>
<h2>Login Fail!!!</h2>
<hr>
����� ���̵� : <jsp:getProperty property="userid" name="invaliduser"/>
<br>
����� �н����� : <jsp:getProperty property="passwd" name="invaliduser"/>
<br>
�����ڵ� : <jsp:getProperty property="error" name="invaliduser"/>
</center>
</body>
</html>
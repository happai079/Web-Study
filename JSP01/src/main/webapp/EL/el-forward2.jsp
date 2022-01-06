<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="sec01.StudentBean" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>빈 객체 바인딩</title>
	</head>
	<body>
		<%
			StudentBean student = new StudentBean("2001003", "이몽룡", "010", "서울", 4);
			request.setAttribute("student", student);
		%>
		<jsp:forward page="el-forward-result2.jsp" />
	</body>
</html>
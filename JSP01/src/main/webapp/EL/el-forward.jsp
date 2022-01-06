<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>EL 바인딩 예제</title>
	</head>
	<body>
		<%
			request.setAttribute("id", "hong");
			request.setAttribute("pwd", "1234");
			request.setAttribute("name", "홍길동");
			request.setAttribute("email", "hong@test.com");
		%>
		
		<jsp:forward page="el-forward-result.jsp" />		
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>start</title>
	</head>
	<body>
		JSP 환영홥니다 <br><br>
		
		<%
			out.println("JSP를 시작합니다");
		%>
		
		<br> 여기는 HTML 영역
		
		<%
			out.println("<br>여기는 JSP 영역에서 출력했습니다");
		%>
	</body>
</html>
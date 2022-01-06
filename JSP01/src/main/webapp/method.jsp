<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>선언문 예제 - 메소드 정의(선언)</title>
	</head>
	<body>
		<h3>선언문 예제 - 메소드 정의</h3>
		<%!
			String id = "abcd";
			
		   // 메소드는 반드시 선언부에서 정의
			public String getId() {
				return id;
			}
		%>
		id : <%= id %><br>
		getId 메소드 호출 결과 : <%= getId() %>
	</body>
</html>
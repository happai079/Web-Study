<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>EL: param 내장 객체 사용</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
		%>
		<h3>학생 정보 출력(EL param 객체 사용)</h3>
		학변 : ${param.stdNo }<br>
		성명 : ${param.stdName }<br>
		전화 : ${param.stdPhone }<br>
		주소 : ${param.stdAddress }<br>
		학년 : ${param.stdYear }
	</body>
</html>
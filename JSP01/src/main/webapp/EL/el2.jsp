<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="student" class="sec01.StudentBean" scope="page">
	<jsp:setProperty property="stdName" name="student" value="홍길동"/>
</jsp:useBean>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>EL을 액션 태그로 사용</title>
	</head>
	<body>
		${student.stdName }
	</body>
</html>
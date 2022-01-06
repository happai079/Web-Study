<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url var="url1" value="/EL/login.jsp"/>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>c:url 태그</title>
	</head>
	<body>
		<a href="${url1 }">로그인 화면으로 이동</a>
	</body>
</html>
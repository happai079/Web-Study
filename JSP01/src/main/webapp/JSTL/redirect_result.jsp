<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>c:redirect</title>
	</head>
	<body>
		<h3>redirect 힐 때 전달된 param 받기</h3>
		이름: ${ param.name }<br>
		이메일: ${ param.email }<br>
	</body>
</html>
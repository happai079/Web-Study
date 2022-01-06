<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Member</title>
	</head>
	<body>
		<table border="1">
			<tr align="center" bgcolor="gold">
				<td>아이디</td>
				<td>비밀번호</td>
				<td>이름</td>
				<td>이메일</td>
				<td>가입일</td>
			</tr>	
			<c:forEach var="data" items="${ memList }">
				<tr align="center">
					<td>${data.id }</td>
					<td>${data.pwd }</td>
					<td>${data.name }</td>
					<td>${data.email }</td>
					<td>${data.joinDate }</td>
				</tr>
			</c:forEach>		
		</table>
	</body>
</html>
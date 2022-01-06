<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--  변수 설정 -->
<c:set var="id" value="hong2" scope="page" />
<c:set var="pwd" value="1234" scope="page" />
<c:set var="name" value="${'홍길동' }" scope="page" />
<c:set var="age" value="${20 }" scope="page" />
<c:set var="height" value="${170 }" scope="page" />

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>c:if 태그</title>
	</head>
	<body>
		<c:if test="${true }">
			<h3>항상 참입니다</h3>
		</c:if>
		
		<c:if test="${(id=='hong') && (name=='홍길동')}">
			<h3>아이디는 ${id }이고, 이름은 ${name }입니다</h3>
		</c:if>
	</body>
</html>






















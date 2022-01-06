<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% 
	List dataList = new ArrayList();
	dataList.add("hello");
	dataList.add("world");
	dataList.add("안녕하세요.");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>c:forEach 태그</title>
	</head>
	<body>
		<c:forEach var="i" begin="1" end="10" step="1" varStatus="loop">
			i = ${i } &nbsp;&nbsp; 반복횟수: ${loop.count }
			&nbsp;&nbsp; 인덱스: ${loop.count }
			&nbsp;&nbsp; 첫 번째?: ${loop.first}
			&nbsp;&nbsp; 마지막?: ${loop.last }<br>
		</c:forEach>
		<hr>
		
		<c:set var="list" value="<%=dataList %>"/>
		<c:forEach var="data" items="${ list }">
			${ data }<br>
		</c:forEach>
		
		<hr>
		<c:set var="fruits" value="사과, 수박, 바나나, 망고, 귤" />
		<c:forTokens var="token" items="${fruits }" delims=",">
			${ token }<br>
		</c:forTokens>
	</body>
</html>
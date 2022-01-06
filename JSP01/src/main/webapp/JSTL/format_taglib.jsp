<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>포매팅 태그 라이브러리</title>
	</head>
	<body>
		<h2>formatNumber: 숫자 포매팅</h2>
		<c:set var="price" value="1000000000" />
		
		<fmt:formatNumber type="number" value="${ price }" var="priceNum" />
		일반 숫자로 표현 : ${ priceNum } <br>
		통화로 표현 : <fmt:formatNumber type="currency" currencySymbol="\\" value="${ price }" groupingUsed="true"/><br>
		<!-- 천 단위 구분표시 : groupingUsed="true"가 디폴트 -->
		퍼센트로 표현 : <fmt:formatNumber type="percent" value="${ price }" /><br>
		
		<hr>
		
		<h2>formatDate: 날짜 포매팅</h2>
		<c:set var="now" value="<%= new Date() %>" />
		
		<fmt:formatDate type="date" value="${ now }"/><br>
		<fmt:formatDate type="date" value="${ now }" dateStyle="full"/><br>
		<fmt:formatDate type="date" value="${ now }" dateStyle="short"/><br><br>
		
		<fmt:formatDate type="time" value="${ now }" /><br>
		<fmt:formatDate type="both" value="${ now }" /><br>
		<fmt:formatDate type="both" value="${ now }" dateStyle="full" timeStyle="full"/><br>
		<fmt:formatDate value="${ now }" pattern="yyyy-MM-dd HH:mm:ss"/><br><br>
		
		한국 현재 시간 :
		<fmt:formatDate type="both" value="${ now }" dateStyle="full" timeStyle="full"/><br>
	
		뉴욕 현재 시간 :
		<fmt:timeZone value="GMT-5">
			<fmt:formatDate type="both" value="${ now }" dateStyle="full" timeStyle="full"/>
		</fmt:timeZone>	
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="student" class="sec01.StudentBean" scope="page" />
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>자바 빈 액션 태그</title>
	</head>
	<body>
		<h3>빈 속성 값 설정 (setProperty)</h3>
		<jsp:setProperty name="student" property="stdNo" value="2021001" />
		<jsp:setProperty name="student" property="stdName" value="홍길동" />
		<jsp:setProperty name="student" property="stdPhone" value="010-1234-5678" />
		<jsp:setProperty name="student" property="stdAddress" value="서울시 종로구" />
		<jsp:setProperty name="student" property="stdYear" value="4" />
		
		<h3>빈 속성 값 출력 (getProperty)</h3>
		학변 : <jsp:getProperty name="student" property="stdNo" /><br>
		성명 : <jsp:getProperty name="student" property="stdName" /><br>
		전화 : <jsp:getProperty name="student" property="stdPhone" /><br>
		주소 : <jsp:getProperty name="student" property="stdAddress" /><br>
		학년 : <jsp:getProperty name="student" property="stdYear" /><br>
		
		<h3>빈 속성 값 출력 (Getter 사용)</h3>
		학변 : <%= student.getStdNo() %><br>
		성명 : <%= student.getStdName() %><br>
		전화 : <%= student.getStdPhone() %><br>
		주소 : <%= student.getStdAddress() %><br>
		학년 : <%= student.getStdYear() %>
		
	</body> 
</html>
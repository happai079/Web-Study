<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="sec01.StudentBean" %>
<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>빈 객체를 ArrayList에 담아서 바인딩</title>
	</head>
	<body>
		<%
		StudentBean s1 = new StudentBean("2001003", "이몽룡", "010", "서울", 4);
		StudentBean s2 = new StudentBean("2001005", "홍길동", "011", "경기", 1);
		StudentBean s3 = new StudentBean("2001006", "성추향", "012", "전북", 2);
		
		List studentList = new ArrayList();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		request.setAttribute("stdList", studentList);		
		%>
		<jsp:forward page="el-forward-result3.jsp" />
	</body>
</html>
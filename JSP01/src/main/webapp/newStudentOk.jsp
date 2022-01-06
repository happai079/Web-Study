<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>폼에 입력한 값으로 빈 속성값 한꺼번에 설정</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
		%>
		<!-- StudentBean 사용 / 모든 프로퍼티에 값 설정 -->
		<jsp:useBean id="student" class="sec01.StudentBean" scope="page">
			<jsp:setProperty property="*" name="student"/>
		</jsp:useBean>
		<!-- 폼 안의 <input>태그 name속성과 StudentBean 클래스의 멤버 필드명이 동일해야 함 -->
		
		<h3>학생 정보 출력(Bean 속성값 출력)</h3>
		학변 : <%= student.getStdNo() %><br>
		성명 : <%= student.getStdName() %><br>
		전화 : <%= student.getStdPhone() %><br>
		주소 : <%= student.getStdAddress() %><br>
		학년 : <%= student.getStdYear() %>
	</body>
</html>
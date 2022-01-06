<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>responseOk</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
			String answer = request.getParameter("answer");
			
			//"서울"이면 response.sendRedirect("pass.jsp")
			// 자바에서 문자열 비교 : == 사용 안 함. equals() 메소드 사용
		 if(answer.equals("서울")) {
        		response.sendRedirect("pass.jsp");
        }else {
        		response.sendRedirect("fail.jsp");
       }
		%>
	</body>
</html>
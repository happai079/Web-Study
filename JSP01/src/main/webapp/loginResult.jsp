<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>loginResult.jsp</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
			// ID 받아와서  ID 입력하지 않았으면  login.jsp 로 forward
			String user_id = request.getParameter("user_id");
			if(user_id.length() == 0){
		%>	
			<jsp:forward page="login.jsp" />
		<%		
			}
		%>
		
		<h2>환영합니다 <%= user_id %>님!</h2>
	</body>
</html>
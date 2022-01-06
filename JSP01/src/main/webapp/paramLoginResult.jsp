<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>paramLoginResult</title>
	</head>
	<body>
		<%		
		    request.setCharacterEncoding("utf-8");
			String msg = "아이디를 입력하지 않았습니다. 아이디를 입력해 주세요.";
			
			String user_id = request.getParameter("user_id");
			// user_id 값이 비었으면 paramLogin.jsp로 포위딩. msg 전송
			if(user_id.length() == 0){
		%>
				<jsp:forward page="paramLogin.jsp">
					<jsp:param name="msg" value="<%= msg %>" />
				</jsp:forward>
		<%
			}
		%>		
		<h3>환영합니다.  <%=user_id %>님!!!</h3>
	</body>
</html>
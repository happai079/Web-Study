<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>forward 액션 태그</title>
	</head>
	<body>
	<%-- <%
		String user_id = request.getParameter("user_id");
	   // null 인 경우에 오류 없이 null 로 출력
	   // null로 뭔가를 하려고 하면 NullPointerException 오류 발생
	%>
	<%= user_id.length() %> --%>
	<%
		String user_id = request.getParameter("user_id");
	   if(user_id == null){
	%>	
		<h2>로그인</h2>
	<%
	   }else {	
	%>
		<h2>아이디를 입력하지 않았습니다. 아이디를 입력해 주세요.</h2>
	<%
	   }
	%>	
	  <form name="frmLogin" method="post" action="loginResult.jsp" >
		   아이디  :<input type="text" name="user_id"><br>
	     비밀번호:<input type="password" name="user_pw" ><br>
	    <input type="submit" value="로그인">  <input type="reset" value="다시입력">
	  </form>
	</body>
</html>
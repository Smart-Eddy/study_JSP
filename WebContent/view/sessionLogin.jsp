<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Login</title>
</head>
<body>
	<%
		// 기존에 Session을 가지고 있는 지 체킹해야한다.
		if(session.getAttribute("memberId") != null){
			// 기존 로그인한 사용자라면 loginOk 페이지로 리다이렉트
			response.sendRedirect("/view/sessionLoginOk.jsp");
		}
	%>
	<form action="../sessionLogin" method="POST">
		ID : <input type="text" name="mId"><br>
		PW : <input type="password" name="mPw"><br>
		<input type="submit" value="login">
	</form>

</body>
</html>
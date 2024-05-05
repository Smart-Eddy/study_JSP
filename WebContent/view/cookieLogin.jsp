<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cookie Login</title>
</head>
<body>
	<%
		Cookie[] cookies = request.getCookies();
		// System.out.println("cookies : " + cookies);
		
		// Cookie가 존재한다면 cookieLoginOk.jsp로 Redirect
		if(cookies != null){
			for(Cookie c : cookies){
				if(c.getName().equals("memberId")){
					response.sendRedirect("/view/cookieLoginOk.jsp");
				}
			}
		}
	%>
	<form action="../cookieLogin" method="POST">
		ID : <input type="text" name="mId"><br>
		PW : <input type="password" name="mPw"><br>
		<input type="submit" value="login">
	</form>

</body>
</html>
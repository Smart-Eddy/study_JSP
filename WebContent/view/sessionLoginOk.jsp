<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login OK - Session check!</title>
</head>
<body>
	<%
		session = request.getSession();
		out.print("----------session check----------<br>");
		out.print("memberId : " + session.getAttribute("memeberId") + "<br>");
		out.print("----------session check----------<br>");
	%>
	<form action="../sessionLogout" method="POST">
		<input type="submit" value="logout">
	</form>
	
</body>
</html>
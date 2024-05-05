<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login OK - Cookie check!</title>
</head>
<body>
	<%
		Cookie[] cookies = request.getCookies();
		for(Cookie c : cookies){
			out.print("----------cookie check----------<br>");
			out.print("name : " + c.getName() + "<br>");
			out.print("value : " + c.getValue() + "<br>");
			out.print("----------cookie check----------<br>");
		}
		%>
</body>
</html>
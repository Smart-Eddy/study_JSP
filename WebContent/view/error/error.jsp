<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%-- ErrorPage 유무 --%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ERROR!!!!!</title>
</head>
<body>
<%
	// exception 객체
	// 예외처리할 때 사용되는 JSP내장객체
	response.setStatus(200);
	String msg = exception.getMessage();
%>
<h2>ERROR Message : <%= msg  %></h2>
</body>
</html>
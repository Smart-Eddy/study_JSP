<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- JSP파일로 리다이렉트됬을 때 JSP파일 내에서 인코딩처리가 필요하다. --%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Encoding</title>
</head>
<!-- 한글 또는 다른 언어의 문자를 컴퓨터에서 처리하기 위해서는 문자를 숫자로 변환하는 과정이 필요하다 -->
<!-- 문자 -> 숫자(컴퓨터가 이해하기 위함)로 변환하는 과정을 인코딩(Encoding)이라고 한다. -->
<!-- 인코딩 방식으로는 UTF-8을 주로 사용한다. -->
<!-- UTF-8 인코딩 방식은 유니코드를 지원하는 인코딩 방식 중 하나로 다양한 언어의 텍스트를 처리할 수 있다. -->
<!-- 유니코드란 전세계의 모든 문자를 표현하기 위한 표준 문자 표현방식이다. -->
<body>
	<!-- HTTP Method GET 방식 일 때  -->
	<!-- 	<form action="../encodingSignUp" method="GET"> -->
	<!-- GET방식 일때는 server.xml 파일에서 Connector설정 태그에 URIEncoding="UTF-8"을 추가해주면 인코딩 처리가 쉽게 가능하다. -->
	
	<!-- HTTP Method POST 방식 일 때  -->
	<form action="../encodingSignUp" method="POST">
		이름 : <input type="text" name="m_name"><br>
		별명 : <input type="text" name="m_nickname"><br>
		<input type="submit" value="signUp">
	</form>
</body>
</html>
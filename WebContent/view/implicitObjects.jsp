<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- 지시어 태그의 errorPage 설정을 통해서 에러발생 시 이동할 jsp파일을 지정할 수 있다. --%>
<%@ page errorPage="/view/error/error.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Implicit Objects</title>
</head>
<body>
	<%-- 기본적인 request, response 객체를 제외하고도 JSP에서 제공되는 많은 내장객체가 존재한다.  --%>
	<%!
		String adminId;
		String adminPw;
		String imgDir;
		String testServerIP;
		String realServerIP;
		String str;
	%>

	<%
		// config 객체
		// web.xml에 정의한 init-param
		// init-param을 참조할 때 config객체를 사용할 수 있다.
		adminId = config.getInitParameter("adminId");
		adminPw = config.getInitParameter("adminPw");
		
		// application 객체
		// web.xml에 정의한 context-param
		// context-param을 참조할 때 application객체를 사용할 수 있다.
		imgDir = application.getInitParameter("imgDir");
		testServerIP = application.getInitParameter("testServer");
		realServerIP = application.getInitParameter("realServer");
	%>
	
		<p>관리자 아이디  : <%= adminId %></p>
		<p>관리자 비밀번호 :<%= adminPw %></p>
		<p>이미지업로드 경로 :<%= imgDir %></p>
		<p>테스트서버IP :<%= testServerIP %></p>
		<p>운영서버IP :<%= realServerIP %></p>
	
	<%-- out 객체 --%>
	<%-- out객체는 출력에 관련된 객체이다 --%>
	<%
		out.print("<h2>Hello out Obejct!!</h2>");
	%>
	
	<%-- exception 객체 --%>
	<%-- 예외처리가 필요할 때 사용되는 내장객체 --%>
	<%
		// --> NullPorinterException 발생 --> error 페이지로 이동 --> exception 객체를 이용해서 메세지출력
		// out.print(str.toString()); 
	%>
	
</body>
</html>
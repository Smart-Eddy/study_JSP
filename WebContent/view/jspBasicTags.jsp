<%-- JSP 지서어 태그 : 서버에서 JSP페이지를 처리하는 방법을 정의하는 태그이다.--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" 
	import="java.util.*" %>

<%-- 사용할 태그라이브러리를 선언해주는 태그이다. --%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Basic Tags</title>
</head>
<body>
	<%-- JSP 선언태그 : HTML문서에서 Java코드를 사용하여 변수선언, 객체생성, 머서드정의 등을 선언할 수 있다. --%>
	<%!
		int num = 10;
		String str = "JSP";
		ArrayList<String> list = new ArrayList<String>();
		
		public void jspMethod(){
			//System.out.println("--jspMethod()--");
		}
	%>
	
	<%-- 외부에 있는 파일을 해당 HTML 문서내에서 사용할 수 있다 --%>
	<%@ include file="layout/header.jsp" %>
	
	<!-- 주석 -->
	<!-- HTML주석 : 사용자가 개발자모드에서 확인가능 -->
	<%-- JSP주석  : JSP파일이 컴파일될 때 컴파일에서 제외된다. 즉 HTML문서에서 사용자가 확인할 수 없다. --%>
	
	<%-- JSP 스크립틀릿 태그 : HTML문서에서 Java코드를 사용할 수 있게해주는 태그이다.--%>
	<%-- 하지만 HTML태그와 스크립틀릿 태그가 같이 사용되면 코드가 매우 복잡해지기 때문에 잘 사용되지 않는다. --%>
	<%-- 이러한 문제점들로 인해 액션태그, EL 문법 등이 도입되고 MVC패턴(model2)로 발전하게 된다.  --%>
	<%
		if(num > 0){
	%>
	<p> num > 0 </p>
	<%
		}else{
	%>
	<p> num <= 0 </p>
	<%
		}
	%>
	
	<%-- JSP 표현식 태그 : JSP 선언태그 등으로 할당된 변수에 값을 출력할 때 사용하는 태그이다. --%>
	<p>num is <%= num  %></p>
	
	<%@ include file="layout/footer.jsp" %>
	
</body>
</html>
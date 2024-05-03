<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- formData처리는 주로 HTTP POST Method로 요청한다.  -->
	<form action="../FormDataServlet" method="POST">
	name      : <input type="text" name="m_name"><br>
	password  : <input type="password" name="m_pass"><br> 
	gender    : Man <input type="radio" name="m_gender" value="M" checked="checked">
	            Woman <input type="radio" name="m_gender" value="W" checked="checked"><br>
	hobby     : Sport <input type="checkbox" name="m_hobby" value="sport">
	            Cooking <input type="checkbox" name="m_hobby" value="cooking"> 
	            Reading <input type="checkbox" name="m_hobby" value="reading"> 
	            Travel <input type="checkbox" name="m_hobby" value="travel"><br>
	residence : <select name="m_residence">
	                <option value="seoul" selected="selected">Seoul</option>
	                <option value="jeju">Jeju</option>
	                <option value="daejeon">Daejeon</option>
	                <option value="daegu">Daegu</option>
	                <option value="busan">Busan</option>
	            </select><br>
	            <!-- submit시 form태그에 정의된 action으로 request -->
	            <input type="submit" value="signUp">
	</form>
</body>
</html>
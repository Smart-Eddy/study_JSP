package com.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormDataServlet")
public class FormDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// HTTP GET : URL에 쿼리스트링을 추가하여 요청되는 방식
	//			: 데이터가 URL에 노출될 수 있어 보안상 불리하다.
	//			: 또한 GET요청은 캐싱되거나 북마크 될 수 있다. 검색 결과나 페이지 조회 등에 주로 사용된다. (서버의 상태변경 X)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()!!");
		
		// getParamerNames() 메서드는 request에서 요청보낸 formData의 name값을 꺼낼 수 있다.
		Enumeration<String> names = request.getParameterNames();
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			System.out.println("name : " + name);
		}
		
		// formData의 name값으로 데이터를 꺼내온다.
		String m_name = request.getParameter("m_name");
		String m_pass = request.getParameter("m_pass");
		String m_gender = request.getParameter("m_gender");
		// formData중 값이 여러개라면 getParameterValues()을 호출하여 배열로 반환받을 수 있다.
		String[] m_hobbys = request.getParameterValues("m_hobby");
		String m_residence = request.getParameter("m_residence");
		
		System.out.println("m_name : " + m_name);
		System.out.println("m_pass : " + m_pass);
		System.out.println("m_gender : " + m_gender);
		System.out.println("m_hobbys : " + Arrays.toString(m_hobbys)); // 배열의 문자열을 찍기위해 Arrays의 toString()
		System.out.println("m_residence : " + m_residence);
		
	}
	
	// HTTP POST : HTTP BODY에 데이터를 담아서 요청되는 방식
	//			 : POST방식은 주로 클라이언트가 양식을 제출하거나 데이터를 업로드하는 등의 작업에서 주로 사용된다.
	//			 : GET요청과 달리 데이터가 URL에 노출되지 않고 브라우저에게 캐싱되지 않는다. (서버의 상태변경 O)
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()!!");
		doGet(request, response); // doGet() 호출 : 요청을 메서드 한 곳으로 몰아서 코드를 작성할 수 있다.
	}

}

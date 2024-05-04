package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// web.xml에 정의된 context-param/init-parma에 정의된 data를 처리하는 서블릿 예제
// @WebServlet("/ConfigParamServlet")
public class ConfigParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// init-param
		// web.xml에 정의된 init-param을 가져올 때 getServletConfig() 메서드를 사용해서 가져온다.
		String adminId = getServletConfig().getInitParameter("adminId");
		String adminPw = getServletConfig().getInitParameter("adminPw");
		
		// context-param
		// web.xml에 정의된 init-param을 가져올 때 getServletContext() 메서드를 사용해서 가져온다.
		String imgDir = getServletContext().getInitParameter("imgDir");
		String testServerIP = getServletContext().getInitParameter("testServer");
		String realServerIP = getServletContext().getInitParameter("realServer");
		
		PrintWriter out = response.getWriter();
		// init
		out.print("<p>adminId : "+ adminId + "</p>");
		out.print("<p>adminPw : "+ adminPw + "</p>");
		// context
		out.print("<p>imgDir : "+ imgDir + "</p>");
		out.print("<p>testServerIP : "+ testServerIP + "</p>");
		out.print("<p>realServerIP : "+ realServerIP + "</p>");
		
		// ServletContext의 setAttribute() 메서드를 통해 context-param 설정이 가능하다.
		// context-param에 저장된 데이터는 전역적으로 관리되어 다른 서블릿에서도 참조가 가능하다.
		getServletContext().setAttribute("connectedIP", "165.62.58.33");
		getServletContext().setAttribute("connectedUser", "hong");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

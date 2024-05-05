package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/encodingSignUp")
public class EncodingServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// HTTP method POST 방식일 때는 servlet에서 encoding을 설정해주어야한다.
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		String mName = request.getParameter("m_name");
		String mNickName = request.getParameter("m_nickname");
		
		// encoding 설정을 제대로 해주어야 한글이 깨지지 않는다.
		out.print("<p>mName : " + mName + "</p>");
		out.print("<p>mNickName : " + mNickName + "</p>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getContextParam")
public class ConfigParamServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// ServletContext의 getAttribute 참조 시 String으로 TypeCasting이 필요하다.
		String connectedIP = (String)getServletContext().getAttribute("connectedIP");
		String connectedUser = (String)getServletContext().getAttribute("connectedUser");
		
		PrintWriter out = response.getWriter();
		out.print("<p>connectedIP : "+ connectedIP + "</p>");
		out.print("<p>connectedUser : "+ connectedUser + "</p>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

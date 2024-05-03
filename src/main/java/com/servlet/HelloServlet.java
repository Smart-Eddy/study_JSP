package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet URL 맵핑 방식
// 1. web.xml(배치 서술자) 파일에 xml형식으로 URL맵핑
// 2. Java 어노테이션 방식으로 URL맵핑
@WebServlet("/hello2") 
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public HelloServlet() {
		super();
	}
	
	// HTTP GET
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// getWriter()는 매 호출마다 새로운 PrintWriter를 생성하게 된다.
		// 즉 출력스트림을 생성하게 되는 데 같은 출려스트림이 여러번 호출되게 되면 이전 출력이 무시되고 새로운 출력으로 대체될 수 있다. 
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out =  response.getWriter();
		// Servlet에서 HTML 코드를 작성하는 일은 매우 번거로운 작업이다.
		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print("<p>Hello Servlet!!</p>");
		out.print("</body>");
		out.print("</html>");
	}
	
	// HTTP POST
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

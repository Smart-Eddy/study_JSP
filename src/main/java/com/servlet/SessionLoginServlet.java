package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessionLogin")
public class SessionLoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// form에 입력된 data를 가져온다.
		PrintWriter out = response.getWriter();
		String mId = request.getParameter("mId");
		String mPw = request.getParameter("mPw");
		out.print("mId :" + mId);
		out.print("mPw :" + mPw);
		
		// Session
		// Seesion도 Cookie와 같은 개념으로 HTTP 프로토콜의 상태를 유지하기 위해 등장했다.
		// 하지만 Session은 클라이언트(브라우저)에서 관리되는 Cookie와 다르게 서버(WebCotainer)에서 생성 및 관리된다.
		HttpSession session =  request.getSession(); // Session객체 생성
		session.setAttribute("memeberId", mId); // 서버에 생성된 Session에 setAttribute()
		response.sendRedirect("/study_jsp/view/sessionLoginOk.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookieLogin")
public class CookieLoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// form에 입력된 data를 가져온다.
		PrintWriter out = response.getWriter();
		String mId = request.getParameter("mId");
		String mPw = request.getParameter("mPw");
		
		out.print("mId : " + mId);
		out.print("mPw : " + mPw);
		
		// Cookie 생성
		// 웹에서 사용하는 프로토콜은 HTTP 프로토콜이다.
		// HTTP 프로토콜은 Stateless 프로콜로 한번 요청/응답을 하고 난 뒤 연결을 끊기 때문에 상태가 유지되지 않는다.
		// 이러한 HTTP 프토콜의 단점을 극복하고 상태를 유지하기 위해서 Cookie와 Seesion이 등장헀다.
		// Cookie는 클라이언트(브라우저)에서 관리되기 때문에 request 객체에서 얻어올 수 있다.
		Cookie[] cookies =  request.getCookies();
		Cookie cookie = null;
		
		// Cookie check
		for(Cookie c : cookies) {
			System.out.println("c.getName()" + c.getName() + "c.getValue()" + c.getValue());
			
			// Cookie가 존재한다면 데이터 할당
			if(c.getName().equals("memberId")){
				cookie = c;
			}
		}
		
		// Cookie가 없다면 새로운 Cookie를 생성한다.
		// cookieLogin 첫 요청 시 Cookie는 null이기 때문에 새로운 Cookie가 생성된다.
		if(cookie == null) {
			System.out.println("Cookie is Null....");
			cookie = new Cookie("memberId", mId);
		}
		
		// 쿠키를 response에 담아 클라이언트에게 응답한다
		response.addCookie(cookie);
		cookie.setMaxAge(60 * 60); // 쿠키유효시간설정(1시간)
		response.sendRedirect("/study_jsp/view/cookieLoginOk.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

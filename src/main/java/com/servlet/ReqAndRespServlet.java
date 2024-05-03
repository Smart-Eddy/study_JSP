package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet 작성 시 HttpServlet을 상속받아서 구현하게된다.
// HttpServlet은 GenericServlet을 상속받고 있고 GennericServlet은 ServletConfig/Serializable/Servlet Interface를 구현하고 있다.
@WebServlet("/ReqAndRespServlet")
public class ReqAndRespServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	// Client -> (request) -> [HttpServletRequest]  
	// ※ 클라이언트의 요청에 관한 정보를 담고 있는 객체
	// 1) 요청 메서드  : 클라이언트가 요청한 HTTP 메서드 정보(GET, POST, PUT, DELETE 등)
	// 2) 요청 URL   : 클라이언트가 요청한 URL
	// 3) 요청 헤더   : 클라이언트가 요청한 HTTP 헤더 정보
	// 4) 요청 매개변수 : 클라이언트가 요청한 쿼리 매개변수나 폼 데이터 정보
	// 5) 세션 정보    : 클라이언트의 세션 정보
	// 6) 쿠키 정보    : 클라이언트가 보낸 쿠키 정보
	// 7) 요청 본문    : 클라이언트가 PSOT, PUT 메서드로 전송한 요청 본문
	// 8) 기타        : 클라이언트의 IP주소, 인증, 보안 정보 등...
	
	// [HttpServletResponse] -> (response) -> Client
	// ※ 클라이언트에게 응답을 보낼 때 사용되는 객체
	// 1) HTTP 상태코드     : HTTP 응답코드(200,404,500 등)를 설정할 수 있다
	// 2) 응답 헤더         : HTTP Header(캐시 제어, 콘텐츠 타입 등)를 설정할 수 있다.
	// 3) 콘텐츠 타입        : 클라이언트에게 전송되는 콘텐츠의 MIME 타입(클라이언트와 서버 간에 전송되는 데이터의 유형)을 지정할 수 있다.
	// 4) 응답 본문         : 응답 본문을 작성할 수 있다.(HTML, JSON, XML 등)
	// 5) 리다이렉션 및 포워딩 : sendRedirect()로 다른 페이지로 리다이렉션하거나 RequestDispatcher를 사용하여 포워딩할 수 있다.
	//	5-1) 리다이렉트 : 클라이언트에게 새로운 URL로 재요청하는 방식
	//	5-2) 포워딩    : 클라이언트가 새로운 URL로 요청하는 것이 아닌 서버에서 요청을 다른 자원(Servlet, JSP)으로 전달하는 방식
	// 6) 쿠키설정          : 요청한 클라이언트의 쿠키를 설정할 수 있다.
	// 7) 세션관리          : 요청한 클라이언트의 세션을 관리할 수 있다.
	// 8) 기타
	
	// HTTP GET
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	// HTTP POST
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

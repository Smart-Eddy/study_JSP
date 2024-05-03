package com.servlet;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletLifeCycle")
public class ServletLifeCycle extends HttpServlet {
	// 서블릿 생명주기(Servlet Life-Cycle)
	// @PostConstruct -> [init() -> service -> destroy()] -> @PreDestroy
	// 서블릿의 생명주기는 WAS(Web Application Server)에서 관리해주고 있다.
	
	private static final long serialVersionUID = 1L;
	
	// @PostConstruct : Servlet이 생성되기 전에 호출되어 로직을 수행한다.
	@PostConstruct
	public void post() {
		System.out.println("========Servlet Life-Cycle========");
		System.out.println("@PostConstruct");
	}
	
	// 1. init() : 서블릿이 생성된다.
	@Override
	public void init() throws ServletException {
		System.out.println("1. Servlet init()");
	}
	
	// 2. service : service 메서드 대신 doGet, doPost 메서드가 실행할 서비스 로직을 수행한다. 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("2. Servlet doGet()");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	// 3. destroy() : WAS가 서블릿 자원을 반납(종료)한다.
	@Override
	public void destroy() {
		System.out.println("3. Servlet destory()");
	}
	
	// @PreDestroy : Servlet destroy() 후 에 호출된다.
	@PreDestroy
	public void pre() {
		System.out.println("@PreDestroy");
		System.out.println("========End========");
	}
	

}

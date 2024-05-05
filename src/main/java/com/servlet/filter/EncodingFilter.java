package com.servlet.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

// Filter
// 필터는 웹 애플리케이션에 들어오는 요청과 나가는 응답을 중간에 가로채어 가공하거나 확인하는 기능을 수행할 수 있다.
// Filter는 Interface Filter를 구현해서 정의한다.
// 주로 인증 및 권한, 유효성검사, 로깅, 캐싱 등에 사용될 수 있다.
// Filter는 서블릿 컨테이너에 의해 관리되기 때문에 web.xml(배포서술자)파일에 등록 후 사용한다.
// 또한 Filter의 chain을 통해 여러 필터를 연속적으로 호출할 수 있다.
public class EncodingFilter implements Filter {
	
	private static final long serialVersionUID = 1L;
	
	// Filter가 생성될 때 로직
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("----------EncodingFilter : init()----------");
	}
	
	// Filter가 수행할 동작을 doFilter()메소드에 Override해서 구현한다.
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("----------EncodingFilter : doFilter()----------");
		
		// 만약 모든 Servlet에서 인코딩 설정을 해야한다면 반복적이고 비효율적일 것이다.
		// 요청이 오고 URL매핑이 이루어지기 전에 필요한 전처리작업들을 Filter를 통해서 수행할 수 있다.
		request.setCharacterEncoding("UTF-8");
		// * 요청이 Servlet에게 도달하기 전(URL매핑이 이루어지기 전) doFilter()가 호출된다.
		chain.doFilter(request, response);
		
	}
	
	// Filter가 회수될 때
	@Override
	public void destroy() {
		System.out.println("----------EncodingFilter : destroy()----------");
	}
	

}

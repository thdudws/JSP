package filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

public class BasicFilter implements Filter{

	FilterConfig config;
		
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		config = filterConfig;
		String filterName = filterConfig.getFilterName();
		
		System.out.println("filterName : " + filterName);
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		String method = ((HttpServletRequest)request).getMethod();
		System.out.println("method : " + method);
		
		//반드시 기입! 기입안하면 진행 중단 
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		System.out.println("destroy 호출됨");
	}

}

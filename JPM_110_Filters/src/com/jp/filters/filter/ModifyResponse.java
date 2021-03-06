package com.jp.filters.filter;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
					, urlPatterns={"*.do"})
public class ModifyResponse implements Filter {

  
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//Before part
		System.out.println("In before part of filter");
		RequestDispatcher dispatch= request.getRequestDispatcher("/WEB-INF/jsps/Head.jsp");
		dispatch.include(request, response);
		
		chain.doFilter(request, response); // this will send the control to the servlet, service method of the servlet would be execute and the control will come back here
		
		//After part
		dispatch= request.getRequestDispatcher("/WEB-INF/jsps/Footer.jsp");
		dispatch.include(request, response);
		System.out.println("In after part of filter");
	}
	

	
	public void init(FilterConfig fConfig) throws ServletException {
		//Life Cycle method for filter to do initializaion.
		System.out.println("In filter's init");
	}
	public void destroy() {
		System.out.println("In destroy");
	}

}

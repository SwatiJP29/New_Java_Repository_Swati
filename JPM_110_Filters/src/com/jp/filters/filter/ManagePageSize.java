package com.jp.filters.filter;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
					, urlPatterns = { "*.do" })
public class ManagePageSize implements Filter {


	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("In before part of filter MP");
		chain.doFilter(request, response);
		System.out.println("In after part of filter MP");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}

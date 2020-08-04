package com.demo.web;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class RequestLoggingFilter implements Filter {

   
   

	
	public void destroy() {
		System.out.println("Filter Destroyed :"+this.getClass().getName());
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("Request Received by Filter1...");
		chain.doFilter(request, response);
		System.out.println("Response Sent by Filter1...");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter 1  Initialized..");
	}

}

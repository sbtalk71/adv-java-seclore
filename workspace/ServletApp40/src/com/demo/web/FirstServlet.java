package com.demo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/demo")
public class FirstServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		System.out.println("Request Class is " + request.getClass().getName());

		PrintWriter out = response.getWriter();
		// out.println("Hello From Generic Servlet "+getServletInfo());
		out.println("<html>");
		out.println("<head><title>Test Page</title></head>");
		out.println("<body>");
		out.println("<h1 style=\"color:green\">This is from Servlet "+getServletInfo()+"</h1>");
		out.println("<h1 style=\"color:red\">Today is "+new java.util.Date()+"</h1>");
		out.println("</body>");
		out.println("</html>");

	}

}

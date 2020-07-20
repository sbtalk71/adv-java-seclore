package com.demo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdderServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//http://localhost:8080/AdderWebApp/add?num1=23&num2=46
		
		String num1=request.getParameter("num1");
		String num2=request.getParameter("num2");
		
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		
		out.println("<h1>The Sum = "+(n1+n2)+"</h1>");
	}
}

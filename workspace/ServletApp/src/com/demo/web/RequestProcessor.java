package com.demo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestProcessor extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String name=req.getParameter("name");
		
		out.println("<html>");
		out.println("<head><title>Test Page</title></head>");
		out.println("<body>");
		out.println("<h1 style=\"color:green\">greetings "+name+"</h1>");
		out.println("<h1 style=\"color:red\">Today is "+new java.util.Date()+"</h1>");
		out.println("</body>");
		out.println("</html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String firstName=req.getParameter("fname");
		String lastName=req.getParameter("lname");
		
		out.println("<html>");
		out.println("<head><title>Test Page</title></head>");
		out.println("<body>");
		out.println("<h1 style=\"color:green\">Thank you  "+firstName+" "+lastName+"</h1>");
		out.println("<a href=\"form.html\">Go to Home Page</a>");
		out.println("</body>");
		out.println("</html>");
	}
}

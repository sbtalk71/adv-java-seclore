package com.demo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S2 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	ServletConfig config=getServletConfig();
	String value=config.getInitParameter("user");
	
	ServletContext ctx=getServletContext();
	String driver=ctx.getInitParameter("driver");
	
	out.print("<h1>Value from S2 Servlet Config is"+value+"</h1>");
	out.print("<h1>The Driver is : "+driver+"</h1>");
	
	
}
}

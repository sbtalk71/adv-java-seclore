package com.demo.shop;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CheckOutServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String itemname = req.getParameter("itemName");
		String itemQty = req.getParameter("itemQty");
		
		out.println("<h1>Session Details</h1>");
		out.println("<p>" + itemname + "----" + itemQty + "</p><br>");

		HttpSession session=req.getSession();
		Enumeration<String> attrNames=session.getAttributeNames();
		
		while(attrNames.hasMoreElements()){
			String attrName=attrNames.nextElement();
			out.println("<p>" + attrName + "----"
					+ (String)session.getAttribute(attrName) + "</p><br>");
		}
			session.invalidate();	
	}
}

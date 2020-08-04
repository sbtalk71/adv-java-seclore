package com.demo.shop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CartServlet2 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String itemname= req.getParameter("itemName");
		String itemQty=req.getParameter("itemQty");
		
		HttpSession session=req.getSession();
		session.setAttribute(itemname, itemQty);
		
		out.println("<body><form action=\"CheckOutServlet\" method=\"post\">Enter Item Name:<input type=\"text\" name=\"itemName\"><br/>"
				+ "Enter Item Qty:<input type=\"text\" name=\"itemQty\"><br/><input type=\"submit\" value=\"Next>>\"></form></body>");
	}
}

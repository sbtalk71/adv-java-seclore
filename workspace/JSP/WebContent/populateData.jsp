<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%
		ArrayList<String> al = new ArrayList<String>();
		al.add("Raja");
		al.add("Rani");
		al.add("Joji");
		al.add("Arun");
		al.add("Veena");

		session.setAttribute("data", al);
	%>
	<a href="emplist.jsp">Show Emp List</a>
</body>
</html>
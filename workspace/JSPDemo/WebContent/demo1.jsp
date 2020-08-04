<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Demo Page1</title>
</head>
<body>
	<h1><%="Welcome To JSP"%></h1>
	
	<%!String message="Welcome To Tomcat Server";%>
	
	<h1><%out.println(message); %></h1>
</body>
</html>
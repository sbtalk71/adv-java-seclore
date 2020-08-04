<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.Date" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int a=20; int b=30; %>
<h1>Hello JSP to day is <%=new Date() %></h1>
<h2>Second date : <%out.println(new Date()); %></h2>
<h2>Sum = <%=(a+b) %></h2>

</body>
</html>
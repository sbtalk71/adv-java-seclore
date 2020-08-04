<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String input = request.getParameter("n1");
		if (input.equals("one")) {
	%>

	<jsp:forward page="page1.jsp" />

	<%
		} else if (input.equals("two")) {
	%>
	<jsp:forward page="page2.jsp" />
	<%
		} else {
	%>
	<h1>Enter some sensible value</h1>
	<%
		}
	%>
</body>
</html>
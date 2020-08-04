<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
			String fn = request.getParameter("fn");
			String ln = request.getParameter("ln");
		%>
		<!-- 
		<jsp:setProperty property="firstName" name="nb" value="<%=fn %>"/>
		<jsp:setProperty property="lastName" name="nb" value="<%=ln %>"/>
		 -->
		 <jsp:setProperty property="*" name="nb"/>
		 
		<jsp:forward page="display.jsp"></jsp:forward>
</body>
</html>
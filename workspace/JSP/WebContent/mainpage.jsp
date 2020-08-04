<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="page1.jsp"%>
	<%@ include file="page2.jsp"%>


	<table border="1">
		<tr>
			<td colspan="2"><%@ include file="page1.jsp"%></td>
		</tr>
		<tr>
			<td><%@ include file="page1.jsp"%></td>
			<td><%@ include
				file="page2.jsp"%></td>
		</tr>
		<tr>
			<td colspan="2"><%@ include file="page1.jsp"%></td>
		</tr>
	</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees List</title>
</head>
<body>
	<c:forEach items="${list}" var="emp">
		<c:out value="${ emp.empId}" />
		<c:out value="${ emp.name}" />
		<c:out value="${ emp.city}" />
		<c:out value="${ emp.salary}" />
	</c:forEach>
</body>
</html>
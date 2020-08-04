<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Register Employee Form</h1>
	<hr>
	<form:form action="save" method="post" modelAttribute="emp">
		<table>
			<tr>
				<td>Employee Id</td>
				<td><form:input path="empId" /></td>
				<td><form:errors path="empId" cssStyle="color:red" /></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssStyle="color:red" /></td>
			</tr>
			<tr>
				<td>City</td>
				<td><form:input path="city" /></td>
				<td><form:errors path="city" cssStyle="color:red" /></td>
			</tr>
			<tr>
				<td>Salary</td>
				<td><form:input path="salary" /></td>
				<td><form:errors path="salary" cssStyle="color:red" /></td>
			</tr>
			<tr>

				<td colspan="3"><input type="submit" value="Save"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
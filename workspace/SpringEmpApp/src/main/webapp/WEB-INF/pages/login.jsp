<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login Form</h1>
	<hr>
	<form action="login" method="post">
		<table>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="name" id="name"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" id="pwd"></td>
			</tr>
			<tr>

				<td colspan="2"><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
</body>
</html>
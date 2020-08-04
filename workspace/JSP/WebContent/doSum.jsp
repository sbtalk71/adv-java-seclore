<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%! int a=0; int b=0;
	public int add(int a, int b) {
		return a + b;
	}%>
	<%String an1=request.getParameter("n1");
	String an2=request.getParameter("n2");
	if(an1!="" || an2!=""){
		a = Integer.parseInt(an1);
		b = Integer.parseInt(an2);
		
			out.println(add(a, b));
	}
	else{%>
		<h1>Please enter values...</h1>
	<%}
	%>
	<h1>
		

	</h1>
</body>
</html>
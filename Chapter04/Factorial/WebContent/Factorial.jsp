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
		for (int i = 0; i <= 10; i++) {
	%>
	Factorial of
	<%=i%>
	is
	<%=computeFactorial(i)%>
	<br />
	<%
		}
	%>
	 
	<%!private long computeFactorial(int n) {
		if (n == 0)
			return 1;
		else
			return n * computeFactorial(n - 1);
	}%>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ page import="chapter9.Loan"%>
	<%
		double loanAmount = Double.parseDouble(request.getParameter("loanAmount"));
		double annualInterestRate = Double.parseDouble(request.getParameter("annualInterestRate"));
		int numberOfYears = Integer.parseInt(request.getParameter("numberOfYears"));
		
		Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
	%>
	Loan Amount:<%=loanAmount%>
	<br /> Annual Interest Rate: <%=annualInterestRate%>
	<br /> Number of Years: <%=numberOfYears%>
	
	<br /><b>Monthly Payment: <%=loan.getMonthlyPayment()%>
	<br /> Total Payment: <%=loan.getTotalPayment()%><br /></b>
</body>
</html>
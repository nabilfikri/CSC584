<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% double loanAmount = Double.parseDouble(request.getParameter("loanAmount"));
     double annualInterestRate = Double.parseDouble(request.getParameter("annualInterestRate"));
     double numberOfYears = Double.parseDouble(request.getParameter("numberOfYears"));
     
     double monthlyInterestRate = annualInterestRate / 1200;
     double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
     double totalPayment = monthlyPayment * numberOfYears * 12; %>
     
	Loan Amount: <%= loanAmount %>
	<br /> Annual Interest Rate: <%= annualInterestRate %>
	<br /> Number of Years:<%= numberOfYears %>
	<br /><b>Monthly Payment: <%= monthlyPayment %>
	<br /> Total Payment: <%= totalPayment %><br /></b>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    
<%@ page import="calculator.Loan"%>

<%
	double loanAmount = Double.parseDouble(request.getParameter("loanAmount"));
	double annualInterestRate = Double.parseDouble(request.getParameter("annualInterestRate"));
	int numberOfYears = Integer.parseInt(request.getParameter("numberOfYears"));
%>

<jsp:useBean id="loan" class="calculator.Loan" scope="page"></jsp:useBean>

<jsp:setProperty name="loan" property="loanAmount" value="<%=loanAmount %>"/>
<jsp:setProperty name="loan" property="annualInterestRate" value="<%=annualInterestRate %>"/>
<jsp:setProperty name="loan" property="numberOfYears" value="<%=numberOfYears %>"/>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compute Loan Calculation Result</title>
</head>
<body>
	Loan Amount: <jsp:getProperty property="loanAmount" name="loan"/> <br>
	Annual Interest Rate: <jsp:getProperty property="annualInterestRate" name="loan"/> <br>
	Number of Years: <jsp:getProperty property="numberOfYears" name="loan"/> <br><br>	
	<b>
	Monthly Payment: <%=loan.getMonthlyPayment() %> <br>
	Total Payment: <%=loan.getTotalPayment() %><br>
	</b>
</body>
</html>
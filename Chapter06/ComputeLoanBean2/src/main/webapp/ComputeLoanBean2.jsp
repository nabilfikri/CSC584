<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    
<%@ page import="calculator.Loan"%>

<jsp:useBean id="loan" class="calculator.Loan" scope="page"></jsp:useBean>

<jsp:setProperty name="loan" property="loanAmount" param="loanAmount"/>
<jsp:setProperty name="loan" property="annualInterestRate" param="annualInterestRate" />
<jsp:setProperty name="loan" property="numberOfYears" param="numberOfYears"/>


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
	Total Payment: <%=loan.getTotalPayment() %> <br>
	</b>
</body>
</html>
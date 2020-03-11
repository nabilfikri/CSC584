<html>
<head>
<title>Compute Loan 2 using Bean properties</title>
</head>
<body>
	<%@ page import="chapter9.Loan"%>
	<jsp:useBean id="loan" class="chapter9.Loan" scope="page"></jsp:useBean>
	<jsp:setProperty name="loan" property="*" />
	
	Loan Amount: <%= loan.getLoanAmount() %>
	<br /> Annual Interest Rate: <%= loan.getAnnualInterestRate() %>
	<br /> Number of Years: <%= loan.getNumberOfYears() %>
	<br /><b>Monthly Payment: <%= loan.getMonthlyPayment() %>
	<br /> Total Payment: <%= loan.getTotalPayment() %><br /></b>
</body>
</html>
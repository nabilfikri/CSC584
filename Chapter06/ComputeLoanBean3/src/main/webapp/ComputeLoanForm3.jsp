<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compute Loan Form</title>
</head>
<body>
 <form method="post" action="ComputeLoanBean3.jsp">
    <h1>Compute Loan Payment</h1>
    
    Loan Amount: <input type="text" name="loanAmount" /><br><br>
    Annual Interest Rate: <input type="text" name="annualInterestRate" /><br><br>
    Number of Years: <input type="text" name="numberOfYears" size="3" /><br><br>
    <p>
    	<input type="submit" name="Submit" value="Compute Loan Payment" />
    	<input type="reset" value="Reset" />
   	</p>
    </form>
</body>
</html>
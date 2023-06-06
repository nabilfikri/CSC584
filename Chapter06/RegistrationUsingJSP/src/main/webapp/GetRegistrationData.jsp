<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<%@ page import="registerjsp.Address" %>

<jsp:useBean id="addressId" class="registerjsp.Address" scope="session"></jsp:useBean>

<!-- associating all properties with input parameters -->
<jsp:setProperty name="addressId" property="*" />

<!DOCTYPE html>
<html>
<head>
<title>Registration Using JSP</title>
</head>
<body>
	<h1>Registration Using JSP</h1>
	
	<!-- Simple Validation -->
	<%	if (addressId.getLastName() == null || addressId.getFirstName() == null) {	%>
			Last Name and First Name are required
	<%  }    %>

	<p>You entered the following data</p>
				<!-- similar to < % = addressId.getLastName() %> -->
	Last name: <jsp:getProperty property="lastName" name="addressId"/><br><br>
	First name: <jsp:getProperty property="firstName" name="addressId"/><br><br>
	MI: <jsp:getProperty property="mi" name="addressId"/><br><br>
	Telephone: <jsp:getProperty property="telephone" name="addressId"/><br><br>
	Email: <jsp:getProperty property="email" name="addressId"/><br><br>
	Address: <jsp:getProperty property="street" name="addressId"/><br><br>
	City: <jsp:getProperty property="city" name="addressId"/><br><br>
	State: <jsp:getProperty property="state" name="addressId"/><br><br>
	Zip: <jsp:getProperty property="zip" name="addressId"/><br><br>
	
	<!-- Set the action for processing the answers -->
	<form method="post" action="StoreStudent.jsp">
		<input type="submit" value="Confirm">
	</form>
</body>
</html>
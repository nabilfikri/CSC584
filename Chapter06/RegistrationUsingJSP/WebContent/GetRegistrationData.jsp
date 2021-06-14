<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="chapter10.Address"%>

<jsp:useBean id="addressId" class="chapter10.Address" scope="session"></jsp:useBean>

<!-- associating all properties with input parameters -->
<jsp:setProperty name="addressId" property="*" />

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Using JSP</title>
</head>
<body>
	<h1>Registration Using JSP</h1>

	    
<%	if (addressId.getLastName() == null || addressId.getFirstName() == null) {	%>
		Last Name and First Name are required
<%  }    %>

	<p>You entered the following data</p>
	
	<p>Last name: <jsp:getProperty property="lastName" name="addressId"/></p>
	<p>First name: <jsp:getProperty property="firstName" name="addressId"/></p>
	<p>MI: <jsp:getProperty property="mi" name="addressId"/></p>
	<p>Telephone: <jsp:getProperty property="telephone" name="addressId"/></p>
	<p>Email: <jsp:getProperty property="email" name="addressId"/></p>
	<p>Address: <jsp:getProperty property="street" name="addressId"/></p>
	<p>City: <jsp:getProperty property="city" name="addressId"/></p>
	<p>State: <jsp:getProperty property="state" name="addressId"/></p>
	<p>Zip: <jsp:getProperty property="zip" name="addressId"/></p>
	
	<!-- similar to < % = addressId.getLastName() %> -->
	

	<!-- Set the action for processing the answers -->
	<form method="post" action="StoreStudent.jsp">
		<input type="submit" value="Confirm">
	</form>
</body>
</html>
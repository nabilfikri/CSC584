<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="chapter10.Address"%>
<jsp:useBean id="addressId" class="chapter10.Address" scope="session"></jsp:useBean>
<jsp:setProperty name="addressId" property="*" />

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Using JSP</title>
</head>
<body>
	<h1>Registration Using JSP</h1>

	<%    
    if (addressId.getLastName() == null || 
        addressId.getFirstName() == null) {
      out.println("Last Name and First Name are required");
      return; // End the method
    }
    %>

	<p>You entered the following data</p>
	<p>
		Last name:
		<%= addressId.getLastName() %></p>
	<p>
		First name:
		<%= addressId.getFirstName() %></p>
	<p>
		MI:
		<%= addressId.getMi() %></p>
	<p>
		Telephone:
		<%= addressId.getTelephone() %></p>
	<p>
		Email:
		<%= addressId.getEmail() %></p>
	<p>
		Address:
		<%= addressId.getStreet() %></p>
	<p>
		City:
		<%= addressId.getCity() %></p>
	<p>
		State:
		<%= addressId.getState() %></p>
	<p>
		Zip:
		<%= addressId.getZip() %></p>

	<!-- Set the action for processing the answers -->
	<form method="post" action="StoreStudent.jsp">
		<input type="submit" value="Confirm">
	</form>
</body>
</html>
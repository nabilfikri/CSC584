<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ page import="registerjsp.Address"%>

<jsp:useBean id="addressId" class="registerjsp.Address" scope="session"></jsp:useBean>

<jsp:useBean id="storeDataId" class="registerjsp.StoreData" scope="application"></jsp:useBean>

<html>
<head>
<title>Insert title here</title>
</head>
<body>

	<% storeDataId.storeStudent(addressId); %>
	
	<jsp:getProperty property="firstName" name="addressId"/>
	 <jsp:getProperty property="lastName" name="addressId"/>
	 is now registered in the database.
	 
</body>
</html>
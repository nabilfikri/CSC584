<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="chapter10.Address"%>
<jsp:useBean id="addressId" class="chapter10.Address" scope="session"></jsp:useBean>
<jsp:useBean id="storeDataId" class="chapter10.StoreData" scope="application"></jsp:useBean>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%    
      storeDataId.storeStudent(addressId);

      out.println(addressId.getFirstName() + " " + 
        addressId.getLastName() + " is now registered in the database");
      out.close(); // Close stream
    %>
</body>
</html>
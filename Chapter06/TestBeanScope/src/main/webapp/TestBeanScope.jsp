<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="testbeanscope.Count" %>

<jsp:useBean id="count" scope="application" class="testbeanscope.Count">
</jsp:useBean>    


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test Bean Scope</title>
</head>
<body>
	<h3>Testing Bean Scope in JSP (Application)</h3>
	<% count.increaseCount(); %>
	You are visitor number <%= count.getCount() %>
	<br /> From host: <%= request.getRemoteHost() %> and session: <%= session.getId() %>
</body>
</html>
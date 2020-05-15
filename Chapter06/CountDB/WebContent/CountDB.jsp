<%@ page import = "chapter10.CountDB" %>

<jsp:useBean id = "count" scope = "application" class = "chapter10.CountDB">
</jsp:useBean>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Updating counter into the database</title>
</head>
<body>
	<h3>Updating counter into the database</h3>
	<% 	count.getCount();
		count.increaseCount(); %>
	You are visitor number <%= count.getCount() %>
	<br /> From host: <%= request.getRemoteHost() %> and session: <%= session.getId() %>
</body>
</html>
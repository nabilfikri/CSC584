<%@ page import="counter.CountDB" %>

<jsp:useBean id="count" scope="application" class="counter.CountDB" />

<html>
<head>
<title>Updating counter into the database</title>
</head>
<body>
	
	<h3>Updating counter into the database</h3>
	
	<% 	
		count.getCount();
		count.increaseCount(); 
	%>
	
	You are visitor number <%= count.getCount() %> <br><br>
	
	From host: <%= request.getRemoteHost() %> and session: <%= session.getId() %>
	
</body>
</html>
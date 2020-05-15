<%@ page import = "chapter9.Count" %>

<jsp:useBean id = "count" scope = "session" class = "chapter9.Count">
</jsp:useBean>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test Bean Scope</title>
</head>
<body>
	<h3>Testing Bean Scope in JSP (Application)</h3>
	<% count.increaseCount(); %>
	You are visitor number <%= count.getCount() %>
	<br /> From host: <%= request.getRemoteHost() %> and session: <%= session.getId() %>
</body>
</html>
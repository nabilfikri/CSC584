<%@ page import="chapter9.TimeBean"%>
<jsp:useBean id="timeBeanId" class="chapter9.TimeBean" scope="application">
</jsp:useBean>
<jsp:setProperty name="timeBeanId" property="*" />
<html>
<head>
<title>Display Time</title>
</head>
<body>
	<h3>Choose locale and time zone</h3>
	Current time is
	<%= timeBeanId.currentTimeString(timeBeanId.getLocaleIndex(), timeBeanId.getTimeZoneIndex()) %>
</body>
<html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.ArrayList"%> 
<%@ page import="person.Person" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Carry Value Using request Object</h1>

Value from attribute myName: <%= request.getAttribute("myName") %>


<!-- <h1>List of Persons</h1> --> 

<%-- <% ArrayList<Person> persons = (ArrayList<Person>) request.getAttribute("persons"); --%> 


<%-- <% for(Person person : persons) { --%> 
<%--	name: <%=person.getName() %> --%> 
<%--	id: <%=person.getId() %> --%>
	<!-- <br> --> 
<%-- <% } %> --%>


</body>
</html>
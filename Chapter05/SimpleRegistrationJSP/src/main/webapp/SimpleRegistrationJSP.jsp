<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ page import="java.sql.PreparedStatement, java.sql.Connection, java.sql.DriverManager, java.sql.SQLException" %>

<%! private PreparedStatement pstmt; %>
    
<%
	//Obtain data from the form
	String lastName = request.getParameter("lastName");
	String firstName = request.getParameter("firstName");
	String mi = request.getParameter("mi");
	String phone = request.getParameter("telephone");
	String email = request.getParameter("email");
	String street = request.getParameter("street");
	String city = request.getParameter("city");
	String state = request.getParameter("state");
	String zip = request.getParameter("zip");
	
	//TODO: Data validation
	
	initializeJdbc();
%>

<%!	private void initializeJdbc() {
		try {
			// Load the JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
	
			// Establish a connection
			Connection conn = DriverManager.getConnection
					("jdbc:mysql://localhost/sampledb", "root", "");
			System.out.println("Database connected");
	
			// Create a Statement
			pstmt = conn.prepareStatement("insert into Address " +
					"(lastName, firstName, mi, telephone, email, street, city, "
					+ "state, zip) values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
%>

<%! private void storeStudent(String lastName, String firstName,
		String mi, String phone, String email, String address,
		String city, String state, String zip) throws SQLException {
	
		pstmt.setString(1, lastName);
		pstmt.setString(2, firstName);
		pstmt.setString(3, mi);
		pstmt.setString(4, phone);
		pstmt.setString(5, email);
		pstmt.setString(6, address);
		pstmt.setString(7, city);
		pstmt.setString(8, state);
		pstmt.setString(9, zip);
		pstmt.executeUpdate();
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple Registration using JSP without Confirmation</title>
</head>
<body>
	<p>Simple Registration using JSP without Confirmation</p>
	
	<% storeStudent(lastName, firstName, mi, phone, email, street, city, state, zip); %>
	
	<%=firstName %> <%=lastName %> is now registered in the database
</body>
</html>
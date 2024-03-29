

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ConfirmRegistration")
public class ConfirmRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private PreparedStatement pstmt;
	
	@Override
	public void init() throws ServletException {
		super.init();
		initializeJdbc();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// Obtain data from the form
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
		
        out.println("<html>");
        out.println("   <head>");
        out.println("       <title>Simple Registration with Confirmation</title>");
        out.println("   </head>");
        out.println("   <body>");
        out.println("   <h1>Confirmation page</h1>");
        out.println("	<p>Simple Registration with Confirmation</p>");
        out.println("   <p>Sample program that retrieves data from database using PreparedStatement</p>");
        
        // Ask for confirmation
		out.println("	You entered the following data");
		out.println("	<p>Last name: " + lastName);
		out.println("	<br>First name: " + firstName);
		out.println("	<br>MI: " + mi);
		out.println("	<br>Telephone: " + phone);
		out.println("	<br>Email: " + email);
		out.println("	<br>Address: " + street);
		out.println("	<br>City: " + city);
		out.println("	<br>State: " + state);
		out.println("	<br>Zip: " + zip);

		// Set the action for processing the answers
		out.println("	<p><form method=\"post\" action=\"ConfirmRegistration\">");
		
		// Set hidden values, alternatively use HttpSession or Cookies
		out.println("	<p><input type=\"hidden\" value=" + lastName + " name=\"lastName\">");
		out.println("	<p><input type=\"hidden\" value=" + firstName + " name=\"firstName\">");
		out.println("	<p><input type=\"hidden\" value=" + mi + " name=\"mi\">");
		out.println("	<p><input type=\"hidden\" value=" + phone + " name=\"telephone\">");
		out.println("	<p><input type=\"hidden\" value=" + email + " name=\"email\">");
		out.println("	<p><input type=\"hidden\" value=" + street + " name=\"street\">");
		out.println("	<p><input type=\"hidden\" value=" + city + " name=\"city\">");
		out.println("	<p><input type=\"hidden\" value=" + state + " name=\"state\">");
		out.println("	<p><input type=\"hidden\" value=" + zip + " name=\"zip\">");
		out.println("	<p><input type=\"submit\" value=\"Confirm\" >");
		out.println("	</form>");
        out.println("</body>");
        out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// Obtain data from confirmation page (doGet())
		String lastName = request.getParameter("lastName");
		String firstName = request.getParameter("firstName");
		String mi = request.getParameter("mi");
		String phone = request.getParameter("telephone");
		String email = request.getParameter("email");
		String street = request.getParameter("street");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String zip = request.getParameter("zip");
		
        out.println("<html>");
        out.println("   <head>");
        out.println("       <title>Simple Registration with Confirmatio</title>");
        out.println("   </head>");
        out.println("   <body>");
        out.println("   <h1>Check Grade</h1>");
        out.println("   <p>Sample program that retrieves data from database using PreparedStatement</p>");
        try {
        	storeStudent(lastName, firstName, mi, phone, email, street, city, state, zip);
        	out.println(firstName + " " + lastName + " is now registered in the database");
        } catch (SQLException e) {
        	e.printStackTrace();
        }
        out.println("   </body>");
        out.println("</html>");
	}
	
	/** Initialize prepared stmt */
	private void initializeJdbc() {
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
	
	/** Store a student record to the database */
	private void storeStudent(String lastName, String firstName,
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

}

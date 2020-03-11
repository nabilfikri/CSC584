

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// Obtain data from the form
		String lastName = request.getParameter("lastName");
		String firstName = request.getParameter("firstName");
		String mi = request.getParameter("mi");
		String telephone = request.getParameter("telephone");
		String email = request.getParameter("email");
		String street = request.getParameter("street");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String zip = request.getParameter("zip");

		if (lastName.length() == 0 || firstName.length() == 0) {
			out.println("Last Name and First Name are required");
		}
		else {
			// Ask for confirmation
			out.println("You entered the following data");
			out.println("<p>Last name: " + lastName);
			out.println("<br>First name: " + firstName);
			out.println("<br>MI: " + mi);
			out.println("<br>Telephone: " + telephone);
			out.println("<br>Email: " + email);
			out.println("<br>Address: " + street);
			out.println("<br>City: " + city);
			out.println("<br>State: " + state);
			out.println("<br>Zip: " + zip);

			// Set the action for processing the answers
			out.println("<p><form method=\"post\" action=" +
					"Registration>");
			// Set hidden values
			out.println("<p><input type=\"hidden\" " +
					"value=" + lastName + " name=\"lastName\">");
			out.println("<p><input type=\"hidden\" " +
					"value=" + firstName + " name=\"firstName\">");
			out.println("<p><input type=\"hidden\" " +
					"value=" + mi + " name=\"mi\">");
			out.println("<p><input type=\"hidden\" " +
					"value=" + telephone + " name=\"telephone\">");
			out.println("<p><input type=\"hidden\" " +
					"value=" + email + " name=\"email\">");
			out.println("<p><input type=\"hidden\" " +
					"value=" + street + " name=\"street\">");
			out.println("<p><input type=\"hidden\" " +
					"value=" + city + " name=\"city\">");
			out.println("<p><input type=\"hidden\" " +
					"value=" + state + " name=\"state\">");
			out.println("<p><input type=\"hidden\" " +
					"value=" + zip + " name=\"zip\">");
			out.println("<p><input type=\"submit\" value=\"Confirm\" >");
			out.println("</form>");
		}

		out.close(); // Close stream
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		try {
			String lastName = request.getParameter("lastName");
			String firstName = request.getParameter("firstName");
			String mi = request.getParameter("mi");
			String telephone = request.getParameter("telephone");
			String email = request.getParameter("email");
			String street = request.getParameter("street");
			String city = request.getParameter("city");
			String state = request.getParameter("state");
			String zip = request.getParameter("zip");

			out.println(firstName + " " + lastName + " is now registered in the database");
		}
		catch(Exception ex) {
			out.println("Error: " + ex.getMessage());
		}
	}

}

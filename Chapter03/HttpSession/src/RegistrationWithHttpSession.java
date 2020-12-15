

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegistrationWithHttpSession
 */
@WebServlet("/RegistrationWithHttpSession")
public class RegistrationWithHttpSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrationWithHttpSession() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response type and output stream to the browser
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
			// Create an Address object
			Address address = new Address();
			address.setLastName(lastName);
			address.setFirstName(firstName);
			address.setMi(mi);
			address.setTelephone(telephone);
			address.setEmail(email);
			address.setStreet(street);
			address.setCity(city);
			address.setState(state);
			address.setZip(zip);
			
			//Normal Constructor
//			Address add = new Address(.add...)

			// Get an HttpSession or create one if it does not exist
			HttpSession httpSession = request.getSession();

			// Store student object to the session
			httpSession.setAttribute("address", address);

			// Ask for confirmation
			out.println("You entered the following data");
			out.println("<p>Last name: " + lastName);
			out.println("<p>First name: " + firstName);
			out.println("<p>MI: " + mi);
			out.println("<p>Telephone: " + telephone);
			out.println("<p>Email: " + email);
			out.println("<p>Address: " + street);
			out.println("<p>City: " + city);
			out.println("<p>State: " + state);
			out.println("<p>Zip: " + zip);

			// Set the action for processing the answers
			out.println("<p><form method=\"post\" action=" +
					"RegistrationWithHttpSession>");
			out.println("<p><input type=\"submit\" value=\"Confirm\" >");
			out.println("</form>");
		}

		out.close(); // Close stream
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response type and output stream to the browser
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// Obtain the HttpSession
		HttpSession httpSession = request.getSession();

		// Get the Address object in the HttpSession
		Address address = (Address)(httpSession.getAttribute("address"));

		try {
			out.println(address.getFirstName() + " " + address.getLastName()
					+ " is now registered in the database");
			out.close(); // Close stream
		}
		catch(Exception ex) {
			out.println("Error: " + ex.getMessage());
		}
	}

}

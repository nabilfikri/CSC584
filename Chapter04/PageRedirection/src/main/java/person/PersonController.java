package person;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import person.Person;

/**
 * Servlet implementation class Dispacther2
 */
@WebServlet("/PersonController")
public class PersonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Forward a string
		request.setAttribute("myName", "Nabil Fikri");

		//Forward list of objects
//		Person p1 = new Person("437", "Shukri");
//		Person p2 = new Person("578", "Faiz");
//		Person p3 = new Person("198", "Nadhirah");
//		
//		ArrayList <Person> persons = new ArrayList<Person>();
//		persons.add(p1);
//		persons.add(p2);
//		persons.add(p3);
//		request.setAttribute("persons", persons);
		
		
		// PAGE REDIRECTS
		
		// 1. Using RequestDispatcher
		RequestDispatcher dispatcher = request.getRequestDispatcher("/View.jsp");
		dispatcher.forward(request, response);
		
		// 2. Using sendRedirect
//		response.sendRedirect("View.jsp");
	}
}
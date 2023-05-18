

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FindGrade
 */
@WebServlet("/FindGrade")
public class FindGrade extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	PreparedStatement preparedStatement;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("   <head>");
        out.println("       <title>My Servlet Example</title>");
        out.println("   </head>");
        out.println("   <body>");
        out.println("   <h1>Check Grade</h1>");
        out.println("   <p>Sample program that retrieves data from database using PreparedStatement</p>");
        out.println("   <form action=\"FindGrade\" method=\"post\">");
        out.println("   	SSN: <input type=\"text\" name=\"ssn\"> <br><br>");
        out.println("   	Course ID: <input type=\"text\" name=\"courseid\"> <br><br>");
        out.println("   	<input type=\"submit\" value=\"Show Grade\">");
        out.println("   </form>");
        out.println("   </body>");
        out.println("</html>");
    }

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String ssn = request.getParameter("ssn");
		String courseId = request.getParameter("courseid");
		
		String lastName = null, mi = null, firstName = null, title = null, grade = null;
		
		initializeDB();
		
		try {
			preparedStatement.setString(1, ssn);
			preparedStatement.setString(2, courseId);
			ResultSet rset = preparedStatement.executeQuery();
			if (rset.next()) {
				lastName = rset.getString(1);
				mi = rset.getString(2);
				firstName = rset.getString(3);
				title = rset.getString(4);
				grade = rset.getString(5);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
        out.println("<html>");
        out.println("   <head>");
        out.println("       <title>My Servlet Example</title>");
        out.println("   </head>");
        out.println("   <body>");
        out.println("   <h1>Result</h1>");
        
        if(lastName != null) {
        	out.println("<p>" + firstName + " " + mi + " " + lastName + "'s grade on course " + title + " is " + grade + "</p>");        	
        }
        else {
        	out.println("<p>Record cannot be found.</p>");        	
        }

        out.println("   </body>");
        out.println("</html>");
	}
	
    private void initializeDB() {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");

            // Establish a connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/sampledb", "root", "");
            System.out.println("Database connected");

            String queryString = "select firstName, middleName, " +
                    "lastName, title, grade from student, enrollment, course " +
                    "where student.ssn = ? and enrollment.courseId = ? " +
                    "and enrollment.courseId = course.courseId";

            // Create a statement
            preparedStatement = connection.prepareStatement(queryString);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }



}

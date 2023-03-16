package httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ProcessRegisterSO")
public class ProcessRegisterSO extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String email = req.getParameter("email");
        String firstname = req.getParameter("first_name");
        String lastname = req.getParameter("last_name");

        HttpSession session = req.getSession(true);

        //Create object and store the object in session
        User user = new User(email, firstname, lastname);
        session.setAttribute("user-object", user);
        
        out.println("<html>");
        out.println("   <head>");
        out.println("       <title>User Registration Form</title>");
        out.println("   </head>");
        out.println("   <body>");
        out.println("   <h1>User Registration Form</h1>");
        out.println("   <p>*Using HttpSession</p>");
        out.println("   <p>Please confirm the information entered.</p>");

        out.println("   Email: " + email + "<br>");
        out.println("   First Name: " + firstname + "<br>");
        out.println("   Last Name: " + lastname + "<br><br>");
        
        out.println("   <form method=\"POST\" action=\"ProcessRegisterSO\">");
        out.println("       <input type=\"Submit\" value=\"Confirm\">");
        out.println("   </form>");

        out.println("   </body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        HttpSession session = req.getSession(true);

        User user = (User) session.getAttribute("user-object");

        out.println("Account for " + user.getFirstname() + " " + user.getLastname() + " is now created. <br><br>");
    }
}
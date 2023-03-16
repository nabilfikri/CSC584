package httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ProcessRegisterS")
public class ProcessRegisterS extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String email = req.getParameter("email");
        String firstname = req.getParameter("first_name");
        String lastname = req.getParameter("last_name");

        HttpSession session = req.getSession(true);
        session.setAttribute("e-mail", email);
        session.setAttribute("first-name", firstname);
        session.setAttribute("last-name", lastname);
        
        // User user = new User(email, firstname, lastname);
        
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
        
        out.println("   <form method=\"POST\" action=\"ProcessRegisterS\">");
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

        String email = (String) session.getAttribute("e-mail");
        String firstname = (String) session.getAttribute("first-name");
        String lastname = (String) session.getAttribute("last-name");

        out.println("Account for " + firstname + " " + lastname + " is now created. <br>");
    }
}
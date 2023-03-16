package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProcessRegisterC")
public class ProcessRegisterC extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String email = req.getParameter("email");
        String firstname = req.getParameter("first_name");
        String lastname = req.getParameter("last_name");

        Cookie cEmail = new Cookie("e-mail", email);
        resp.addCookie(cEmail);

        Cookie cFirstName = new Cookie("first-name", firstname);
        resp.addCookie(cFirstName);

        Cookie cLastName = new Cookie("last-name", lastname);
        resp.addCookie(cLastName);
        
        out.println("<html>");
        out.println("   <head>");
        out.println("       <title>User Registration Form</title>");
        out.println("   </head>");
        out.println("   <body>");
        out.println("   <h1>User Registration Form</h1>");
        out.println("   <p>*Using cookies</p>");
        out.println("   <p>Please confirm the information entered.</p>");
        
        out.println("   Email: " + email + "<br>");
        out.println("   First Name: " + firstname + "<br>");
        out.println("   Last Name: " + lastname + "<br><br>");
        
        out.println("   <form method=\"POST\" action=\"ProcessRegisterC\">");
        out.println("       <input type=\"Submit\" value=\"Confirm\">");
        out.println("   </form>");

        out.println("   </body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String email = "", firstname = "", lastname = "";

        // Read cookies
        Cookie[] cookies = req.getCookies();

        // Get cookie values
        for(int i = 0; i < cookies.length; i++) {
            if(cookies[i].getName().equals("e-mail")) {
                email = cookies[i].getValue();
            }
            else if(cookies[i].getName().equals("first-name")) {
                firstname = cookies[i].getValue();
            }
            else if(cookies[i].getName().equals("last-name")) {
                lastname = cookies[i].getValue();
            }
        }
        out.println("Account for " + firstname + " " + lastname + " is now created. <br>");
    }
}

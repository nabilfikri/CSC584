package hiddenfield;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProcessRegisterHFF")
public class ProcessRegisterHFF extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String email = req.getParameter("email");
        String firstname = req.getParameter("first_name");
        String lastname = req.getParameter("last_name");
        String secretkey = req.getParameter("secret_key");

        out.println("<html>");
        out.println("   <head>");
        out.println("       <title>User Registration Form</title>");
        out.println("   </head>");
        out.println("   <body>");
        out.println("   <h1>User Registration Form</h1>");
        out.println("   <p>*Using hidden form field</p>");
        out.println("   <p>Please confirm the information entered.</p>");

        out.println("   Email: " + email + "<br>");
        out.println("   First Name: " + firstname + "<br>");
        out.println("   Last Name: " + lastname + "<br>");
        
        out.println("   <form method=\"POST\" action=\"ProcessRegisterHFF\">");
        out.println("       <input type=\"hidden\" name=\"email\" value=\"" + email + "\">");
        out.println("       <input type=\"hidden\" name=\"first_name\" value=\"" + firstname + "\">");
        out.println("       <input type=\"hidden\" name=\"last_name\" value=\"" + lastname + "\">");
        out.println("       <input type=\"hidden\" name=\"secret_key\" value=\"" + secretkey + "\"> <br>");
        out.println("       <input type=\"Submit\" value=\"Confirm\">");
        out.println("   </form>");

        out.println("   </body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String email = req.getParameter("email");
        String firstname = req.getParameter("first_name");
        String lastname = req.getParameter("last_name");
        String secretkey = req.getParameter("secret_key");

        out.println("Account for " + firstname + " " + lastname + " is now created. <br>");
        out.print("Secret Key: " + secretkey);
    }
}

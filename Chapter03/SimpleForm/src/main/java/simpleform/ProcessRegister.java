package simpleform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProcessRegister")
public class ProcessRegister extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String icno = req.getParameter("ic_no");
        String firstname = req.getParameter("first_name");
        String lastname = req.getParameter("last_name");
        String gender = req.getParameter("gender");
        String javaee = req.getParameter("JavaEE");
        String php = req.getParameter("PHP");
        String asp = req.getParameter("ASP");

        out.println("<html>");
        out.println("   <head>");
        out.println("       <title>User Registration Form</title>");
        out.println("   </head>");
        out.println("   <body>");
        out.println("   <h1>User Registartion Form</h1>");
        out.println("   <p>You have entered the following information</p>");
        out.println("   IC No.: " + icno + "<br>");
        out.println("   First Name: " + firstname + "<br>");
        out.println("   Last Name: " + lastname + "<br>");
        out.println("   Gender: " + gender + "<br>");
        out.println("   Java EE: " + javaee + " PHP: " + php + " ASP: " + asp + "<br>");
        out.println("   </body>");
        out.println("</html>");
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

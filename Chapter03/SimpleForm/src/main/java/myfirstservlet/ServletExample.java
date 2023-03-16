package myfirstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletExample")
public class ServletExample extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("   <head>");
        out.println("       <title>Sevlet Example</title>");
        out.println("   </head>");
        out.println("   <body>");
        out.println("   <p>Simple Servlet Example</p>");

        for(int i = 1; i <= 10; i++) {
            out.println(i + " is an " + isOddOrEven(i) + " number<br>");
        }

        out.println("   </body>");
        out.println("</html>");
    }

    private String isOddOrEven(int number) {
        if(number % 2 == 0)
            return "Even";
        else
            return "Odd";
    }
}

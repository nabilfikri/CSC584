package simpleform;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DateTimeChecker")
public class DateTimeChecker extends HttpServlet {
    
    private String[] allTimeZone;
    
    @Override
    public void init() throws ServletException {
        allTimeZone = TimeZone.getAvailableIDs();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("   <head>");
        out.println("       <title>Date and Time Checker</title>");
        out.println("   </head>");
        out.println("   <body>");
        out.println("       <h1>Date and Time Checker</h1>");
        out.println("       <p>Check date and time based on time zone.</p>");
        out.println("       <form method=\"POST\" action=\"DateTimeChecker\">");
        out.println("           Select Time Zone: <select name=\"time_zone\">");
        out.println("           <option>-</option>");
                            for (int i = 0; i < allTimeZone.length; i++) {
        out.println("           <option value=\"" + allTimeZone[i] + "\">" + allTimeZone[i] + "</option>");
                            }
        out.println("           </select><br><br>");
        out.println("           <input type=submit value=\"Check\">");
        out.println("       </form>");
        out.println("   </body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String timezone = req.getParameter("time_zone");

        java.util.Locale locale = new java.util.Locale("ms", "MY");
        TimeZone timeZone = TimeZone.getTimeZone(timezone);
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, locale);
        Date currentDate = new Date();
        dateFormat.setTimeZone(timeZone);
        String formattedDate = dateFormat.format(currentDate);

        out.println("<p>Selected Time Zone: " + timezone + "</p>");
        out.println("<p>Date and Time: " + formattedDate + "</p>");

         doGet(req, resp);
    }
}
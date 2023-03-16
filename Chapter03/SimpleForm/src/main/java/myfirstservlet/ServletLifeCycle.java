package myfirstservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletLifeCycle")
public class ServletLifeCycle extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("This code is executed in init() method.");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("This code is executed in service() method.");
        System.out.println("Servlet Name: " + getServletName());
    }

    @Override
    public void destroy() {
        System.out.println("This code is executed in destroy() method.");
    }
}
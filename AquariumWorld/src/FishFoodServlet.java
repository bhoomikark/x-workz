package com.xworkz.project.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/fishfood", loadOnStartup = 1)
public class FishFoodServlet extends GenericServlet {

    public FishFoodServlet() {
        System.out.println("Running FishFood Servlet Constructor");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Running FishFoodServlet service");

        String name = req.getParameter("name");
        String brand = req.getParameter("brand");
        String quantity = req.getParameter("quantity");
        String cost = req.getParameter("cost");

        System.out.println("Name: " + name + ", Brand: " + brand + ", Quantity: " + quantity + ", Cost: " + cost);

        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();
        writer.println("<html><body>");
        writer.println("<h1 style='color:green;'>Fish Food Details Registered: " + name + "</h1>");
        writer.println("</body></html>");
    }
}

package com.xworkz.project.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/aquarium", loadOnStartup = 1)
public class AquariumServlet extends GenericServlet {

    public AquariumServlet() {
        System.out.println("Running Aquarium Servlet Constructor");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Running AquariumServlet service");

        String model = req.getParameter("model");
        String cost = req.getParameter("cost");
        String size = req.getParameter("size");
        String company = req.getParameter("company");
        String capacity = req.getParameter("capacity");

        System.out.println("Model: " + model + ", Cost: " + cost + ", Size: " + size + ", Company: " + company + ", Capacity: " + capacity);

        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();
        writer.println("<html><body>");
        writer.println("<h1 style='color:green;'>Aquarium Details Registered: " + model + "</h1>");
        writer.println("</body></html>");
    }
}

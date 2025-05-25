package com.xworkz.project.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/plant", loadOnStartup = 1)
public class PlantServlet extends GenericServlet {

    public PlantServlet() {
        System.out.println("Running Plant Servlet Constructor");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Running PlantServlet service");

        String name = req.getParameter("name");
        String cost = req.getParameter("cost");
        String type = req.getParameter("type");
        String soiltype = req.getParameter("soiltype");

        System.out.println("Name: " + name + ", Cost: " + cost + ", Type: " + type + ", Soil Type: " + soiltype);

        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();
        writer.println("<html><body>");
        writer.println("<h1 style='color:green;'>Plant Details Registered: " + name + "</h1>");
        writer.println("</body></html>");
    }
}

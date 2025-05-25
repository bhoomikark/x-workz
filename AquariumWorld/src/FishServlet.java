package com.xworkz.project.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/fish", loadOnStartup = 1)
public class FishServlet extends GenericServlet {

    public FishServlet() {
        System.out.println("Running Fish Servlet Constructor");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Running FishServlet service");

        String name = req.getParameter("name");
        String color = req.getParameter("color");
        String lifespan = req.getParameter("lifespan");
        String cost = req.getParameter("cost");
        String type = req.getParameter("type");
        String size = req.getParameter("size");

        System.out.println("Name: " + name + ", Color: " + color + ", Life Span: " + lifespan + ", Cost: " + cost + ", Type: " + type + ", Size: " + size);

        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();
        writer.println("<html><body>");
        writer.println("<h1 style='color:green;'>Fish Details Registered: " + name + "</h1>");
        writer.println("</body></html>");
    }
}

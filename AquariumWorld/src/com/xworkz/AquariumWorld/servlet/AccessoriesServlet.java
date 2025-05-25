package com.xworkz.AquariumWorld.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/accessories", loadOnStartup = 1)
public class AccessoriesServlet extends GenericServlet {

    public AccessoriesServlet() {
        System.out.println("Running Accessories Servlet Constructor");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Running AccessoriesServlet service");

        String type = req.getParameter("type");
        String warranty = req.getParameter("warranty");
        String price = req.getParameter("price");
        String quantity = req.getParameter("quantity");

        System.out.println("Type: " + type + ", Warranty: " + warranty + ", Price: " + price + ", Quantity: " + quantity);

        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();
        writer.println("<html><body>");
        writer.println("<h1 style='color:green;'>Accessories Details Registered: " + type + "</h1>");
        writer.println("</body></html>");
    }
}

package com.xworkz.ellora.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/ellora",loadOnStartup = 1)
public class ElloraServlet extends GenericServlet {
    public ElloraServlet()
    {
        System.out.println("Running Ellora Servlet...");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
System.out.println("Running Service Method...");
    }
}

package com.xworkz.ellora.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/caves",loadOnStartup = 2)

public class CavesInfoServlet extends GenericServlet {
    public CavesInfoServlet()
    {
        System.out.println("Running Caves Info Servlet...");

    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running Service Method...");
    }
}

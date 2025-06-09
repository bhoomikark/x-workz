package com.xworkz.weather;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/bhoomika") // Make sure this matches your form's action in weather.jsp
public class WeatherServlet extends HttpServlet {

    public WeatherServlet() {
        System.out.println("Created WeatherServlet using no-arg constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("Inside doPost of WeatherServlet");

        // 1. Fetching form data
        String location = req.getParameter("location");
        String capturedBy = req.getParameter("capturedBy");
        String tempStr = req.getParameter("temp");
        String date = req.getParameter("date");

        // 2. Parse temperature and handle possible errors
        double temp = 0;
        try {
            temp = Double.parseDouble(tempStr);
        } catch (NumberFormatException e) {
            System.out.println("Invalid temperature input: " + tempStr);
        }

        // 3. Creating and populating DTO
        WeatherDTO dto = new WeatherDTO();
        dto.setLocation(location);
        dto.setCapturedBy(capturedBy);
        dto.setTemp(temp);
        dto.setDate(date);

        // 4. Setting DTO to request scope
        req.setAttribute("dto", dto);

        // 5. Forwarding to JSP for result
        req.getRequestDispatcher("WeatherResult.jsp").forward(req, resp);
    }
}

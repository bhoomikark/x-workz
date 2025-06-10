package com.xworkz.general.servlet;
import com.xworkz.general.dto.DrivingDTO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/driving")
public class DrivingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        DrivingDTO dto = new DrivingDTO();
        dto.setName(req.getParameter("name"));
        dto.setAddress(req.getParameter("address"));
        dto.setMobile(req.getParameter("mobile"));
        dto.setDate(req.getParameter("date"));
        dto.setVehicle(req.getParameter("vehicle"));

        resp.getWriter().print("Driving License Application for: " + dto.getName());
    }
}
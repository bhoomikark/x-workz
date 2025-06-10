package com.xworkz.general.servlet;
import com.xworkz.general.dto.PassportDTO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/passport")
public class PassportServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PassportDTO dto = new PassportDTO();
        dto.setName(req.getParameter("name"));
        dto.setAadhar(req.getParameter("aadhar"));
        dto.setAddress(req.getParameter("address"));
        dto.setPan(req.getParameter("pan"));
        dto.setCountry(req.getParameter("country"));
        dto.setState(req.getParameter("state"));
        dto.setCity(req.getParameter("city"));
        dto.setPin(req.getParameter("pin"));
        dto.setType(req.getParameter("type"));
        dto.setPayment(req.getParameter("payment"));

        resp.getWriter().print("Passport Application Received for: " + dto.getName());
    }
}

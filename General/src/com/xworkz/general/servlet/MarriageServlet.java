package com.xworkz.general.servlet;
import com.xworkz.general.dto.MarriageDTO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/marriage")
public class MarriageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        MarriageDTO dto = new MarriageDTO();
        dto.setGroom(req.getParameter("groom"));
        dto.setBride(req.getParameter("bride"));
        dto.setLocation(req.getParameter("location"));
        dto.setAddress(req.getParameter("address"));
        dto.setReligion(req.getParameter("religion"));
        dto.setDate(req.getParameter("date"));
        dto.setW1(req.getParameter("w1"));
        dto.setW2(req.getParameter("w2"));
        dto.setOfficer(req.getParameter("officer"));

        resp.getWriter().print("Marriage Certificate Created for: " + dto.getGroom() + " & " + dto.getBride());
    }
}

package com.xworkz.general.servlet;
import com.xworkz.general.dto.BirthDTO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/birth")
public class BirthServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        BirthDTO dto = new BirthDTO();
        dto.setBirthId(req.getParameter("birthId"));
        dto.setHospitalName(req.getParameter("hospitalName"));
        dto.setFather(req.getParameter("father"));
        dto.setMother(req.getParameter("mother"));
        dto.setDob(req.getParameter("dob"));
        dto.setDoctor(req.getParameter("doctor"));
        dto.setNurse(req.getParameter("nurse"));
        dto.setHospitalType(req.getParameter("hospitalType"));

        resp.getWriter().print("Birth Certificate Created for: " + dto.getFather() + " & " + dto.getMother());
    }
}

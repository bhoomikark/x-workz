package com.xworkz.general.servlet;
import com.xworkz.general.dto.DeathDTO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/death")
public class DeathServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        DeathDTO dto = new DeathDTO();
        dto.setName(req.getParameter("name"));
        dto.setCause(req.getParameter("cause"));
        dto.setDate(req.getParameter("date"));
        dto.setTime(req.getParameter("time"));
        dto.setAge(req.getParameter("age"));
        dto.setCertified(req.getParameter("certified"));
        dto.setHospital(req.getParameter("hospital"));
        dto.setManner(req.getParameter("manner"));
        dto.setGender(req.getParameter("gender"));
        dto.setMarks(req.getParameter("marks"));

        resp.getWriter().print("Death Certificate Created for: " + dto.getName());
    }
}
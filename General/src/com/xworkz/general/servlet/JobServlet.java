package com.xworkz.general.servlet;

import com.xworkz.general.dto.JobDTO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/job")
public class JobServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        JobDTO dto = new JobDTO();
        dto.setName(req.getParameter("name"));
        dto.setEmail(req.getParameter("email"));
        dto.setEducation(req.getParameter("education"));
        dto.setSkills(req.getParameter("skills"));
        dto.setSalary(req.getParameter("salary"));
        dto.setExperience(req.getParameter("experience"));

        resp.getWriter().print("Job Application Submitted for: " + dto.getName());
    }
}

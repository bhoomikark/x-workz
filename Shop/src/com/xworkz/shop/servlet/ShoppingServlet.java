package com.xworkz.shop.servlet;

import com.xworkz.shop.dto.SparDTO;
import com.xworkz.shop.service.SparService;
import com.xworkz.shop.service.SparServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/bhoomika",loadOnStartup = 1)
public class ShoppingServlet extends HttpServlet {
    public ShoppingServlet()
    {
        System.out.println("no arg constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running doPost method of JobServlet");
        String Name=req.getParameter("name");
        String Item_Names=req.getParameter("Itemnames");
        String PhoneNumber=req.getParameter("PhoneNumber");
        String Total_Cost=req.getParameter("TotalCost");
        long ConvertPhoneNo=Long.parseLong(PhoneNumber);



        System.out.println("before setting dto");
SparDTO dto=new SparDTO();
        dto.setName(Name);
        dto.setItemName(Item_Names);
        dto.setConvertPhoneNo(ConvertPhoneNo);
        dto.setTotalCost(Total_Cost);


       SparService sparService=new SparServiceImpl();
       sparService.validateAndSave(dto);
        req.setAttribute("dto", dto);




        RequestDispatcher requestDispatcher = req.getRequestDispatcher("ShoppingResult.jsp");
        requestDispatcher.forward(req, resp);


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running doGet in JobServlet");
        String id=req.getParameter("id");
        int convertedId=Integer.parseInt(id);
        System.out.println("search for convertedId: "+convertedId);
        SparService sparService=new SparServiceImpl();
        SparDTO sparDTO=sparService.findById(convertedId);
        if(sparDTO==null)
        {
            System.out.println("data is not found");
            req.setAttribute("errorMessage","Data not found for Id");

        }
        else {

            System.out.println("data is found");
            req.setAttribute("dto",sparDTO);
        }

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("searchById.jsp");
        requestDispatcher.forward(req, resp);


    }
}

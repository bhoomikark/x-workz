package com.xworkz.shop.repositary;

import com.xworkz.shop.dto.SparDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SparRepoImpl implements SparRepositary {
    @Override
    public String save(SparDTO sparDTO) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/spardb";
            String username="root";
            String password="1234#Bhoomika";
            Connection connection=DriverManager.getConnection(url,username,password);
            String sql="insert into spar values(0,'"+sparDTO.getName()+"','"+sparDTO.getItemName()+"','"+sparDTO.getConvertPhoneNo()+"','"+sparDTO.getTotalCost()+"')";
                    Statement statement=connection.createStatement();
            statement.executeUpdate(sql);
        }
        catch(ClassNotFoundException | SQLException e)
        {
            throw new RuntimeException(e);
        }
        return "false";
    }
}


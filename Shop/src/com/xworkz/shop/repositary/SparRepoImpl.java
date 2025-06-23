package com.xworkz.shop.repositary;

import com.xworkz.shop.dto.SparDTO;

import java.sql.*;

public class SparRepoImpl implements SparRepositary {
    @Override
    public SparDTO findByid(int id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/spardb";
            String username = "root";

            String password = "1234#Bhoomika";
            Connection connection = DriverManager.getConnection(url, username, password);
            String sql = "select * from spar where id=?";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
           preparedStatement.setInt(1,id);
          ResultSet resultSet=  preparedStatement.executeQuery();

          while (resultSet.next())
          {
             int pk= resultSet.getInt("id");
             String name= resultSet.getString("person_name");
             String item=resultSet.getString("itemName");
             long phoneNumber=resultSet.getLong("phoneNumber");
             String cost=resultSet.getString("cost");

             SparDTO dto=new SparDTO();
             dto.setName(name);
             dto.setTotalCost(cost);
             dto.setConvertPhoneNo(phoneNumber);
             dto.setItemName(item);
              System.out.println("DTO from DB :"+dto);
             return  dto;

          }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);

        }
return  null;
    }
    @Override
    public String save(SparDTO sparDTO) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/spardb";
            String username = "root";

            String password = "1234#Bhoomika";
            Connection connection = DriverManager.getConnection(url, username, password);
            //String sql="insert into spar values(0,'"+sparDTO.getName()+"','"+sparDTO.getItemName()+"','"+sparDTO.getConvertPhoneNo()+"','"+sparDTO.getTotalCost()+"')";
            // Statement statement=connection.createStatement();
            //statement.executeUpdate(sql);

            String noConcatsql = "insert into spar values(?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(noConcatsql);
            preparedStatement.setInt(1, 0);
            preparedStatement.setString(2, sparDTO.getName());
            preparedStatement.setString(3, sparDTO.getItemName());
            preparedStatement.setLong(4, sparDTO.getConvertPhoneNo());
            preparedStatement.setString(5, sparDTO.getTotalCost());
            preparedStatement.executeUpdate();
            System.out.println();

        }
        catch(ClassNotFoundException | SQLException e)
        {
            throw new RuntimeException(e);
        }
        return "false";
    }
}


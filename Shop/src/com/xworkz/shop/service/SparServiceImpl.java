package com.xworkz.shop.service;

import com.xworkz.shop.dto.SparDTO;
import com.xworkz.shop.repositary.SparRepoImpl;
import com.xworkz.shop.repositary.SparRepositary;

public class SparServiceImpl implements  SparService {
    @Override
    public String validateAndSave(SparDTO sparDTO) {
        System.out.println("running validateAndSave in Service.." + sparDTO);
        if (sparDTO != null) {
            System.out.println("dto is valid..");
            //invoke repo
            String name = sparDTO.getName();
            if (name != null && name.length() > 4 && name.length() < 30) {
                System.out.println("name is valid");
                SparRepositary sparRepositary=new SparRepoImpl();
                sparRepositary.save(sparDTO);
            } else {
                System.out.println("Name is invalid");


            return "please enter valid details";
        }

    }
        return"Details saved successfully";
}
}


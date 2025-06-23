package com.xworkz.shop.service;

import com.xworkz.shop.dto.SparDTO;

public interface SparService {

    String validateAndSave(SparDTO sparDTO);
    default SparDTO findById(int id)
    {
        return null;
    }

}

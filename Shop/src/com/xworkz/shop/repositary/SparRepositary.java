package com.xworkz.shop.repositary;

import com.xworkz.shop.dto.SparDTO;

public interface SparRepositary {
    String save(SparDTO dto);
    default SparDTO findByid(int id)
    {
        return null;
    }

}

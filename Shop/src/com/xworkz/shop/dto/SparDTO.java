package com.xworkz.shop.dto;

import java.io.Serializable;

public class SparDTO implements Serializable {

    private String name;
    private String itemName;
    private long convertPhoneNo;
    private String totalCost;
    public SparDTO()
    {
        System.out.println("Running Spar DTO");
    }

    @Override
    public String toString() {
        return "SparDTO{" +
                "name='" + name + '\'' +
                ", itemName='" + itemName + '\'' +
                ", convertPhoneNo=" + convertPhoneNo +
                ", totalCost='" + totalCost + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public long getConvertPhoneNo() {
        return convertPhoneNo;
    }

    public void setConvertPhoneNo(long convertPhoneNo) {
        this.convertPhoneNo = convertPhoneNo;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }
}

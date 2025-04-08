package com.xworkz.count.country2;

public class Detail {
    String propertyType;
    double value;
    String status;
    String owner;

    public Detail(String propertyType, double value, String status, String owner) {
        this.propertyType = propertyType;
        this.value = value;
        this.status = status;
        this.owner = owner;
    }

    void display() {
        System.out.println("Detail: PropertyType=" + propertyType + ", Value=" + value + ", Status=" + status + ", Owner=" + owner);
    }

}

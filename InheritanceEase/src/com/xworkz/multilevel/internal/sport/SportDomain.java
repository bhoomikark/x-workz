package com.xworkz.multilevel.internal.sport;

public class SportDomain extends Sport {
    public String category = "Outdoor";
    public void type() {
        System.out.println("Category: " + category);
    }
}
package com.xworkz.swiggit.internal;

public class Desert {
    private String desertType;
    private int desertNo;
    private String toppings;

    public Desert(String desertType, int desertNo, String toppings) {
        this.desertType = desertType;
        this.desertNo = desertNo;
        this.toppings = toppings;
        System.out.println("31. Running Desert Constructor");
    }

    @Override
    public String toString() {
        return "Desert Type: " + desertType + ", Desert No: " + desertNo +
                ", Toppings: " + toppings;
    }
}

package com.xworkz.swiggit.internal;

public class Curtains {
    private String curtonType;
    private double curtonPrice;
    private String curtonColor;

    public Curtains(String curtonType, double curtonPrice, String curtonColor) {
        this.curtonType = curtonType;
        this.curtonPrice = curtonPrice;
        this.curtonColor = curtonColor;
        System.out.println("79. Running Curtains Constructor");
    }

    public String toString() {
        return "Type: " + curtonType + ", Price: ₹" + curtonPrice + ", Color: " + curtonColor;
    }
}

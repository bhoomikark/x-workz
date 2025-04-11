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
@Override
    public String toString() {
        return "Type: " + curtonType + ", Price: ₹" + curtonPrice + ", Color: " + curtonColor;
    }
    @Override
    public int hashCode() {
        System.out.println("Default Hashcode: " + super.hashCode());
        return 777;
    }
}

package com.xworkz.swiggit.internal;

public class Headphone {
    private String headphoneBrand;
    private boolean isWireless;
    private double price;

    public Headphone(String headphoneBrand, boolean isWireless, double price) {
        this.headphoneBrand = headphoneBrand;
        this.isWireless = isWireless;
        this.price = price;
        System.out.println("81. Running Headphone Constructor");
    }

    public String toString() {
        return "Brand: " + headphoneBrand + ", Wireless: " + isWireless + ", Price: ₹" + price;
    }
}

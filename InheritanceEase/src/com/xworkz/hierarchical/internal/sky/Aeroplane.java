package com.xworkz.hierarchical.internal.sky;

public class Aeroplane extends Sky {
    public String model = "Boeing 737";
    public void flyHigh() {
        System.out.println("Aeroplane Model: " + model);
    }
}
package com.xworkz.hierarchical.internal.sky;

public class Birds extends Sky {
    public String type = "Sparrow";
    public void fly() {
        System.out.println("Bird: " + type);
    }
}
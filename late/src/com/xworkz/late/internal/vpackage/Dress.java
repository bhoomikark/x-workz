package com.xworkz.late.internal.vpackage;

public class Dress implements Clips {
    public Dress() {
        super();
        System.out.println("No arg constructor of Dress");
    }

    @Override
    public void hold() {
        System.out.println("Overriding Clips - Clips are holding the dress");
    }
}

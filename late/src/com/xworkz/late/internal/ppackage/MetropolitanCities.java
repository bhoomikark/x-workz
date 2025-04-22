package com.xworkz.late.internal.ppackage;

public class MetropolitanCities implements Metro {
    public MetropolitanCities() {
        super();
        System.out.println("No arg constructor of MetropolitanCities");
    }

    @Override
    public void travel() {
        System.out.println("Overriding Metro - Traveling in metro across city");
    }
}

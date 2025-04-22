package com.xworkz.late.internal.hpackage;

public class Shop implements Rack {
    public Shop() {
        super();
        System.out.println("No arg constructor of Shop");
    }

    @Override
    public void arrange() {
        System.out.println("Overriding Rack - Shop is arranging items on rack");
    }
}

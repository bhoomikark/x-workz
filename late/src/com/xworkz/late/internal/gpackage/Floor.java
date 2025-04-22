package com.xworkz.late.internal.gpackage;

public class Floor implements Tiles {
    public Floor() {
        super();
        System.out.println("No arg constructor of Floor");
    }

    @Override
    public void design() {
        System.out.println("Overriding Tiles - Floor tiles are designed");
    }
}

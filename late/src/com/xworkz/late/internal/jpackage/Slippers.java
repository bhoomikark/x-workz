package com.xworkz.late.internal.jpackage;

public class Slippers implements SlipperStand {
    public Slippers() {
        super();
        System.out.println("No arg constructor of Slippers");
    }

    @Override
    public void hold() {
        System.out.println("Overriding SlipperStand - Slippers placed on stand");
    }
}

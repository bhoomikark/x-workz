package com.xworkz.late.internal.spackage;

public class Support implements Pillars {
    public Support() {
        super();
        System.out.println("No arg constructor of Support");
    }

    @Override
    public void hold() {
        System.out.println("Overriding Pillars - Pillars are supporting the structure");
    }
}

package com.xworkz.late.internal.npackage;

public class Terrace implements Stairs {
    public Terrace() {
        super();
        System.out.println("No arg constructor of Terrace");
    }

    @Override
    public void climb() {
        System.out.println("Overriding Stairs - Terrace stairs are being climbed");
    }
}

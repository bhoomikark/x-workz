package com.xworkz.late.internal.cpackage;

public class Holder implements Nuts {
    public Holder() {
        super();
        System.out.println("No arg constructor of Holder");
    }

    @Override
    public void fix() {
        System.out.println("Overriding Nuts - Holder is fixing the nuts");
    }
}

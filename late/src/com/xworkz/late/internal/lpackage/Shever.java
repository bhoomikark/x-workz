package com.xworkz.late.internal.lpackage;

public class Shever implements Tap {
    public Shever() {
        super();
        System.out.println("No arg constructor of Shever");
    }

    @Override
    public void flow() {
        System.out.println("Overriding Tap - Shever tap is flowing water");
    }
}

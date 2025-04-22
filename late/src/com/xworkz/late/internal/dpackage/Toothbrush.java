package com.xworkz.late.internal.dpackage;

public class Toothbrush implements Toothpaste {
    public Toothbrush() {
        super();
        System.out.println("No arg constructor of Toothbrush");
    }

    @Override
    public void clean() {
        System.out.println("Overriding Toothpaste - brushing with toothbrush");
    }
}

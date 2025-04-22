package com.xworkz.late.internal.opackage;

public class Miniso implements Malls {
    public Miniso() {
        super();
        System.out.println("No arg constructor of Miniso");
    }

    @Override
    public void visit() {
        System.out.println("Overriding Malls - Visiting Miniso for shopping");
    }
}

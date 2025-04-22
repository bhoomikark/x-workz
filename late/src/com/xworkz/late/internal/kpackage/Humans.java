package com.xworkz.late.internal.kpackage;

public class Humans implements Water {
    public Humans() {
        super();
        System.out.println("No arg constructor of Humans");
    }

    @Override
    public void use() {
        System.out.println("Overriding Water - Humans are using water for daily needs");
    }
}

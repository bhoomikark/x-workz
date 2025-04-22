package com.xworkz.late.internal.qpackage;

public class Art implements Pencil {
    public Art() {
        super();
        System.out.println("No arg constructor of Art");
    }

    @Override
    public void draw() {
        System.out.println("Overriding Pencil - Drawing artistic sketches");
    }
}

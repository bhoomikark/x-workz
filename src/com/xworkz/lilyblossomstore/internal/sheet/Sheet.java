package com.xworkz.lilyblossomstore.internal.sheet;

public class Sheet {
    public Sheet() {
        System.out.println("Running Sheet Constructor in Sheet class");
    }

    public void fold() {
        System.out.println("Parent class");
        System.out.println("Folding the sheet.");
    }

    public void tear() {
        System.out.println("Parent class");
        System.out.println("Tearing the sheet.");
    }

    public void writeOn() {
        System.out.println("Parent class");
        System.out.println("Writing on the sheet.");
    }

    public void print() {
        System.out.println("Parent class");
        System.out.println("Printing on the sheet.");
    }

    public void recycle() {
        System.out.println("Parent class");
        System.out.println("Recycling the sheet.");
    }
}

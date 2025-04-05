package com.xworkz.lilyblossomstore.internal.sheet;

public class Paper extends Sheet {
    public Paper() {
        super();
        System.out.println("No-argument constructor of Paper");
    }

    @Override
    public void fold() {
        System.out.println("Child class");
        System.out.println("Folding the paper neatly into halves...");
    }

    @Override
    public void tear() {
        System.out.println("Child class");
        System.out.println("Tearing the paper with precision...");
    }

    @Override
    public void writeOn() {
        System.out.println("Child class");
        System.out.println("Writing notes on the paper...");
    }

    @Override
    public void print() {
        System.out.println("Child class");
        System.out.println("Printing a document on the paper...");
    }

    @Override
    public void recycle() {
        System.out.println("Child class");
        System.out.println("Recycling used paper sheets...");
    }
}

package com.xworkz.lilyblossomstore.internal.pant;

public class Jeans extends Pant {
    public Jeans() {
        super();
        System.out.println("Running Jeans Constructor in Jeans class - Child class");
    }

    @Override
    public void wear() {
        System.out.println("Wearing jeans. - Child class");
    }

    @Override
    public void remove() {
        System.out.println("Removing the jeans. - Child class");
    }

    @Override
    public void wash() {
        System.out.println("Washing the jeans. - Child class");
    }

    @Override
    public void fold() {
        System.out.println("Folding the jeans. - Child class");
    }

    @Override
    public void iron() {
        System.out.println("Ironing the jeans. - Child class");
    }
}

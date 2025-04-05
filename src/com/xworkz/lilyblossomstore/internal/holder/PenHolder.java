package com.xworkz.lilyblossomstore.internal.holder;

public class PenHolder extends Holder {
    public PenHolder() {
        super();

        System.out.println("Running PenHolder Constructor in PenHolder class");
    }

    @Override
    public void hold() {
        System.out.println("Child Class");
        System.out.println("PenHolder is holding pens.");
    }

    @Override
    public void remove() {
        System.out.println("Child Class");
        System.out.println("Removing a pen from the PenHolder.");
    }

    @Override
    public void clean() {
        System.out.println("Child Class");
        System.out.println("Cleaning the PenHolder.");
    }

    @Override
    public void store() {
        System.out.println("Child Class");
        System.out.println("Storing pens in the PenHolder.");
    }

    @Override
    public void organize() {
        System.out.println("Child Class");
        System.out.println("Organizing pens in the PenHolder.");
    }
}

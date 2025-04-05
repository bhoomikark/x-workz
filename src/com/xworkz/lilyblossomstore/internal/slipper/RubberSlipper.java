package com.xworkz.lilyblossomstore.internal.slipper;

public class RubberSlipper extends Slipper {
    public RubberSlipper() {
        super();
        System.out.println("Running RubberSlipper Constructor in RubberSlipper class");
    }

    @Override
    public void wear() {
        System.out.println("Child class");
        System.out.println("Wearing soft rubber slippers for comfort.");
    }

    @Override
    public void remove() {
        System.out.println("Child class");
        System.out.println("Removing rubber slippers before entering the house.");
    }

    @Override
    public void clean() {
        System.out.println("Child class");
        System.out.println("Cleaning rubber slippers with water.");
    }

    @Override
    public void dry() {
        System.out.println("Child class");
        System.out.println("Air drying rubber slippers under the sun.");
    }

    @Override
    public void store() {
        System.out.println("Child class");
        System.out.println("Storing rubber slippers in the shoe rack.");
    }
}

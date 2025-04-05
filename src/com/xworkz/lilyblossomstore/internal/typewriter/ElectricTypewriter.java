package com.xworkz.lilyblossomstore.internal.typewriter;

public class ElectricTypewriter extends Typewriter {
    public ElectricTypewriter() {
        super();
        System.out.println("Running ElectricTypewriter Constructor in ElectricTypewriter class");
    }

    @Override
    public void type() {
        System.out.println("Child class");
        System.out.println("Typing automatically with the electric typewriter.");
    }

    @Override
    public void insertPaper() {
        System.out.println("Child class");
        System.out.println("Automatically inserting paper in electric typewriter.");
    }

    @Override
    public void removePaper() {
        System.out.println("Child class");
        System.out.println("Ejecting paper from the electric typewriter.");
    }

    @Override
    public void changeRibbon() {
        System.out.println("Child class");
        System.out.println("Changing ribbon in the electric typewriter.");
    }

    @Override
    public void adjustMargin() {
        System.out.println("Child class");
        System.out.println("Adjusting margin using electronic control.");
    }
}

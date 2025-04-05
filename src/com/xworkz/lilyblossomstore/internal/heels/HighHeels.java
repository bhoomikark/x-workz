package com.xworkz.lilyblossomstore.internal.heels;

public class HighHeels extends Heels {
    public HighHeels() {
        super();
        System.out.println("Child Class");
        System.out.println("Running HighHeels Constructor in HighHeels class");
    }

    @Override
    public void wear() {
        System.out.println("Child Class");
        System.out.println("Wearing high heels for a stylish look.");
    }

    @Override
    public void remove() {
        System.out.println("Child Class");
        System.out.println("Removing high heels carefully.");
    }

    @Override
    public void clean() {
        System.out.println("Child Class");
        System.out.println("Cleaning the high heels with a soft cloth.");
    }

    @Override
    public void adjustStrap() {
        System.out.println("Child Class");
        System.out.println("Adjusting the strap of high heels for a better fit.");
    }

    @Override
    public void walk() {
        System.out.println("Child Class");
        System.out.println("Walking confidently in high heels.");
    }
}

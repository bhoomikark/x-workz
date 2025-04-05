package com.xworkz.lilyblossomstore.internal.typewriter;

public class Typewriter {
    public Typewriter() {
        System.out.println("Running Typewriter Constructor in Typewriter class");
    }

    public void type() {
        System.out.println("Parent class");
        System.out.println("Typing on the typewriter.");
    }

    public void insertPaper() {
        System.out.println("Parent class");
        System.out.println("Inserting paper into the typewriter.");
    }

    public void removePaper() {
        System.out.println("Parent class");
        System.out.println("Removing paper from the typewriter.");
    }

    public void changeRibbon() {
        System.out.println("Parent class");
        System.out.println("Changing the typewriter ribbon.");
    }

    public void adjustMargin() {
        System.out.println("Parent class");
        System.out.println("Adjusting margins on the typewriter.");
    }
}

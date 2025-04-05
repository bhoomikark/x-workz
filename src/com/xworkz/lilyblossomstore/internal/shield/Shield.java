package com.xworkz.lilyblossomstore.internal.shield;

public class Shield {
    public Shield() {
        System.out.println("Running Shield Constructor in Shield class");
    }

    public void block() {
        System.out.println("Parent class");
        System.out.println("Blocking an attack.");
    }

    public void reflect() {
        System.out.println("Parent class");
        System.out.println("Reflecting a hit.");
    }

    public void absorbImpact() {
        System.out.println("Parent class");
        System.out.println("Absorbing impact.");
    }

    public void repair() {
        System.out.println("Parent class");
        System.out.println("Repairing the shield.");
    }

    public void enhance() {
        System.out.println("Parent class");
        System.out.println("Enhancing shield strength.");
    }
}

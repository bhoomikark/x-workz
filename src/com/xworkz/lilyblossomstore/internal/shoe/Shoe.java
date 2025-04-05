package com.xworkz.lilyblossomstore.internal.shoe;

public class Shoe {
    public Shoe() {
        System.out.println("Running Shoe Constructor in Shoe class");
    }

    public void wear() {
        System.out.println("Parent class");
        System.out.println("Shoes are worn on feet.");
    }

    public void remove() {
        System.out.println("Parent class");
        System.out.println("Shoes are removed after use.");
    }

    public void clean() {
        System.out.println("Parent class");
        System.out.println("Shoes need cleaning.");
    }

    public void polish() {
        System.out.println("Parent class");
        System.out.println("Shoes are polished for a shiny look.");
    }

    public void repair() {
        System.out.println("Parent class");
        System.out.println("Shoes are repaired if damaged.");
    }
}

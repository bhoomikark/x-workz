package com.xworkz.lilyblossomstore.internal.tshirt;

public class TShirt {
    public TShirt() {
        System.out.println("Running TShirt Constructor in TShirt class");
    }

    public void wear() {
        System.out.println("Parent class");
        System.out.println("TShirt is worn.");
    }

    public void remove() {
        System.out.println("Parent class");
        System.out.println("TShirt is removed.");
    }

    public void wash() {
        System.out.println("Parent class");
        System.out.println("TShirt is being washed.");
    }

    public void iron() {
        System.out.println("Parent class");
        System.out.println("TShirt is being ironed.");
    }

    public void fold() {
        System.out.println("Parent class");
        System.out.println("TShirt is being folded.");
    }
}

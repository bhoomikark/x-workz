package com.xworkz.lilyblossomstore.internal.potion;

public class Potion {
    public Potion() {
        System.out.println("Brewing a magical potion...");
    }

    public void taste() {
        System.out.println("Parent class");
        System.out.println("Potion has a unique taste...");
    }

    public void effect() {
        System.out.println("Parent class");
        System.out.println("Potion grants different effects...");
    }

    public void duration() {
        System.out.println("Parent class");
        System.out.println("Effects wear off in time...");
    }

    public void ingredients() {
        System.out.println("Parent class");
        System.out.println("Made with herbs and magic...");
    }
}

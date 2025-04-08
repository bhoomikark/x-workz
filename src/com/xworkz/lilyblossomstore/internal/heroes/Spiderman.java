package com.xworkz.lilyblossomstore.internal.heroes;

public class Spiderman extends SuperHero {
    public Spiderman() {
        super();
        System.out.println("Child Class");
        System.out.println("Spiderman uses web-slinging and agility...");
    }

    @Override
    public void fightCrime() {
        System.out.println("Child Class");
        System.out.println("Spiderman is fighting crime in New York...");
    }

    @Override
    public void usePowers() {
        System.out.println("Child Class");
        System.out.println("Spiderman uses web-shooters and spider sense...");
    }

    @Override
    public void rescuePeople() {
        System.out.println("Child Class");
        System.out.println("Spiderman is rescuing people from tall buildings...");
    }

    @Override
    public void wearSuit() {
        System.out.println("Child Class");
        System.out.println("Spiderman is wearing the red and blue suit...");
    }

    @Override
    public void getAlias() {
        System.out.println("Child Class");
        System.out.println("Spiderman's alias is Peter Parker...");
    }
    public void swingWeb() {
        System.out.println("Spiderman swings his web to traverse buildings.");
    }
}

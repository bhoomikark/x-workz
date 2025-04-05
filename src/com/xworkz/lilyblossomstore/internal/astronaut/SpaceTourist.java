package com.xworkz.lilyblossomstore.internal.astronaut;

public class SpaceTourist extends Astronaut {
    public SpaceTourist() {
        super();
        System.out.println("Child Class");
        System.out.println("Space tourists travel for fun...");
    }

    @Override
    public void train() {
        System.out.println("Child Class");
        System.out.println("Tourists undergo minimal training...");
    }

    @Override
    public void suitUp() {
        System.out.println("Child Class");
        System.out.println("Tourists wear custom spacesuits...");
    }

    @Override
    public void eatSpaceFood() {
        System.out.println("Child Class");
        System.out.println("Tourists try out space food...");
    }

    @Override
    public void communicate() {
        System.out.println("Child Class");
        System.out.println("Tourists communicate with crew...");
    }
}

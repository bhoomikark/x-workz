package com.xworkz.lilyblossomstore.internal.forest;

public class ParrotBreed {
    public void type(Bird bird) {
        System.out.println("\nInside ParrotBreed class - Inspecting bird details...");

        bird.fly();
        bird.sing();
        bird.eat();
        bird.buildNest();
        bird.migrate();

        if (bird instanceof Parrot) {
            System.out.println("Casting Bird to Parrot to access mimicSound method...");
            Parrot parrot = (Parrot) bird;
            parrot.mimicSound();
        }
    }
}

package com.xworkz.lilyblossomstore.internal.animal;

public class Dog extends Animal {
    public Dog() {
        super();
        System.out.println("No-argument constructor of Dog");
    }

    @Override
    public void eat() {
        System.out.println("Child Class");
        System.out.println("Dog eats bones and meat.");
    }

    @Override
    public void sleep() {
        System.out.println("Child Class");
        System.out.println("Dog is sleeping.");
    }

    @Override
    public void makeSound() {
        System.out.println("Child Class");
        System.out.println("Dog barks.");
    }

    @Override
    public void move() {
        System.out.println("Child Class");
        System.out.println("Dog is running.");
    }

    @Override
    public void hunt() {
        System.out.println("Child Class");
        System.out.println("Dog is hunting small animals.");
    }
}

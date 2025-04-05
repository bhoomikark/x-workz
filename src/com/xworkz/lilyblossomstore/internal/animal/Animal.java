package com.xworkz.lilyblossomstore.internal.animal;

public class Animal {
    public Animal() {
        System.out.println("Running Animal Constructor in Animal class");
    }

    public void eat() {
        System.out.println("Parent Class");
        System.out.println("Animals eat food.");
    }

    public void sleep() {
        System.out.println("Parent Class");
        System.out.println("Animals sleep.");
    }

    public void makeSound() {
        System.out.println("Parent Class");
        System.out.println("Animals make different sounds.");
    }

    public void move() {
        System.out.println("Parent Class");
        System.out.println("Animal is moving.");
    }

    public void hunt() {
        System.out.println("Parent Class");
        System.out.println("Animal is hunting for food.");
    }
}

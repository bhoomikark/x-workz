package com.xworkz.interfaceease.internal.third;

public class Shark implements AquaticAnimal, WildAnimal {
    @Override
    public void swim() {
        System.out.println("Shark is swimming.");
    }

    @Override
    public void dive() {
        System.out.println("Shark is diving deep.");
    }

    @Override
    public void breatheUnderwater() {
        System.out.println("Shark breathes underwater using gills.");
    }

    @Override
    public void hunt() {
        System.out.println("Shark is hunting for fish.");
    }

    @Override
    public void roam() {
        System.out.println("Shark is roaming in the ocean.");
    }

    @Override
    public void makeSound() {
        System.out.println("Shark makes no sound.");
    }
}
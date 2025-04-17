package com.xworkz.interfaceease.internal.fourth;

public class Owl implements FlyingAnimal, NocturnalAnimal {
    @Override
    public void fly() {
        System.out.println("Owl is flying silently.");
    }

    @Override
    public void land() {
        System.out.println("Owl is landing softly.");
    }

    @Override
    public void makeSound() {
        System.out.println("Owl hoots.");
    }

    @Override
    public void huntAtNight() {
        System.out.println("Owl is hunting at night.");
    }

    @Override
    public void sleepDuringDay() {
        System.out.println("Owl is sleeping during the day.");
    }
}
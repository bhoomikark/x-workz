package com.xworkz.interfaceease.internal.fourth;

public class Bat implements FlyingAnimal, NocturnalAnimal {
    @Override
    public void fly() {
        System.out.println("Bat is flying around in the dark.");
    }

    @Override
    public void land() {
        System.out.println("Bat is hanging upside down.");
    }

    @Override
    public void makeSound() {
        System.out.println("Bat makes a high-pitched sound.");
    }

    @Override
    public void huntAtNight() {
        System.out.println("Bat is hunting insects at night.");
    }

    @Override
    public void sleepDuringDay() {
        System.out.println("Bat is sleeping during the day.");
    }
}
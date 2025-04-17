package com.xworkz.interfaceease.internal.fourth;

public class Eagle implements FlyingAnimal {
    @Override
    public void fly() {
        System.out.println("Eagle is soaring high in the sky.");
    }

    @Override
    public void land() {
        System.out.println("Eagle is landing gracefully.");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle screeches.");
    }
}
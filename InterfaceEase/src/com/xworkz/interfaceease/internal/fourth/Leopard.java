package com.xworkz.interfaceease.internal.fourth;

public class Leopard implements NocturnalAnimal{
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

package com.xworkz.interfaceease.internal.fourth;

public interface NocturnalAnimal {
    void huntAtNight();
    void sleepDuringDay();
    void makeSound();
    default void attack()
    {
        System.out.println("attack");
    }
}
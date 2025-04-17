package com.xworkz.interfaceease.internal.fourth;

public interface FlyingAnimal {
    void fly();
    void land();
    void makeSound();
    default void sleepingHours()
    {
        System.out.println("sleeping hours");
    }
}
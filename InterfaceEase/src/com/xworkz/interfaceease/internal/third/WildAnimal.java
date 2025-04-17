package com.xworkz.interfaceease.internal.third;

public interface WildAnimal {
    void hunt();
    void roam();
    void makeSound();
    default void eatOtherAnimal()
    {
        System.out.println("eat other animal");
    }
}
package com.xworkz.interfaceease.internal.third;

public interface AquaticAnimal {
    void swim();
    void dive();
    void breatheUnderwater();
    default void makesound()
    {
        System.out.println("make sound -- default");
    }
}
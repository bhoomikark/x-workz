package com.xworkz.interfaceease.internal.third;

public class Fish implements AquaticAnimal{
    @Override
    public void swim() {
        System.out.println("Fish is swimming gracefully.");
    }

    @Override
    public void dive() {
        System.out.println("Fish is diving to catch fish.");
    }

    @Override
    public void breatheUnderwater() {
        System.out.println("Fish holds its breath while diving.");
    }

}

package com.xworkz.interfaceease.internal.third;

public class Fish implements AquaticAnimal{
    @Override
    public void swim() {
        System.out.println("Dolphin is swimming gracefully.");
    }

    @Override
    public void dive() {
        System.out.println("Dolphin is diving to catch fish.");
    }

    @Override
    public void breatheUnderwater() {
        System.out.println("Dolphin holds its breath while diving.");
    }

}

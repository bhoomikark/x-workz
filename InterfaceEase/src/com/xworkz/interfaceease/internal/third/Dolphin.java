package com.xworkz.interfaceease.internal.third;

public class Dolphin implements AquaticAnimal, WildAnimal {
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

    @Override
    public void hunt() {
        System.out.println("Dolphin is hunting for small fish.");
    }

    @Override
    public void roam() {
        System.out.println("Dolphin is roaming in the ocean.");
    }

    @Override
    public void makeSound() {
        System.out.println("Dolphin clicks and whistles.");
    }
}
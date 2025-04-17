package com.xworkz.interfaceease.internal.third;

public class Lion implements WildAnimal {
    @Override
    public void hunt() {
        System.out.println("Lion is hunting.");
    }

    @Override
    public void roam() {
        System.out.println("Lion is roaming in the savannah.");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion roars.");
    }
@Override
    public void eatOtherAnimal()
    {
        System.out.println("eat other animal -- Lion");
    }
}
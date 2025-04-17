package com.xworkz.interfaceease.internal.second;

public class Dog implements DomesticAnimal{
    @Override
    public void eat() {
        System.out.println("Running Eat");
    }

    @Override
    public void sleep() {
        System.out.println("Running Sleep");
    }

    @Override
    public void wake() {
        System.out.println("Running wake");
    }
@Override
    public void pee()
    {
        System.out.println("pee -- default--Dog");
    }
}

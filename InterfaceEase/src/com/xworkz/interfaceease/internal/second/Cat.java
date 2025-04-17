package com.xworkz.interfaceease.internal.second;

public class Cat implements DomesticAnimal,Mammal{
    @Override
    public void eat() {
        System.out.println("eat method from Domestic Animal -- Cat Class");
    }

    @Override
    public void sleep() {
        System.out.println("sleep method from Domestic Animal -- Cat Class");
    }

    @Override
    public void wake() {
        System.out.println("wake method from Domestic Animal -- Cat Class");
    }

    @Override
    public void giveBirth() {
        System.out.println("giveBirth method from Mammal -- Cat Class");
    }

    @Override
    public void groom() {
        System.out.println("groom method from Mammal -- Cat Class");
    }

    @Override
    public void feedYoung() {
        System.out.println("feed Young method from Mammal -- Cat Class");
    }
}

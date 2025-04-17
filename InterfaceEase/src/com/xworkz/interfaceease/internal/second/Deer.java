package com.xworkz.interfaceease.internal.second;

public class Deer implements Mammal{
    @Override
    public void giveBirth() {
        System.out.println("giveBirth method from Mammal -- deer Class");
    }

    @Override
    public void groom() {
        System.out.println("groom method from Mammal -- deer Class");
    }

    @Override
    public void feedYoung() {
        System.out.println("feed Young method from Mammal -- deer Class");
    }
}

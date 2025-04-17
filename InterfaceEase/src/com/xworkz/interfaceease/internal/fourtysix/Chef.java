package com.xworkz.interfaceease.internal.fourtysix;

public class Chef implements Cook {
    @Override
    public void prepare() {
        System.out.println("Ingredients prepared.");
    }
    @Override
    public void cook() {
        System.out.println("Cooking started.");
    }
    @Override
    public void serve() {
        System.out.println("Dish served.");
    }
}


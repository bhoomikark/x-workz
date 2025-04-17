package com.xworkz.interfaceease.internal.sixth;

public class Bicycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bicycle is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle is stopping.");
    }

    @Override
    public void honk() {
        System.out.println("Bicycle bell rings.");
    }
@Override
    public void applyBrake()
    {
        System.out.println("apply brake -- Bicycle");
    }
}
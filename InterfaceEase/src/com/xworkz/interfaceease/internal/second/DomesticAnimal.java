package com.xworkz.interfaceease.internal.second;

public interface DomesticAnimal {
    abstract void  eat();
    abstract void  sleep();
    abstract void wake();
    default void pee()
    {
        System.out.println("pee -- default");
    }
}

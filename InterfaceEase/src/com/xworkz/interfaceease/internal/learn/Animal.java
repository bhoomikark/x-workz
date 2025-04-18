package com.xworkz.interfaceease.internal.learn;

public class Animal implements Food{
    public void eat()
    {
        System.out.println("eat");
    }

    @Override
    public void recipe() {
        System.out.println("jfnk");
    }
}

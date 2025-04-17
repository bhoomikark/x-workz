package com.xworkz.interfaceease.internal.fourtythree;

public class Smartphone implements Mobile {
    @Override
    public void call() {
        System.out.println("Making a call.");
    }
    @Override
    public void message() {
        System.out.println("Sending a message.");
    }
    @Override
    public void browse() {
        System.out.println("Browsing internet.");
    }
@Override
    public void makeNotes()
    {
        System.out.println("make notes -- smartphone -- default");
    }
}

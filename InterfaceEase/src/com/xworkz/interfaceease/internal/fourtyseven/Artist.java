package com.xworkz.interfaceease.internal.fourtyseven;

public class Artist implements Painter {
    @Override
    public void sketch() {
        System.out.println("Sketching outline.");
    }
    @Override
    public void paint() {
        System.out.println("Painting with colors.");
    }
    @Override
    public void display() {
        System.out.println("Displaying artwork.");
    }
}

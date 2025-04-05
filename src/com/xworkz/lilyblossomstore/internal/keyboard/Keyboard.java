package com.xworkz.lilyblossomstore.internal.keyboard;

public class Keyboard {
    public Keyboard() {

        System.out.println("Running Keyboard Constructor in Keyboard class");
    }

    public void type() {
        System.out.println("Parent Class");
        System.out.println("Keyboard is used for typing.");
    }

    public void connect() {
        System.out.println("Parent Class");
        System.out.println("Keyboard connects to a computer.");
    }

    public void pressKey() {
        System.out.println("Parent Class");
        System.out.println("Keys are pressed to input text.");
    }

    public void backlight() {
        System.out.println("Parent Class");
        System.out.println("Some keyboards have backlighting.");
    }

    public void detach() {
        System.out.println("Parent Class");
        System.out.println("Wireless keyboards can be detached.");
    }
}

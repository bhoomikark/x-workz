package com.xworkz.lilyblossomstore.internal.window;

public class Window {
    public Window() {
        System.out.println("Running Window Constructor in Window class");
    }

    public void open() {
        System.out.println("Parent class");
        System.out.println("Opening the window.");
    }

    public void close() {
        System.out.println("Parent class");
        System.out.println("Closing the window.");
    }

    public void clean() {
        System.out.println("Parent class");
        System.out.println("Cleaning the window.");
    }

    public void lock() {
        System.out.println("Parent class");
        System.out.println("Locking the window.");
    }

    public void unlock() {
        System.out.println("Parent class");
        System.out.println("Unlocking the window.");
    }
}

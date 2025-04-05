package com.xworkz.lilyblossomstore.internal.window;

public class GlassWindow extends Window {
    public GlassWindow() {
        super();
        System.out.println("No-argument constructor of GlassWindow");
    }

    @Override
    public void open() {
        System.out.println("Child class");
        System.out.println("Opening the glass window carefully.");
    }

    @Override
    public void close() {
        System.out.println("Child class");
        System.out.println("Closing the glass window softly.");
    }

    @Override
    public void clean() {
        System.out.println("Child class");
        System.out.println("Cleaning the glass with a special solution.");
    }

    @Override
    public void lock() {
        System.out.println("Child class");
        System.out.println("Locking the glass window securely.");
    }

    @Override
    public void unlock() {
        System.out.println("Child class");
        System.out.println("Unlocking the glass window.");
    }
}

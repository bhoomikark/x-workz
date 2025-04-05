package com.xworkz.lilyblossomstore.internal.store;

public class DigitalLibrary extends Library {
    public DigitalLibrary() {
        super();
        System.out.println("A digital library contains e-books...");
    }

    @Override
    public void addBook() {
        System.out.println("Child class");
        System.out.println("Adding an e-book to the digital library...");
    }

    @Override
    public void issueBook() {
        System.out.println("Child class");
        System.out.println("Issuing an e-book instantly...");
    }

    @Override
    public void returnBook() {
        System.out.println("Child class");
        System.out.println("E-book automatically returned after due date...");
    }

    @Override
    public void catalog() {
        System.out.println("Child class");
        System.out.println("Catalog updated with digital resources...");
    }

    @Override
    public void membership() {
        System.out.println("Child class");
        System.out.println("Managing digital library membership online...");
    }
}

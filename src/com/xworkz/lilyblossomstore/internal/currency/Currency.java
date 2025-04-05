package com.xworkz.lilyblossomstore.internal.currency;

public class Currency {
    public Currency() {

        System.out.println("Currency is the medium of exchange...");
    }

    public void value() {
        System.out.println("Parent Class");
        System.out.println("Each currency has a different value...");
    }

    public void exchange() {
        System.out.println("Parent Class");
        System.out.println("Currency can be exchanged...");
    }

    public void store() {
        System.out.println("Parent Class");
        System.out.println("Currency is stored in banks...");
    }

    public void regulation() {
        System.out.println("Parent Class");
        System.out.println("Governments regulate currency...");
    }
}

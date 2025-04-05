package com.xworkz.lilyblossomstore.internal.currency;

public class Cryptocurrency extends Currency {
    public Cryptocurrency() {
        super();

        System.out.println("Cryptocurrency is decentralized...");
    }

    @Override
    public void value() {
        System.out.println("Child Class");
        System.out.println("Cryptocurrency has a volatile market value...");
    }

    @Override
    public void exchange() {
        System.out.println("Child Class");
        System.out.println("Cryptocurrency can be exchanged online...");
    }

    @Override
    public void store() {
        System.out.println("Child Class");
        System.out.println("Cryptocurrency is stored in digital wallets...");
    }

    @Override
    public void regulation() {
        System.out.println("Child Class");
        System.out.println("Cryptocurrency has limited government regulation...");
    }
}

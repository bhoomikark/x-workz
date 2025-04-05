package com.xworkz.lilyblossomstore.internal.bank;

public class OnlineBank extends Bank {

    public OnlineBank() {
        super();
        System.out.println("Child Class");
        System.out.println("Running OnlineBank Constructor");
    }

    @Override
    public void openAccount() {
        System.out.println("Child Class");
        System.out.println("Opening an online bank account...");
    }

    @Override
    public void closeAccount() {
        System.out.println("Child Class");
        System.out.println("Closing an online bank account...");
    }

    @Override
    public void depositMoney() {
        System.out.println("Child Class");
        System.out.println("Depositing money through online banking...");
    }

    @Override
    public void withdrawMoney() {
        System.out.println("Child Class");
        System.out.println("Withdrawing money using an online portal...");
    }

    @Override
    public void transferMoney() {
        System.out.println("Child Class");
        System.out.println("Transferring money via net banking...");
    }

    public void checkMobileAppAccess() {
        System.out.println("Child Class");
        System.out.println("Accessing online bank through mobile app...");
    }
}

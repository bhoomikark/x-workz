package com.xworkz.lilyblossomstore.internal.bank;

public class Bank {

    public Bank() {
        System.out.println("Parent Class");
        System.out.println("Running Bank Constructor");
    }

    public void openAccount() {
        System.out.println("Parent Class");
        System.out.println("Opening a bank account...");
    }

    public void closeAccount() {
        System.out.println("Parent Class");
        System.out.println("Closing a bank account...");
    }

    public void depositMoney() {
        System.out.println("Parent Class");
        System.out.println("Depositing money...");
    }

    public void withdrawMoney() {
        System.out.println("Parent Class");
        System.out.println("Withdrawing money...");
    }

    public void transferMoney() {
        System.out.println("Parent Class");
        System.out.println("Transferring money...");
    }
}

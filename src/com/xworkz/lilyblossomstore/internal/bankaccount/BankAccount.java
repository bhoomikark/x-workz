package com.xworkz.lilyblossomstore.internal.bankaccount;

public class BankAccount {

    public BankAccount() {
        System.out.println("Parent Class");
        System.out.println("Running BankAccount Constructor");
    }

    public void deposit() {
        System.out.println("Parent Class");
        System.out.println("Depositing money...");
    }

    public void withdraw() {
        System.out.println("Parent Class");
        System.out.println("Withdrawing money...");
    }

    public void checkBalance() {
        System.out.println("Parent Class");
        System.out.println("Checking account balance...");
    }

    public void generateStatement() {
        System.out.println("Parent Class");
        System.out.println("Generating account statement...");
    }

    public void applyLoan() {
        System.out.println("Parent Class");
        System.out.println("Applying for a loan...");
    }
}

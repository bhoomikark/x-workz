package com.xworkz.lilyblossomstore.internal.bankaccount;

public class SavingsAccount extends BankAccount {

    public SavingsAccount() {
        super();
        System.out.println("Child Class");
        System.out.println("Creating a Savings Account object...");
    }

    @Override
    public void deposit() {
        System.out.println("Child Class");
        System.out.println("Depositing into savings account...");
    }

    @Override
    public void withdraw() {
        System.out.println("Child Class");
        System.out.println("Withdrawing from savings account...");
    }

    @Override
    public void checkBalance() {
        System.out.println("Child Class");
        System.out.println("Checking balance of savings account...");
    }

    @Override
    public void generateStatement() {
        System.out.println("Child Class");
        System.out.println("Generating statement for savings account...");
    }

    @Override
    public void applyLoan() {
        System.out.println("Child Class");
        System.out.println("Applying for loan using savings account...");
    }
    public void generateAccount()
    {
        System.out.println("Child Class");
        System.out.println("generate account");
    }
}

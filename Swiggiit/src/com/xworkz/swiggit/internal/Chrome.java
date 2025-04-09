package com.xworkz.swiggit.internal;

public class Chrome {
    private String availableAccounts;
    private String accountName;
    private int numberOfAccounts;

    public Chrome(String availableAccounts, String accountName, int numberOfAccounts) {
        this.availableAccounts = availableAccounts;
        this.accountName = accountName;
        this.numberOfAccounts = numberOfAccounts;
        System.out.println("17. Running Chrome Constructor");
    }

    @Override
    public String toString() {
        return "Available Accounts: " + availableAccounts + ", Account Name: " + accountName +
                ", Number of Accounts: " + numberOfAccounts;
    }
}

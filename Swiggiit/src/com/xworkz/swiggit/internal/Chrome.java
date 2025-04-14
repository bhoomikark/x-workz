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
    @Override
    public int hashCode() {
        System.out.println("Default Hashcode: " + super.hashCode());
        return 333;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof Chrome) {
                System.out.println("Chrome is reference of object");
                Chrome chrome1 = this;
                Chrome chrome2 = (Chrome) obj;
                if (chrome1.accountName.equals(chrome2.accountName)) {
                    System.out.println("Both Chrome objects have the same account name");
                    return true;
                }
            }
        }
        return false;
    }
}

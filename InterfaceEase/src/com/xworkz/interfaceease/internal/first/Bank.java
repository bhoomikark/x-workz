package com.xworkz.interfaceease.internal.first;

public class Bank implements Funds {
    @Override
    public void countingMoney() {
        System.out.println("Implement from Funds - counting Money - Bank Class");
    }

    @Override
    public void takeLoan() {
        System.out.println("Implement from Funds - take Loan - bank Class");
    }

    @Override
    public void interest() {
        System.out.println("Implement from Funds - take Loan - bank Class");
    }
}

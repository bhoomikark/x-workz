package com.xworkz.interfaceease.internal.first;

public class Students implements Funds,School {
    @Override
    public void Open() {
        System.out.println("Implement from School - Open - Student Class");
    }

    @Override
    public void Close() {
        System.out.println("Implement from School - Close - Student Class");
    }

    @Override
    public void Work() {
        System.out.println("Implement from School - Work - Student Class");
    }

    @Override
    public void countingMoney() {
        System.out.println("Implement from Funds - counting Money - Student Class");
    }

    @Override
    public void takeLoan() {
        System.out.println("Implement from Funds - take Loan - Student Class");
    }

    @Override
    public void interest() {
        System.out.println("Implement from Funds - interest - Student Class");
    }
}

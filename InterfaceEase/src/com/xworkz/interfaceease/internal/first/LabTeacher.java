package com.xworkz.interfaceease.internal.first;

public class LabTeacher implements Funds,School {
    @Override
    public void Open() {
        System.out.println("Implement from School - Open - Lab Teacher Class");
    }

    @Override
    public void Close() {
        System.out.println("Implement from School - Close - Lab Teacher Class");
    }

    @Override
    public void Work() {
        System.out.println("Implement from School - Work - Lab Teacher Class");
    }

    @Override
    public void countingMoney() {
        System.out.println("Implement from Funds - counting Money - Lab Teacher Class");
    }

    @Override
    public void takeLoan() {
        System.out.println("Implement from Funds - take Loan - Lab Teacher Class");
    }

    @Override
    public void interest() {
        System.out.println("Implement from Funds - interest - Lab Teacher Class");
    }
}

package com.xworkz.interfaceease.internal.nineteen;

public class SBI implements Bank {
    @Override
    public void openAccount() {

        System.out.println("SBI account opened.");
    }
    @Override
    public void depositMoney() {
        System.out.println("Money deposited in SBI.");
    }
    @Override
    public void closeAccount() {
        System.out.println("SBI account closed.");
    }
}
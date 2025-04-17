package com.xworkz.interfaceease.internal.nineteen;

public interface Bank {
    void openAccount();
    void depositMoney();
    void closeAccount();
    default void withdrawMoney()
    {
        System.out.println("withdraw -- default");
    }
}

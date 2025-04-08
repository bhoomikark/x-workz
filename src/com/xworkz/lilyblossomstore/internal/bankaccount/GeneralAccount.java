package com.xworkz.lilyblossomstore.internal.bankaccount;

public class GeneralAccount {
    public void generateOTP(BankAccount bankAccount)
    {
        System.out.println("Running generate OTP");
        System.out.println("======================");
        bankAccount.generateStatement();
        bankAccount.applyLoan();
        bankAccount.checkBalance();
        bankAccount.deposit();
        bankAccount.withdraw();
        if(bankAccount instanceof SavingsAccount)
        {
            System.out.println("Casting");
            SavingsAccount savingsAccount=(SavingsAccount) bankAccount;
            savingsAccount.generateAccount();
        }
    }
}

package com.xworkz.lilyblossomstore.internal.bank;

public class KaranatakaBank {
    public void PayCash(Bank bank) {
        System.out.println("\nInside KarnatakaBank class");

        bank.openAccount();
        bank.closeAccount();
        bank.depositMoney();
        bank.withdrawMoney();
        bank.transferMoney();

        if (bank instanceof OnlineBank) {
            System.out.println("Casting Bank to OnlineBank to access child-specific method...");
            OnlineBank online = (OnlineBank) bank;
            online.checkBalanceOnline();
        }
    }
}

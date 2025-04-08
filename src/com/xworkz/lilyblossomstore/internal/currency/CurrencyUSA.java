package com.xworkz.lilyblossomstore.internal.currency;

public class CurrencyUSA {
    public void dollars(Currency currency) {
        System.out.println("\nInside CurrencyUSA class handling Currency...");

        currency.value();
        currency.exchange();
        currency.store();
        currency.regulation();

        if (currency instanceof Cryptocurrency) {
            System.out.println("Casting Currency to Cryptocurrency to access blockchainTechnology method...");
            Cryptocurrency crypto = (Cryptocurrency) currency;
            crypto.blockchainTechnology();
        }
    }
}

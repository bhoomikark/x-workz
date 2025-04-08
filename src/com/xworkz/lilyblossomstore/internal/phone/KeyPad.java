package com.xworkz.lilyblossomstore.internal.phone;

public class KeyPad {
    public void dial(Phone phone) {
        System.out.println("\nInside KeyPad class");

        phone.call();
        phone.message();
        phone.charge();
        phone.connectWifi();
        phone.turnOff();

        if (phone instanceof Smartphone) {
            Smartphone smart = (Smartphone) phone;
            smart.useApps();
        }
    }
}

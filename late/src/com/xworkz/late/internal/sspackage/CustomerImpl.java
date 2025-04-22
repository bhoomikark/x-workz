package com.xworkz.late.internal.sspackage;

public class CustomerImpl implements Customer {
    public CustomerImpl() {
        super();
        System.out.println("No-arg constructor of CustomerImpl");
    }

    @Override
    public void buy() {
        System.out.println("Overriding Customer - Buying something");
    }
}

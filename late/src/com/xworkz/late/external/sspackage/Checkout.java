package com.xworkz.late.external.sspackage;

import com.xworkz.late.internal.sspackage.Customer;

public class Checkout {
    Customer customer;

    public Checkout(Customer customer) {
        System.out.println("Parameterized constructor of Checkout");
        this.customer = customer;
    }

    public void process() {
        if (customer != null) {
            customer.buy();
        } else {
            System.out.println("No customer found");
        }
    }
}

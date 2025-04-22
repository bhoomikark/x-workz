package com.xworkz.late.runner;

import com.xworkz.late.internal.sspackage.*;
import com.xworkz.late.external.sspackage.*;

public class CheckoutRunner {
    public static void main(String[] args) {
        Customer customer = new CustomerImpl();
        Checkout checkout = new Checkout(customer);
        checkout.process();
    }
}

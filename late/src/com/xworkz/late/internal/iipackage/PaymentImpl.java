// iipackage - implementation
package com.xworkz.late.internal.iipackage;

public class PaymentImpl implements Payment {
    public PaymentImpl() {
        super();
        System.out.println("No-arg constructor of PaymentImpl");
    }

    @Override
    public void pay() {
        System.out.println("Overriding Payment - Payment done successfully");
    }
}

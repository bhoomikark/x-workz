// iipackage - external
package com.xworkz.late.external.iipackage;

import com.xworkz.late.internal.iipackage.Payment;

public class Shop {
    Payment payment;

    public Shop(Payment payment) {
        System.out.println("Parameterized constructor of Shop");
        this.payment = payment;
    }

    public void checkout() {
        if (payment != null) {
            payment.pay();
        } else {
            System.out.println("Payment not available");
        }
    }
}

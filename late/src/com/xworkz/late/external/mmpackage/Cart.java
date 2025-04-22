// mmpackage - external
package com.xworkz.late.external.mmpackage;

import com.xworkz.late.internal.mmpackage.Order;

public class Cart {
    Order order;

    public Cart(Order order) {
        System.out.println("Parameterized constructor of Cart");
        this.order = order;
    }

    public void checkout() {
        if (order != null) {
            order.place();
        } else {
            System.out.println("Cart is empty");
        }
    }
}

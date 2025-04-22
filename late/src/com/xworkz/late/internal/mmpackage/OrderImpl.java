// mmpackage - implementation
package com.xworkz.late.internal.mmpackage;

public class OrderImpl implements Order {
    public OrderImpl() {
        super();
        System.out.println("No-arg constructor of OrderImpl");
    }

    @Override
    public void place() {
        System.out.println("Overriding Order - Order placed");
    }
}

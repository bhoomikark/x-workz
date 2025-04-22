// Implementation
package com.xworkz.late.internal.rrpackage;

public class ProductImpl implements Product {
    public ProductImpl() {
        super();
        System.out.println("No-arg constructor of ProductImpl");
    }

    @Override
    public void displayProduct() {
        System.out.println("Overriding Product - Displaying product");
    }
}

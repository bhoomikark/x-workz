
package com.xworkz.late.external.rrpackage;

import com.xworkz.late.internal.rrpackage.Product;

public class Inventory {
    Product product;

    public Inventory(Product product) {
        System.out.println("Parameterized constructor of Inventory");
        this.product = product;
    }

    public void manage() {
        if (product != null) {
            product.displayProduct();
        } else {
            System.out.println("No product available");
        }
    }
}

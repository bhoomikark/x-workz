
package com.xworkz.late.runner;

import com.xworkz.late.internal.rrpackage.*;
import com.xworkz.late.external.rrpackage.*;

public class InventoryRunner {
    public static void main(String[] args) {
        Product product = new ProductImpl();
        Inventory inventory = new Inventory(product);
        inventory.manage();
    }
}

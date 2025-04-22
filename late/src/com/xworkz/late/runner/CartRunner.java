
package com.xworkz.late.runner;

import com.xworkz.late.internal.mmpackage.*;
import com.xworkz.late.external.mmpackage.*;

public class CartRunner {
    public static void main(String[] args) {
        Order order = new OrderImpl();
        Cart cart = new Cart(order);
        cart.checkout();
    }
}

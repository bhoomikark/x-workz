package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Basket;

public class BasketRunner {
    public static void main(String[] args) {
        Basket basket = new Basket("Storage", "Plastic", "Green");
        System.out.println(basket);
        System.out.println("Basket HashCode: " + basket.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(basket));
    }
}

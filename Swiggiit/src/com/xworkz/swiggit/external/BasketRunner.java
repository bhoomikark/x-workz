package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Basket;

public class BasketRunner {
    public static void main(String[] args) {
        Basket basket = new Basket("Storage", "Plastic", "Green");
        System.out.println(basket);
        System.out.println("Basket HashCode: " + basket.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(basket));
        Basket basket1 = new Basket("Fruit", "Bamboo", "Brown");
        Basket basket2 = new Basket("Storage", "Metal", "Grey");
        System.out.println("Are at same location or not: " + (basket1 == basket2));
        boolean value = basket2.equals(basket1);
        System.out.println("Are both baskets same? " + value);
    }
}

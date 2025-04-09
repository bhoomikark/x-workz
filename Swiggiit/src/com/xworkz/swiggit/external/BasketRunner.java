package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Basket;

public class BasketRunner {
    public static void main(String[] args) {
        Basket basket = new Basket("Storage", "Plastic", "Green");
        System.out.println(basket);
    }
}

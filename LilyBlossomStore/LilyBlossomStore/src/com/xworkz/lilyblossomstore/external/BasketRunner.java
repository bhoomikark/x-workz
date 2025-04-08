package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.basket.Basket;
import com.xworkz.lilyblossomstore.internal.basket.StorageBasket;

public class BasketRunner {
    public static void main(String[] args) {
        // Parent type reference to child object
        Basket basket = new StorageBasket();
        basket.storeItems();
        basket.carry();
        basket.clean();
        basket.decorate();
        basket.coverWithLid();

        System.out.println("-----------");

        // Child type reference to child object
        StorageBasket storageBasket = new StorageBasket();
        storageBasket.storeItems();
        storageBasket.carry();
        storageBasket.clean();
        storageBasket.decorate();
        storageBasket.coverWithLid();
    }
}

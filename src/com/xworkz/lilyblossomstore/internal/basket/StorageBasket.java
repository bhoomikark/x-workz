package com.xworkz.lilyblossomstore.internal.basket;

public class StorageBasket extends Basket {
    public StorageBasket() {
        super();
        System.out.println("Child Class");
        System.out.println("Running StorageBasket Constructor in StorageBasket class");
    }

    @Override
    public void storeItems() {
        System.out.println("Child Class");
        System.out.println("Storing items in the storage basket.");
    }

    @Override
    public void carry() {
        System.out.println("Child Class");
        System.out.println("Carrying the storage basket.");
    }

    @Override
    public void clean() {
        System.out.println("Child Class");
        System.out.println("Cleaning the storage basket.");
    }

    @Override
    public void decorate() {
        System.out.println("Child Class");
        System.out.println("Decorating the storage basket.");
    }

    @Override
    public void coverWithLid() {
        System.out.println("Child Class");
        System.out.println("Covering the storage basket with a lid.");
    }
}

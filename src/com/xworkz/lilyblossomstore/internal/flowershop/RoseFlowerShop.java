package com.xworkz.lilyblossomstore.internal.flowershop;

public class RoseFlowerShop extends FlowerShop {
    public RoseFlowerShop() {
        super();

        System.out.println("Running RoseFlowerShop Constructor in RoseFlowerShop class");
    }

    @Override
    public void sellFlowers() {
        System.out.println("Child Class");
        System.out.println("Selling only rose flowers in the shop.");
    }

    @Override
    public void arrangeBouquets() {
        System.out.println("Child Class");
        System.out.println("Arranging rose flower bouquets.");
    }

    @Override
    public void provideDelivery() {
        System.out.println("Child Class");
        System.out.println("Providing rose flower delivery service.");
    }

    @Override
    public void takeOrders() {
        System.out.println("Child Class");
        System.out.println("Taking orders only for roses.");
    }

    @Override
    public void decorateShop() {
        System.out.println("Child Class");
        System.out.println("Decorating the shop with roses.");
    }
}

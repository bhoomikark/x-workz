package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.flowershop.FlowerShop;
import com.xworkz.lilyblossomstore.internal.flowershop.RoseFlowerShop;

public class FlowerShopRunner {
    public static void main(String[] args) {
        // Parent type reference to child object
        System.out.println("Parent reference - Parent object");
        FlowerShop flowerShop1 = new FlowerShop();
        flowerShop1.sellFlowers();
        flowerShop1.arrangeBouquets();
        flowerShop1.provideDelivery();
        flowerShop1.takeOrders();
        flowerShop1.decorateShop();

        FlowerShop flowerShop = new RoseFlowerShop();
        flowerShop.sellFlowers();
        flowerShop.arrangeBouquets();
        flowerShop.provideDelivery();
        flowerShop.takeOrders();
        flowerShop.decorateShop();

        System.out.println("-----------");

        // Child type reference to child object
        RoseFlowerShop roseFlowerShop = new RoseFlowerShop();
        roseFlowerShop.sellFlowers();
        roseFlowerShop.arrangeBouquets();
        roseFlowerShop.provideDelivery();
        roseFlowerShop.takeOrders();
        roseFlowerShop.decorateShop();
    }
}

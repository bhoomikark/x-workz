package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.trolleybag.TrolleyBag;
import com.xworkz.lilyblossomstore.internal.trolleybag.TravelTrolleyBag;

public class TrolleyBagRunner {
    public static void main(String[] args) {
        System.out.println("Parent reference - Parent object");
        TrolleyBag trolleyBag1 = new TrolleyBag();
        trolleyBag1.storeItems();
        trolleyBag1.roll();
        trolleyBag1.extendHandle();
        trolleyBag1.lock();
        trolleyBag1.unzip();

        // Parent type reference to child object

        TrolleyBag trolleyBag = new TravelTrolleyBag();
        trolleyBag.storeItems();
        trolleyBag.roll();
        trolleyBag.extendHandle();
        trolleyBag.lock();
        trolleyBag.unzip();

        System.out.println("-----------");

        // Child type reference to child object
        TravelTrolleyBag travelTrolleyBag = new TravelTrolleyBag();
        travelTrolleyBag.storeItems();
        travelTrolleyBag.roll();
        travelTrolleyBag.extendHandle();
        travelTrolleyBag.lock();
        travelTrolleyBag.unzip();
    }
}

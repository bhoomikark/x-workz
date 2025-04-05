package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.trolleybag.TrolleyBag;
import com.xworkz.lilyblossomstore.internal.trolleybag.TravelTrolleyBag;

public class TrolleyBagRunner {
    public static void main(String[] args) {
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

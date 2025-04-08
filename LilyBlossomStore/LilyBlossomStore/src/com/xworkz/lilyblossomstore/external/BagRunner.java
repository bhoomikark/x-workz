package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.bag.Bag;
import com.xworkz.lilyblossomstore.internal.bag.Backpack;

public class BagRunner {
    public static void main(String[] args) {
        Bag bag = new Backpack();
        bag.open();
        bag.close();
        bag.carry();
        bag.storeItems();
        bag.empty();

        System.out.println("-----------");

        Backpack backpack = new Backpack();
        backpack.open();
        backpack.close();
        backpack.carry();
        backpack.storeItems();
        backpack.empty();
    }
}

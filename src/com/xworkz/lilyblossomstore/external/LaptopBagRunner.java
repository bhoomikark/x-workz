package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.laptopbag.LaptopBag;
import com.xworkz.lilyblossomstore.internal.laptopbag.Backpack;

public class LaptopBagRunner {
    public static void main(String[] args) {
        System.out.println("Parent reference - Parent object");
        LaptopBag bag1 = new LaptopBag();
        bag1.open();
        bag1.close();
        bag1.carry();
        bag1.adjustStrap();
        bag1.storeLaptop();

        System.out.println("Using parent type reference:");
        LaptopBag bag = new Backpack();
        bag.open();
        bag.close();
        bag.carry();
        bag.adjustStrap();
        bag.storeLaptop();

        System.out.println("-----------");

        System.out.println("Using child type reference:");
        Backpack backpack = new Backpack();
        backpack.open();
        backpack.close();
        backpack.carry();
        backpack.adjustStrap();
        backpack.storeLaptop();
    }
}

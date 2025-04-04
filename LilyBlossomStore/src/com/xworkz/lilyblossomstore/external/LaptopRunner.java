package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.laptop.Laptop;
import com.xworkz.lilyblossomstore.internal.laptop.GamingLaptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new GamingLaptop();
        laptop.turnOn();
        laptop.turnOff();
        laptop.charge();
        laptop.openSoftware();
        laptop.browseInternet();

        System.out.println("-----------");

        GamingLaptop gamingLaptop = new GamingLaptop();
        gamingLaptop.turnOn();
        gamingLaptop.turnOff();
        gamingLaptop.charge();
        gamingLaptop.openSoftware();
        gamingLaptop.browseInternet();
    }
}

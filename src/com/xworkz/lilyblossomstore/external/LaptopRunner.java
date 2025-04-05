package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.laptop.Laptop;
import com.xworkz.lilyblossomstore.internal.laptop.GamingLaptop;

public class LaptopRunner {
    public static void main(String[] args) {
        System.out.println("Parent reference - Parent object");
        Laptop laptop1 = new Laptop();
        laptop1.turnOn();
        laptop1.turnOff();
        laptop1.charge();
        laptop1.openSoftware();
        laptop1.browseInternet();

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

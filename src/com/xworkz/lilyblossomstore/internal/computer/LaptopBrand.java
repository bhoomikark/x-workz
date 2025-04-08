package com.xworkz.lilyblossomstore.internal.computer;

public class LaptopBrand {
    public void Brand(Computer computer) {
        System.out.println("\nRunning Brand(Computer computer)");
        System.out.println("==================================");
        computer.processData();
        computer.runSoftware();
        computer.connectInternet();
        computer.storeData();
        computer.displayOutput();

        if (computer instanceof Laptop) {
            System.out.println("Casting to Laptop...");
            Laptop laptop = (Laptop) computer;
            laptop.showLaptopBrand();
        }
    }
}

package com.xworkz.count.country1;

public class Portfolio {
    String name;
    String sector;
    int budget;
    String ministerInCharge;

    Portfolio(String name, String sector, int budget, String ministerInCharge) {
        this.name = name;
        this.sector = sector;
        this.budget = budget;
        this.ministerInCharge = ministerInCharge;
    }

    void display() {
        System.out.println("Portfolio: " + name + ", Sector: " + sector + ", Budget: " + budget + "M, Minister: " + ministerInCharge);
    }
}

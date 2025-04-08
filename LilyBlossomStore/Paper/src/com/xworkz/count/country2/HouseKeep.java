package com.xworkz.count.country2;

public class HouseKeep {
    Transport transport;

    public HouseKeep(Transport transport) {
        this.transport = transport;
    }

    public void display() {
        System.out.println("HouseKeep Details:");
        transport.display();
    }
}

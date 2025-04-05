package com.xworkz.lilyblossomstore.internal.sport;

public class Sport {

    public Sport() {
        System.out.println("Running Sport Constructor in Sport class");
    }

    public void play() {
        System.out.println("Parent class");
        System.out.println("Playing the sport");
    }

    public void stop() {
        System.out.println("Parent class");
        System.out.println("Stopping the sport");
    }

    public void getRules() {
        System.out.println("Parent class");
        System.out.println("Getting sport rules");
    }

    public void getPlayers() {
        System.out.println("Parent class");
        System.out.println("Getting number of players");
    }

    public void getEquipment() {
        System.out.println("Parent class");
        System.out.println("Getting required equipment");
    }
}

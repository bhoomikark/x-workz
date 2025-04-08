package com.xworkz.lilyblossomstore.internal.sport;

public class CricketFranchise {
    public void Franchise(Sport sport) {
        System.out.println("\nInside CricketFranchise class");

        sport.play();
        sport.stop();
        sport.getRules();
        sport.getPlayers();
        sport.getEquipment();

        if (sport instanceof Cricket) {
            System.out.println("Casting Sport to Cricket to access franchiseLeague method...");
            Cricket cricket = (Cricket) sport;
            cricket.franchiseLeague();
        }
    }
}

package com.xworkz.lilyblossomstore.internal.sport;

public class Cricket extends Sport {
    public Cricket() {
        super();
        System.out.println("Running Cricket Constructor in Cricket class");
    }

    @Override
    public void play() {
        System.out.println("Child class");
        System.out.println("Cricket match begins with a toss and innings.");
    }

    @Override
    public void stop() {
        System.out.println("Child class");
        System.out.println("Cricket match stopped due to bad light or completion.");
    }

    @Override
    public void getRules() {
        System.out.println("Child class");
        System.out.println("Cricket follows ICC rules for fair play.");
    }

    @Override
    public void getPlayers() {
        System.out.println("Child class");
        System.out.println("Cricket is played with 11 players per team.");
    }

    @Override
    public void getEquipment() {
        System.out.println("Child class");
        System.out.println("Cricket requires bat, ball, stumps, and protective gear.");
    }
    public void franchiseLeague() {
        System.out.println("Child Class");
        System.out.println("This cricket is part of a franchise league (e.g., IPL)...");
    }
}

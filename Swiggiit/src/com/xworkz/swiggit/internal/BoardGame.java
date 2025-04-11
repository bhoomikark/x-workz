package com.xworkz.swiggit.internal;

public class BoardGame {
    public String gameName;
    public int noOfPlayers;
    public boolean isStrategyBased;

    public BoardGame(String gameName, int noOfPlayers, boolean isStrategyBased) {
        this.gameName = gameName;
        this.noOfPlayers = noOfPlayers;
        this.isStrategyBased = isStrategyBased;
        System.out.println("100. Running Board Game Constructor");
    }
@Override
    public String toString() {
        return "Game: " + gameName + ", Players: " + noOfPlayers + ", Strategy: " + isStrategyBased;
    }
    @Override
    public int hashCode() {
        System.out.println("Default Hashcode: " + super.hashCode());
        return 555;
    }
}

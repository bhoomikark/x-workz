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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof BoardGame) {
                System.out.println("BoardGame is reference of object");
                BoardGame game1 = this;
                BoardGame game2 = (BoardGame) obj;
                if (game1.gameName.equals(game2.gameName)) {
                    System.out.println("Both games are same");
                    return true;
                }
            }
        }
        return false;
    }
}


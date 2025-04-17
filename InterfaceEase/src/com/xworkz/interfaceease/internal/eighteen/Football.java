package com.xworkz.interfaceease.internal.eighteen;

public class Football implements Game {
    @Override
    public void startGame() {
        System.out.println("Football match started.");
    }
    @Override
    public void playGame() {
        System.out.println("Players are playing football.");
    }
    @Override
    public void endGame() {
        System.out.println("Football match ended.");
    }
}

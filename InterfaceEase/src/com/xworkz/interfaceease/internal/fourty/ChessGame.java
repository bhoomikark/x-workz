package com.xworkz.interfaceease.internal.fourty;

public class ChessGame implements Game {
    @Override
    public void startGame() {
        System.out.println("Chess game started.");
    }

    @Override
    public void playGame() {
        System.out.println("Playing chess...");
    }

    @Override
    public void endGame() {
        System.out.println("Chess game ended.");
    }
@Override
    public void pauseGame()
    {
        System.out.println("pause game -- default -- chessgame");
    }
}

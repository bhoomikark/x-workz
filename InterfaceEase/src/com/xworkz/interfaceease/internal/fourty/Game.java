package com.xworkz.interfaceease.internal.fourty;

public interface Game {
    void startGame();
    void playGame();
    void endGame();
    default void pauseGame()
    {
        System.out.println("pause game -- default");
    }
}

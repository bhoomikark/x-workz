package com.xworkz.interfaceease.internal.eighteen;

public interface Game {
    void startGame();
    void playGame();
    void endGame();
    default void pauseGame()
    {
        System.out.println("Running Pause game");
    }
}

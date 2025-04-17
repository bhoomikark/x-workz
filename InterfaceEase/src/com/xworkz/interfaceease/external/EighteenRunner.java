package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.eighteen.*;

public class EighteenRunner {
    public static void main(String[] args) {
        Game myGame = new Football();
        myGame.startGame();
        myGame.playGame();
        myGame.endGame();
    }
}

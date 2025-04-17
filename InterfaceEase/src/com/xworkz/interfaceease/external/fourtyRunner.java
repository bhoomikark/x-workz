package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.fourty.*;

public class fourtyRunner {
    public static void main(String[] args) {
        Game chess = new ChessGame();
        chess.startGame();
        chess.playGame();
        chess.endGame();
    }
}


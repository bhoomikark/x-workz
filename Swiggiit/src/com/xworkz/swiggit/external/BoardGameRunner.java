package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.BoardGame;

public class BoardGameRunner {
    public static void main(String[] args) {
        BoardGame game = new BoardGame("Chess", 2, true);
        System.out.println(game);
    }
}

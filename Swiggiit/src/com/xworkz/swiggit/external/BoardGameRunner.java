package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.BoardGame;

public class BoardGameRunner {
    public static void main(String[] args) {
        BoardGame game = new BoardGame("Chess", 2, true);
        System.out.println(game);
        System.out.println("BoardGame HashCode: " + game.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(game));
        BoardGame game1 = new BoardGame("Monopoly", 4, true);
        BoardGame game2 = new BoardGame("Chess", 2, true);

        System.out.println("Are at same location or not: " + (game1 == game2));
        boolean value = game2.equals(game);
        System.out.println("Are both board games same? " + value);
    }
}

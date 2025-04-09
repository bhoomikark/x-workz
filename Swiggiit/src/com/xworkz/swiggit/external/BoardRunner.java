package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Board;

public class BoardRunner {
    public static void main(String[] args) {
        Board board = new Board("Whiteboard", "White", 5);

        System.out.println("Board to string: " + board.toString());
    }
}

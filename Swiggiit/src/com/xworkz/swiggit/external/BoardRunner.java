package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Board;

public class BoardRunner {
    public static void main(String[] args) {
        Board board = new Board("Whiteboard", "White", 5);

        System.out.println("Board to string: " + board.toString());
        System.out.println("Board HashCode: " + board.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(board));
        Board board1 = new Board("Blackboard", "Black", 4);
        Board board2 = new Board("Whiteboard", "White", 5);

        System.out.println("Are at same location or not: " + (board1 == board2));
        boolean value = board2.equals(board);
        System.out.println("Are both boards same? " + value);
    }
}

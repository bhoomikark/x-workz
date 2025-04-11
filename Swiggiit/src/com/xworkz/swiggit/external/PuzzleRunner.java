package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Puzzle;

public class PuzzleRunner {
    public static void main(String[] args) {
        Puzzle puzzle = new Puzzle("Globe Puzzle", 300, true);
        System.out.println(puzzle);
        System.out.println("Overridden HashCode: " + puzzle.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(puzzle));
    }
}

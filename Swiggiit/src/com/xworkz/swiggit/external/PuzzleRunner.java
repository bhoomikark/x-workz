package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Puzzle;

public class PuzzleRunner {
    public static void main(String[] args) {
        Puzzle puzzle = new Puzzle("Globe Puzzle", 300, true);
        System.out.println(puzzle);
    }
}

package com.xworkz.swiggit.internal;

public class Puzzle {
    public String puzzleName;
    public int pieces;
    public boolean is3D;

    public Puzzle(String puzzleName, int pieces, boolean is3D) {
        this.puzzleName = puzzleName;
        this.pieces = pieces;
        this.is3D = is3D;
        System.out.println("98. Running Puzzle Constructor");
    }

    public String toString() {
        return "Name: " + puzzleName + ", Pieces: " + pieces + ", 3D: " + is3D;
    }
}

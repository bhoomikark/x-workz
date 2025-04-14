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
@Override
    public String toString() {
        return "Name: " + puzzleName + ", Pieces: " + pieces + ", 3D: " + is3D;
    }

    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 444;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Puzzle) {
            Puzzle otherPuzzle = (Puzzle) obj;
            return this.puzzleName.equals(otherPuzzle.puzzleName) &&
                    this.pieces == otherPuzzle.pieces &&
                    this.is3D == otherPuzzle.is3D;
        }
        return false;
    }
}

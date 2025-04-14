package com.xworkz.swiggit.internal;

public class Board {
    private String typeOfBoard;
    private String colorOfBoard;
    private int noOfBoards;

    public Board(String typeOfBoard, String colorOfBoard, int noOfBoards) {
        this.typeOfBoard = typeOfBoard;
        this.colorOfBoard = colorOfBoard;
        this.noOfBoards = noOfBoards;
        System.out.println("9. Running Board Constructor");
    }

    @Override
    public String toString() {
        return "Type of Board: " + typeOfBoard + ", Color of Board: " + colorOfBoard +
                ", No of Boards: " + noOfBoards;
    }
    @Override
    public int hashCode() {
        System.out.println("Default Hashcode: " + super.hashCode());
        return 666;
    }
    public String getBoardType() {
        return typeOfBoard;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof Board) {
                System.out.println("Board is reference of object");
                Board board1 = this;
                Board board2 = (Board) obj;
                if (board1.typeOfBoard.equals(board2.typeOfBoard)) {
                    System.out.println("Both boards are same");
                    return true;
                }
            }
        }
        return false;
    }
}

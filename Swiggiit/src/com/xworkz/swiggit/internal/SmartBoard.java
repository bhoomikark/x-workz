package com.xworkz.swiggit.internal;

public class SmartBoard {
    private String smartBoardType;
    private String smartBoardShape;
    private String smartBoardMaterial;

    public SmartBoard(String smartBoardType, String smartBoardShape, String smartBoardMaterial) {
        this.smartBoardType = smartBoardType;
        this.smartBoardShape = smartBoardShape;
        this.smartBoardMaterial = smartBoardMaterial;
        System.out.println("39. Running SmartBoard Constructor");
    }

    @Override
    public String toString() {
        return "SmartBoard Type: " + smartBoardType + ", Shape: " + smartBoardShape +
                ", Material: " + smartBoardMaterial;
    }
    @Override
    public int hashCode() {
        return 302;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof SmartBoard) {
                System.out.println("SmartBoard is reference of object");
                SmartBoard board1 = this;
                SmartBoard board2 = (SmartBoard) obj;

                if (board1.smartBoardType.equals(board2.smartBoardType) && board1.smartBoardMaterial.equals(board2.smartBoardMaterial)) {
                    System.out.println("SmartBoards are equal (based on type and material)");
                    return true;
                }
            }
        }
        return false;
    }
}

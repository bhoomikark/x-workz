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
}

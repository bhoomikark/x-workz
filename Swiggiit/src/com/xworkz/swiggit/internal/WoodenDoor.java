package com.xworkz.swiggit.internal;

public class WoodenDoor {
    private String woodenDoorType;
    private String materialUsed;
    private String design;

    public WoodenDoor(String woodenDoorType, String materialUsed, String design) {
        this.woodenDoorType = woodenDoorType;
        this.materialUsed = materialUsed;
        this.design = design;
        System.out.println("53. Running WoodenDoor Constructor");
    }

    @Override
    public String toString() {
        return "Wooden Door Type: " + woodenDoorType + ", Material Used: " + materialUsed +
                ", Design: " + design;
    }
}

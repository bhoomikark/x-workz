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
    @Override
    public int hashCode() {
        return 654;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof WoodenDoor) {
            WoodenDoor other = (WoodenDoor) obj;
            return this.woodenDoorType.equals(other.woodenDoorType) && this.materialUsed.equals(other.materialUsed);
        }
        return false;
    }
}

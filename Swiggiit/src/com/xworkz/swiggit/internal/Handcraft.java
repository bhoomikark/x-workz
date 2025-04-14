package com.xworkz.swiggit.internal;

public class Handcraft {
    private int noOfHandcraftMade;
    private String handcraftName;
    private String handcraftMaterialUsed;

    public Handcraft(int noOfHandcraftMade, String handcraftName, String handcraftMaterialUsed) {
        this.noOfHandcraftMade = noOfHandcraftMade;
        this.handcraftName = handcraftName;
        this.handcraftMaterialUsed = handcraftMaterialUsed;
        System.out.println("51. Running Handcraft Constructor");
    }

    @Override
    public String toString() {
        return "No. of Handcrafts Made: " + noOfHandcraftMade + ", Handcraft Name: " + handcraftName +
                ", Material Used: " + handcraftMaterialUsed;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 333;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Handcraft) {
                Handcraft otherHandcraft = (Handcraft) obj;
                if (this.noOfHandcraftMade == otherHandcraft.noOfHandcraftMade &&
                        this.handcraftName.equals(otherHandcraft.handcraftName) &&
                        this.handcraftMaterialUsed.equals(otherHandcraft.handcraftMaterialUsed)) {
                    System.out.println("Both handcrafts are the same");
                    return true;
                }
            }
        }
        return false;
    }
}

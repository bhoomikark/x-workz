package com.xworkz.swiggit.internal;

public class Sketchbook {
    public int noOfPages;
    public String sketchbookSize;
    public boolean isHardBound;

    public Sketchbook(int noOfPages, String sketchbookSize, boolean isHardBound) {
        this.noOfPages = noOfPages;
        this.sketchbookSize = sketchbookSize;
        this.isHardBound = isHardBound;
        System.out.println("94. Running Sketchbook Constructor");
    }

    public String toString() {
        return "Pages: " + noOfPages + ", Size: " + sketchbookSize + ", HardBound: " + isHardBound;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 121;
    }
}

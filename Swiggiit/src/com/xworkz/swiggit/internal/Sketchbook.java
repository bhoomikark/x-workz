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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof Sketchbook) {
                System.out.println("Sketchbook is reference of object");
                Sketchbook sb1 = this;
                Sketchbook sb2 = (Sketchbook) obj;

                if (sb1.noOfPages == sb2.noOfPages && sb1.sketchbookSize.equals(sb2.sketchbookSize)) {
                    System.out.println("Both Sketchbooks are same (based on pages and size)");
                    return true;
                }
            }
        }
        return false;
    }
}

}

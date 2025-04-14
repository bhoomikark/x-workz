package com.xworkz.swiggit.internal;

public class CropTop {
    private String topSize;
    private String clothType;
    private String colorOfCropTop;

    public CropTop(String topSize, String clothType, String colorOfCropTop) {
        this.topSize = topSize;
        this.clothType = clothType;
        this.colorOfCropTop = colorOfCropTop;
        System.out.println("4. Running CropTop Constructor");
    }

    @Override
    public String toString() {
        return "Top Size: " + topSize + ", Cloth Type: " + clothType +
                ", Color of CropTop: " + colorOfCropTop;
    }
    @Override
    public int hashCode() {
        System.out.println("Default Hashcode: " + super.hashCode());
        return 444;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof CropTop) {
                System.out.println("CropTop is reference of object");
                CropTop cropTop1 = this;
                CropTop cropTop2 = (CropTop) obj;
                if (cropTop1.clothType.equals(cropTop2.clothType)) {
                    System.out.println("Both CropTops have the same color");
                    return true;
                }
            }
        }
        return false;
    }
}

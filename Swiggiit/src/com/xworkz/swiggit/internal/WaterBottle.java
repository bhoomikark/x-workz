package com.xworkz.swiggit.internal;

public class WaterBottle {
    private String waterBottleColor;
    private String brand;
    private String type;

    public WaterBottle(String waterBottleColor, String brand, String type) {
        this.waterBottleColor = waterBottleColor;
        this.brand = brand;
        this.type = type;
        System.out.println("72. Running WaterBottle Constructor");
    }

    public String toString() {
        return "Color: " + waterBottleColor + ", Brand: " + brand + ", Type: " + type;
    }
    @Override
    public int hashCode() {
        return 321;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof WaterBottle) {
            WaterBottle other = (WaterBottle) obj;
            return this.waterBottleColor.equals(other.waterBottleColor) && this.brand.equals(other.brand);
        }
        return false;
    }
}

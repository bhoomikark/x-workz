package com.xworkz.swiggit.internal;

public class WildcraftBags {
    private String quality;
    private double price;
    private boolean areTrolleysAvailable;

    public WildcraftBags(String quality, double price, boolean areTrolleysAvailable) {
        this.quality = quality;
        this.price = price;
        this.areTrolleysAvailable = areTrolleysAvailable;
        System.out.println("78. Running WildcraftBags Constructor");
    }
@Override
    public String toString() {
        return "Quality: " + quality + ", Price: ₹" + price + ", Trolleys Available: " + areTrolleysAvailable;
    }
    @Override
    public int hashCode() {
        return 529;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof WildcraftBags) {
            WildcraftBags other = (WildcraftBags) obj;
            return this.price == other.price && this.areTrolleysAvailable == other.areTrolleysAvailable;
        }
        return false;
    }
}

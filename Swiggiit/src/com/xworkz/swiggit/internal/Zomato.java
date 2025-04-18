package com.xworkz.swiggit.internal;

public class Zomato {
    private boolean zomatoTrackOrder;
    private int totalItemsBought;
    private String itemsName;

    public Zomato(boolean zomatoTrackOrder, int totalItemsBought, String itemsName) {
        this.zomatoTrackOrder = zomatoTrackOrder;
        this.totalItemsBought = totalItemsBought;
        this.itemsName = itemsName;
        System.out.println("48. Running Zomato Constructor");
    }

    @Override
    public String toString() {
        return "Track Order: " + zomatoTrackOrder + ", Total Items Bought: " + totalItemsBought +
                ", Items Name: " + itemsName;
    }
    @Override
    public int hashCode() {
        return 57;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Zomato) {
                Zomato other = (Zomato) obj;
                if (this.zomatoTrackOrder == other.zomatoTrackOrder && this.totalItemsBought == other.totalItemsBought) {
                    return true;
                }
            }
        }
        return false;
    }

}

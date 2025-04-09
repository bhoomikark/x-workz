package com.xworkz.swiggit.internal;

public class Flashlight {
    public String flashlightType;
    public int batteryLife;
    public boolean isRechargeable;

    public Flashlight(String flashlightType, int batteryLife, boolean isRechargeable) {
        this.flashlightType = flashlightType;
        this.batteryLife = batteryLife;
        this.isRechargeable = isRechargeable;
        System.out.println("97. Running Flashlight Constructor");
    }

    public String toString() {
        return "Type: " + flashlightType + ", Battery Life: " + batteryLife + " hrs, Rechargeable: " + isRechargeable;
    }
}

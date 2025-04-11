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
@Override
    public String toString() {
        return "Type: " + flashlightType + ", Battery Life: " + batteryLife + " hrs, Rechargeable: " + isRechargeable;
    }
    @Override
    public int hashCode() {
        System.out.println("Default Hashcode: " + super.hashCode());
        return 444;
    }
}

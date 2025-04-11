package com.xworkz.swiggit.internal;

public class Key {
    private long keyId;
    private double lengthInCm;
    private boolean isDuplicate;

    public Key(long keyId, double lengthInCm, boolean isDuplicate) {
        this.keyId = keyId;
        this.lengthInCm = lengthInCm;
        this.isDuplicate = isDuplicate;
        System.out.println("75. Running Key Constructor");
    }
@Override
    public String toString() {
        return "Key ID: " + keyId + ", Length: " + lengthInCm + " cm, Is Duplicate: " + isDuplicate;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 789;
    }
}

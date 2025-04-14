package com.xworkz.swiggit.internal;

public class Rack {
    private String rackMaterial;
    private int numberOfRacks;
    private String colorOfRack;

    public Rack(String rackMaterial, int numberOfRacks, String colorOfRack) {
        this.rackMaterial = rackMaterial;
        this.numberOfRacks = numberOfRacks;
        this.colorOfRack = colorOfRack;
        System.out.println("18. Running Rack Constructor");
    }

    @Override
    public String toString() {
        return "Rack Material: " + rackMaterial + ", Number of Racks: " + numberOfRacks +
                ", Color of Rack: " + colorOfRack;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 555;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Rack) {
            Rack otherRack = (Rack) obj;
            return this.rackMaterial.equals(otherRack.rackMaterial) &&
                    this.numberOfRacks == otherRack.numberOfRacks &&
                    this.colorOfRack.equals(otherRack.colorOfRack);
        }
        return false;
    }
}

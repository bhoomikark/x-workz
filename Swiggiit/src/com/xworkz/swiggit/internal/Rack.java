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
}

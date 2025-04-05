package com.xworkz.pack.internal;

public class Screw {
    private int size;
    private String material;
    private Remote remote;


    public Screw(int size, String material, Remote remote) {
        this.size = size;
        this.material = material;
        this.remote = remote;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Remote getRemote() {
        return remote;
    }

    public void setRemote(Remote remote) {
        this.remote = remote;
    }

    // Show method to display Screw details and call Remote method
    public void showScrew() {
        System.out.println("Running showScrew in Screw class");
        System.out.println("Screw Details:");
        System.out.println("Size: " + this.size + "mm");
        System.out.println("Material: " + this.material);
        System.out.println("=========================================");


        if (remote != null) {
            System.out.println("Calling Remote from Screw...");
            remote.showRemote();
        } else {
            System.out.println("No Remote connected to Screw.");
        }
    }

}

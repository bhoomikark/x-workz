package com.xworkz.swiggit.internal;

public class Pillow {
    private String pillowCover;
    private String pillowBrand;
    private String pillowDesign;

    public Pillow(String pillowCover, String pillowBrand, String pillowDesign) {
        this.pillowCover = pillowCover;
        this.pillowBrand = pillowBrand;
        this.pillowDesign = pillowDesign;
        System.out.println("19. Running Pillow Constructor");
    }

    @Override
    public String toString() {
        return "Pillow Cover: " + pillowCover + ", Pillow Brand: " + pillowBrand +
                ", Pillow Design: " + pillowDesign;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 450;
    }
}

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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Pillow) {
                System.out.println("Pillow is reference of Object");
                Pillow p1 = this;
                Pillow p2 = (Pillow) obj;
                if (p1.pillowCover.equals(p2.pillowCover) &&
                        p1.pillowBrand.equals(p2.pillowBrand) &&
                        p1.pillowDesign.equals(p2.pillowDesign)) {
                    System.out.println("Both Pillow objects are equal");
                    return true;
                }
            }
        }
        return false;
    }
}

package com.xworkz.swiggit.internal;

public class Projector {
    private String projectorShape;
    private boolean isProjectorHaving5Star;
    private String projectorBrand;

    public Projector(String projectorShape, boolean isProjectorHaving5Star, String projectorBrand) {
        this.projectorShape = projectorShape;
        this.isProjectorHaving5Star = isProjectorHaving5Star;
        this.projectorBrand = projectorBrand;
        System.out.println("34. Running Projector Constructor");
    }

    @Override
    public String toString() {
        return "Projector Shape: " + projectorShape + ", 5-Star Rated: " + isProjectorHaving5Star +
                ", Projector Brand: " + projectorBrand;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 818;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Projector) {
            Projector otherProjector = (Projector) obj;
            return this.projectorShape.equals(otherProjector.projectorShape) &&
                    this.isProjectorHaving5Star == otherProjector.isProjectorHaving5Star &&
                    this.projectorBrand.equals(otherProjector.projectorBrand);
        }
        return false;
    }
}

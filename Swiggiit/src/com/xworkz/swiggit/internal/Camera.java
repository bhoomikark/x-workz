package com.xworkz.swiggit.internal;

public class Camera {
    public String cameraBrand;
    public double resolution;
    public boolean isDSLR;

    public Camera(String cameraBrand, double resolution, boolean isDSLR) {
        this.cameraBrand = cameraBrand;
        this.resolution = resolution;
        this.isDSLR = isDSLR;
        System.out.println("89. Running Camera Constructor");
    }
@Override
    public String toString() {
        return "Brand: " + cameraBrand + ", Resolution: " + resolution + "MP, DSLR: " + isDSLR;
    }
    @Override
    public int hashCode() {
        System.out.println("Default Hashcode: " + super.hashCode());
        return 222;
    }
}

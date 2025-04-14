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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof Calendar) {
                System.out.println("Calendar is reference of object");
                Camera  camera = this;
                Camera camera1 = (Camera) obj;
                if (
                        camera1.cameraBrand.equals(camera.cameraBrand)) {
                    System.out.println("Both calendars are the same");
                    return true;
                }
            }
        }
        return false;
    }
}

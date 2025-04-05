package com.xworkz.lilyblossomstore.internal.camera;

public class DSLR extends Camera {

    public DSLR() {
        super();

        System.out.println("Running DSLR Constructor");
    }

    @Override
    public void capturePhoto() {
        System.out.println("Child Class");
        System.out.println("Capturing high-resolution photo...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Child Class");
        System.out.println("Recording HD video...");
    }

    @Override
    public void zoomLens() {
        System.out.println("Child Class");
        System.out.println("Zooming DSLR lens...");
    }

    @Override
    public void adjustFocus() {
        System.out.println("Child Class");
        System.out.println("Manually adjusting DSLR focus...");
    }

    @Override
    public void changeMode() {
        System.out.println("Child Class");
        System.out.println("Switching DSLR shooting mode...");
    }
}

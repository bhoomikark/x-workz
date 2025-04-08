package com.xworkz.lilyblossomstore.internal.camera;

public class SLR {
    public void view(Camera camera) {
        System.out.println("\nRunning view(Camera camera)");
        System.out.println("==============================");
        camera.capturePhoto();
        camera.recordVideo();
        camera.zoomLens();
        camera.adjustFocus();
        camera.changeMode();

        if (camera instanceof DSLR) {
            System.out.println("Casting to DSLR...");
            DSLR dslr = (DSLR) camera;
            dslr.dslrSpecialFeature();
        }
    }
}

package com.xworkz.interfaceease.internal.fourtyone;

public class DSLRCamera implements Camera {
    @Override
    public void openCamera() {
        System.out.println("DSLR Camera is now ON.");
    }

    @Override
    public void clickPicture() {
        System.out.println("Picture clicked using DSLR.");
    }

    @Override
    public void closeCamera() {
        System.out.println("DSLR Camera is now OFF.");
    }
@Override
    public void flashlightOn()
    {
        System.out.println("flash on -- default -- DSLRCamera");
    }
}

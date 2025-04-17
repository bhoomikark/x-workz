package com.xworkz.interfaceease.internal.fourtyone;

public interface Camera {
    void openCamera();
    void clickPicture();
    void closeCamera();
    default void flashlightOn()
    {
        System.out.println("flash on -- default");
    }
}

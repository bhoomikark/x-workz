package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.fourtyone.*;

public class FourtyOneRunner {
    public static void main(String[] args) {
        Camera cam = new DSLRCamera();
        cam.openCamera();
        cam.clickPicture();
        cam.closeCamera();
    }
}

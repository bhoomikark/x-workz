package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Camera;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera = new Camera("Canon", 24.2, true);
        System.out.println(camera);
    }
}

package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Camera;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera = new Camera("Canon", 24.2, true);
        System.out.println(camera);
        System.out.println("Camera HashCode: " + camera.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(camera));
        Camera camera1=new Camera("Canon", 24.2, true);
        boolean value=camera.equals(camera1);
        System.out.println(value);
    }
}

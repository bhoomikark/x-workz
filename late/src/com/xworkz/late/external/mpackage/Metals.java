
package com.xworkz.late.external.mpackage;

import com.xworkz.late.internal.mpackage.Mat;

public class Metals {
    Mat mat;

    public Metals(Mat mat) {
        System.out.println("Running parameterized constructor of Metals");
        this.mat = mat;
    }

    public void useMat() {
        if (this.mat != null) {
            this.mat.place();
        } else {
            System.out.println("Mat is not available for use");
        }
    }
}

package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.slipper.Slipper;
import com.xworkz.lilyblossomstore.internal.slipper.RubberSlipper;

public class SlipperRunner {
    public static void main(String[] args) {
        System.out.println("Using parent type reference:");
        Slipper slipper = new RubberSlipper();
        slipper.wear();
        slipper.remove();
        slipper.clean();
        slipper.dry();
        slipper.store();

        System.out.println("-----------");

        System.out.println("Using child type reference:");
        RubberSlipper rubberSlipper = new RubberSlipper();
        rubberSlipper.wear();
        rubberSlipper.remove();
        rubberSlipper.clean();
        rubberSlipper.dry();
        rubberSlipper.store();
    }
}

package com.xworkz.lilyblossomstore.internal.tech;

public class Windows {
    public void hp(Software software) {
        System.out.println("\nInside Windows class - Software inspection...");

        software.install();
        software.execute();
        software.update();
        software.debug();
        software.uninstall();

        if (software instanceof OperatingSystem) {
            System.out.println("Casting Software to OperatingSystem to get systemInfo...");
            OperatingSystem os = (OperatingSystem) software;
            os.systemInfo();
        }
    }
}

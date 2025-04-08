package com.xworkz.lilyblossomstore.internal.tech;

public class OperatingSystem extends Software {
    public OperatingSystem() {
        super();
        System.out.println("Child class");
        System.out.println("Operating System manages hardware & software...");
    }

    @Override
    public void install() {
        System.out.println("Child class");
        System.out.println("Installing operating system...");
    }

    @Override
    public void execute() {
        System.out.println("Child class");
        System.out.println("Running operating system services...");
    }

    @Override
    public void update() {
        System.out.println("Child class");
        System.out.println("Updating the OS...");
    }

    @Override
    public void debug() {
        System.out.println("Child class");
        System.out.println("Debugging OS-level issues...");
    }

    @Override
    public void uninstall() {
        System.out.println("Child class");
        System.out.println("Uninstalling OS is not typically allowed...");
    }
    public void systemInfo() {
        System.out.println("Operating System provides system information.");
    }
}

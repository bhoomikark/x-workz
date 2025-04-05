package com.xworkz.lilyblossomstore.internal.nut;

public class HexNut extends Nut {
    public HexNut() {
        super();
        System.out.println("Running HexNut Constructor in HexNut class - Child class");
    }

    @Override
    public void fasten() {
        System.out.println("Nut is being fastened. - Child class");
    }

    @Override
    public void loosen() {
        System.out.println("Nut is being loosened. - Child class");
    }

    @Override
    public void holdBolt() {
        System.out.println("Nut is holding a bolt in place. - Child class");
    }

    @Override
    public void rustProtection() {
        System.out.println("Nut is coated for rust protection. - Child class");
    }

    @Override
    public void adjustTightness() {
        System.out.println("Adjusting the tightness of the nut. - Child class");
    }
}

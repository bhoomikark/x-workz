package com.xworkz.lilyblossomstore.internal.facewash;

public class HerbalFaceWash extends FaceWash {
    public HerbalFaceWash() {
        super();

        System.out.println("Running HerbalFaceWash Constructor in HerbalFaceWash class");
    }

    @Override
    public void cleanse() {
        System.out.println("Child Class");
        System.out.println("HerbalFaceWash gently cleanses the skin.");
    }

    @Override
    public void moisturize() {
        System.out.println("Child Class");
        System.out.println("HerbalFaceWash locks in natural moisture.");
    }

    @Override
    public void removeOil() {
        System.out.println("Child Class");
        System.out.println("HerbalFaceWash removes oil with herbal extracts.");
    }

    @Override
    public void refreshSkin() {
        System.out.println("Child Class");
        System.out.println("HerbalFaceWash gives a refreshing herbal feel.");
    }

    @Override
    public void exfoliate() {
        System.out.println("Child Class");
        System.out.println("HerbalFaceWash exfoliates with natural ingredients.");
    }
}

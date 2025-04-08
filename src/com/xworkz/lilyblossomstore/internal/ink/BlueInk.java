package com.xworkz.lilyblossomstore.internal.ink;

public class BlueInk {
    public void inkSpill(Ink ink) {
        System.out.println("\nInside BlueInk class - Handling ink properties...");

        ink.color();
        ink.dry();
        ink.permanence();
        ink.use();

        if (ink instanceof InvisibleInk) {
            System.out.println("Casting Ink to InvisibleInk to access revealMessage method...");
            InvisibleInk invisible = (InvisibleInk) ink;
            invisible.revealMessage();
        }
    }
}

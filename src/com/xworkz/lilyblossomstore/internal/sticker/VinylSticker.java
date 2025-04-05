package com.xworkz.lilyblossomstore.internal.sticker;

public class VinylSticker extends Sticker {
    public VinylSticker() {
        super();
        System.out.println("Running VinylSticker Constructor in VinylSticker class");
    }

    @Override
    public void peel() {
        System.out.println("Child class");
        System.out.println("VinylSticker peels off smoothly without leaving residue.");
    }

    @Override
    public void stick() {
        System.out.println("Child class");
        System.out.println("VinylSticker is applied on flat surfaces for long-lasting grip.");
    }

    @Override
    public void remove() {
        System.out.println("Child class");
        System.out.println("VinylSticker can be removed and repositioned easily.");
    }

    @Override
    public void print() {
        System.out.println("Child class");
        System.out.println("VinylSticker is printed using UV-resistant inks.");
    }

    @Override
    public void decorate() {
        System.out.println("Child class");
        System.out.println("VinylSticker is used to decorate walls and laptops stylishly.");
    }
}

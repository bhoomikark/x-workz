package com.xworkz.lilyblossomstore.internal.tshirt;

public class PoloTShirt extends TShirt {
    public PoloTShirt() {
        super();
        System.out.println("Running PoloTShirt Constructor in PoloTShirt class");
    }

    @Override
    public void wear() {
        System.out.println("Child class");
        System.out.println("Wearing a stylish Polo TShirt.");
    }

    @Override
    public void remove() {
        System.out.println("Child class");
        System.out.println("Polo TShirt is removed gently.");
    }

    @Override
    public void wash() {
        System.out.println("Child class");
        System.out.println("Polo TShirt is being washed carefully.");
    }

    @Override
    public void iron() {
        System.out.println("Child class");
        System.out.println("Polo TShirt is ironed with low heat.");
    }

    @Override
    public void fold() {
        System.out.println("Child class");
        System.out.println("Folding the Polo TShirt neatly.");
    }
}

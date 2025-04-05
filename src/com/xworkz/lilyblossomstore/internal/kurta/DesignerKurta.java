package com.xworkz.lilyblossomstore.internal.kurta;

public class DesignerKurta extends Kurta {
    public DesignerKurta() {
        super();
        System.out.println("No-argument constructor of DesignerKurta");
    }

    @Override
    public void wear() {
        System.out.println("Designer Kurta is worn for fashion - Child class");
    }

    @Override
    public void wash() {
        System.out.println("Designer Kurta should be dry cleaned - Child class");
    }

    @Override
    public void iron() {
        System.out.println("Designer Kurta is steam ironed - Child class");
    }

    @Override
    public void fold() {
        System.out.println("Designer Kurta is carefully folded - Child class");
    }

    @Override
    public void design() {
        System.out.println("Designer Kurtas come with intricate designs - Child class");
    }
}

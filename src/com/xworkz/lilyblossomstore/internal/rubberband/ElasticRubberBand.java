package com.xworkz.lilyblossomstore.internal.rubberband;

public class ElasticRubberBand extends RubberBand {
    public ElasticRubberBand() {
        super();
        System.out.println("Running ElasticRubberBand Constructor in ElasticRubberBand class");
    }

    @Override
    public void stretch() {
        System.out.println("Child class");
        System.out.println("ElasticRubberBand stretches more than regular rubber bands.");
    }

    @Override
    public void hold() {
        System.out.println("Child class");
        System.out.println("ElasticRubberBand holds items with extra grip.");
    }

    @Override
    public void breakIfOverstretched() {
        System.out.println("Child class");
        System.out.println("ElasticRubberBand is less likely to break when stretched.");
    }

    @Override
    public void shrink() {
        System.out.println("Child class");
        System.out.println("ElasticRubberBand shrinks back quickly after stretching.");
    }

    @Override
    public void twist() {
        System.out.println("Child class");
        System.out.println("ElasticRubberBand twists flexibly without damage.");
    }
}

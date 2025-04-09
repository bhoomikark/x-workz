package com.xworkz.swiggit.internal;

public class RubberBand {
    private String rubberBandColor;
    private String rubberBandType;
    private boolean isBowRubberBand;

    public RubberBand(String rubberBandColor, String rubberBandType, boolean isBowRubberBand) {
        this.rubberBandColor = rubberBandColor;
        this.rubberBandType = rubberBandType;
        this.isBowRubberBand = isBowRubberBand;
        System.out.println("12. Running RubberBand Constructor");
    }

    @Override
    public String toString() {
        return "RubberBand Color: " + rubberBandColor + ", RubberBand Type: " + rubberBandType +
                ", Is Bow RubberBand: " + isBowRubberBand;
    }
}

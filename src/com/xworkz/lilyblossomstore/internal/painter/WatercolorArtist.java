package com.xworkz.lilyblossomstore.internal.painter;

public class WatercolorArtist extends Painter {

    public WatercolorArtist() {
        super();
        System.out.println("Running WatercolorArtist Constructor - Child class");
    }

    @Override
    public void mixColors() {
        System.out.println("Mixing colors... - Child class");
    }

    @Override
    public void drawSketch() {
        System.out.println("Drawing a sketch... - Child class");
    }

    @Override
    public void paintCanvas() {
        System.out.println("Painting on canvas... - Child class");
    }

    @Override
    public void cleanBrushes() {
        System.out.println("Cleaning brushes... - Child class");
    }

    @Override
    public void framePainting() {
        System.out.println("Framing the painting... - Child class");
    }
    public void useWaterSpray() {
        System.out.println("Child Class");
        System.out.println("Watercolor artist is spraying water for blending effects...");
    }
}

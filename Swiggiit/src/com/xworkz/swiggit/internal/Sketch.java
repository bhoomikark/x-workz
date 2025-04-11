package com.xworkz.swiggit.internal;

public class Sketch {
    private String sketchPencilsNeeded;
    private int noOfSketchesDone;
    private String pencilOrDrawingPencil;

    public Sketch(String sketchPencilsNeeded, int noOfSketchesDone, String pencilOrDrawingPencil) {
        this.sketchPencilsNeeded = sketchPencilsNeeded;
        this.noOfSketchesDone = noOfSketchesDone;
        this.pencilOrDrawingPencil = pencilOrDrawingPencil;
        System.out.println("63. Running Sketch Constructor");
    }

    @Override
    public String toString() {
        return "Pencils Needed: " + sketchPencilsNeeded + ", Sketches Done: " + noOfSketchesDone + ", Pencil Type: " + pencilOrDrawingPencil;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 303;
    }
}

package com.xworkz.lilyblossomstore.internal.painter;

public class PaintArtist {
    public void artistName(Painter painter) {
        System.out.println("\nInside PaintArtist class");

        painter.mixColors();
        painter.drawSketch();
        painter.paintCanvas();
        painter.cleanBrushes();
        painter.framePainting();

        if (painter instanceof WatercolorArtist) {
            WatercolorArtist watercolor = (WatercolorArtist) painter;
            watercolor.useWaterSpray();
        }
    }
}

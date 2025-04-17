package com.xworkz.interfaceease.internal.eleven;

public class ShapeTool implements Drawable,Resizable{
    @Override
    public void drawShape() {
        System.out.println("draw shape -- drawable -- Shapetool");
    }

    @Override
    public void fillColor() {
        System.out.println("fill color -- drawable -- Shapetool");
    }

    @Override
    public void setLineStyle() {
        System.out.println("setline style -- drawable -- Shapetool");
    }

    @Override
    public void resizeWidth() {
        System.out.println("resize width -- resizable -- Shapetool");
    }

    @Override
    public void resizeHeight() {
        System.out.println("resize height -- resizable -- Shapetool");
    }

    @Override
    public void maintainAspectRatio() {
        System.out.println("maintain aspect ratio -- resizable -- Shapetool");
    }
}

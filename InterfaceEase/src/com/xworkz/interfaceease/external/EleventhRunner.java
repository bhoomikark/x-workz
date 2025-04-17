package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.eleven.*;

public class EleventhRunner {
    public static void main(String[] args) {
        System.out.println("running resizable interface from Window");
        Resizable resizable=new Window();
        resizable.resizeHeight();
        resizable.resizeWidth();
        resizable.resizebreadth();
        Drawable drawable3=new Sketch();
        drawable3.drawShape();
        drawable3.fillColor();
        drawable3.setLineStyle();
        drawable3.paint();
        resizable.maintainAspectRatio();
        System.out.println("==============================");
        System.out.println("2 copies from 2 sub classes");
        Drawable drawable=new Canvas();
        drawable.drawShape();
        drawable.fillColor();
        drawable.setLineStyle();

        Resizable resizable1=new Canvas();
        resizable1.resizeHeight();
        resizable1.resizeWidth();
        resizable1.maintainAspectRatio();
        Drawable drawable1=new ShapeTool();
        drawable1.drawShape();
        drawable1.fillColor();
        drawable1.setLineStyle();
        Resizable resizable2=new ShapeTool();
        resizable2.resizeHeight();
        resizable2.resizeWidth();
        resizable2.maintainAspectRatio();

    }
}

package com.xworkz.pack.internal;

public class Panel {
    private int thickness=10;
   private String material;
   private Button button;
   public void setMaterial(String material)
   {
       this.material=material;
   }
   public String getMaterial()
   {
       return material;
   }
   public Panel(int thickness,Button button)
   {
       this.thickness=thickness;
       this.button=button;
   }
   public void showPanel()
   {
       System.out.println("Running showPanel method in panel");
       System.out.println("The thickness is: "+this.thickness+"mm");
       System.out.println("The material is: "+this.material);
       System.out.println("===========================================");
       this.button.showButton();
   }

}

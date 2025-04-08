package com.xworkz.pack.internal;

public class Wire {
    private String material="Copper";
   private double length=5.5;
  private final Port port;
  public Wire(String material,double length,Port port)
  {
      this.material=material;
      this.length=length;
      this.port=port;
  }
  public void showWire()
  {
      System.out.println("Running show wire in Wire class");
      System.out.println("Connecting Port with Wire class");
      System.out.println("=====================================");
      System.out.println("The material of wire is: "+material);
      System.out.println("The length of wire is: "+length);
      this.port.setPortType("USB-C");
      this.port.showPort();

  }


}

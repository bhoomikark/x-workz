package com.xworkz.pack.internal;

public class Board {
   private String material="Wooden";
   private int size;
    private Wire wire;

    public Board(String Material,Wire wire)
    {
        this.material=material;
        this.wire=wire;
    }
    public void setSize(int size)
    {
        this.size=size;
    }
    public int getSize()
    {
        return size;
    }
    public void showBoard()
    {
        System.out.println("Running showBoard in Board class");
        System.out.println("Connecting Wire class with board");
        System.out.println("The material type is: "+this.material);
        System.out.println("The Board size is: "+this.size+"inches");

        System.out.println("==================================================");

        this.wire.showWire();


    }


}

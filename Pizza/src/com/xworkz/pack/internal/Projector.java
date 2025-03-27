package com.xworkz.pack.internal;

public class Projector {
    public static void main(String[] args) {
        Lens lens=new Lens("convex");
        Lamp lamp=new Lamp("LED",150L,lens);
        Port port=new Port(8080,lamp);
        Wire wire=new Wire("Copper",5.5,port);

wire.showWire();
    }

}

package com.xworkz.pack.internal;

public class Port {
    private String portType;
    private int portNumber=8080;
    private Lamp lamp;
    public void setPortType(String portType)
    {
        this.portType=portType;

    }
    public String getPortType()
    {
        return portType;
    }
    public Port(int portNumber,Lamp lamp)
    {
        this.portNumber=portNumber;
        this.lamp=lamp;
    }
    public void showPort()
    {
        System.out.println("Running showPort method in Port class");
        System.out.println("The port Type is: "+portType);
        System.out.println("The port number is: "+portNumber);
        System.out.println("===========================================");
        System.out.println("Connecting lamp class with port class");
        this.lamp.display();

    }


}

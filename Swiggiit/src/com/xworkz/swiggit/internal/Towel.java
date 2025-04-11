package com.xworkz.swiggit.internal;

public class Towel {
    private String type;
    private int noOfTowel;
    private String colorOfThreadUsed;
    public Towel(String type,int noOfTowel,String colorOfThreadUsed)
    {
        this.type=type;
        this.noOfTowel=noOfTowel;
        this.colorOfThreadUsed=colorOfThreadUsed;
        System.out.println("1.Running Towel Constructor");
    }
    @Override
    public String toString()
    {
        return "String Type is "+type+ ",No of Towel is " +noOfTowel+",The color of Thread used is "+colorOfThreadUsed;
    }
    @Override
    public int hashCode() {
        return 116;
    }

}

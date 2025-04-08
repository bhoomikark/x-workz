package com.xworkz.lilyblossomstore.internal.metal;

public class AluminiumProperties {
    public void hard(Metal metal){
        System.out.println("Running hard in aluminium properties");
        System.out.println("======================================");
       metal.getHardness();
       metal.conductHeat();
       metal.checkCorrosionResistance();
       metal.isMalleable();
       metal.getBoilingPoint();
       if(metal instanceof Aluminium)
       {
           Aluminium aluminium=(Aluminium)metal;
           aluminium.doShine();
       }

    }
}

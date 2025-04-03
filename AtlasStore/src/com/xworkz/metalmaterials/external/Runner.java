package com.xworkz.metalmaterials.external;

import com.xworkz.metalmaterials.internal.Aluminium;
import com.xworkz.metalmaterials.internal.Metal;

public class Runner {
    public static void main(String[] args){
    Metal metal = new Metal();
        metal.checkCorrosionResistance();
        metal.getHardness();
        metal.conductHeat();
        metal.getBoilingPoint();
        metal.isMalleable();

    Metal metal1 = new Aluminium();
        metal1.checkCorrosionResistance();
        metal1.getHardness();
        metal1.conductHeat();
        metal1.getBoilingPoint();
        metal1.isMalleable();

    Aluminium aluminium = new Aluminium();
        aluminium.getHardness();
        aluminium.checkCorrosionResistance();
        aluminium.getBoilingPoint();
        aluminium.isMalleable();
        aluminium.conductHeat();
}
}

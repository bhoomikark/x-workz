package com.xworkz.lilyblossomstore.internal.iron;

public class Utensils {
    public void wash(Iron iron)
    {
        System.out.println("Running wash in utensils");
        System.out.println("==========================");
        iron.checkRustFormation();
        iron.getDensity();
        iron.conductElectricity();
        iron.magneticProperties();
        iron.getMeltingPoint();
        if(iron instanceof Steel)
        {
            System.out.println("Casting");
            Steel steel=(Steel)iron;
            steel.weight();

        }

    }
}

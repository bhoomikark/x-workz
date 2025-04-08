package com.xworkz.lilyblossomstore.internal.appliance;

public class ElectricRefrigerator {
    public void Cools(Appliance appliance)
    {
        System.out.println("Cools items");
        appliance.adjustSettings();
        appliance.displayBrand();
        appliance.checkWarranty();
        appliance.turnOff();
        appliance.turnOn();
        if(appliance instanceof Refrigerator)
        {
            System.out.println("refrigerator is appliance");
            Refrigerator refrigerator=(Refrigerator)appliance;
            refrigerator.checkRating();
        }
    }
}

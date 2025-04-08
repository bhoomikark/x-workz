package com.xworkz.lilyblossomstore.internal.vehicle;

public class CarBrand {
    public void Brand(Vehicle vehicle)
    {
        System.out.println("The Brand of Car is Jaguar");
        System.out.println("============================");
        vehicle.accelerate();
        vehicle.applyBrakes();
        vehicle.fuelType();
        vehicle.startEngine();
        vehicle.stopEngine();
        if(vehicle instanceof Car)
        {
            System.out.println("Casting");
            Car car=(Car)vehicle;
            car.checKSpeed();
        }
    }
}

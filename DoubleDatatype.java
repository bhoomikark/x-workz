class DoubleDatatype{
public static void main(String[] args)
{
System.out.println("7. Double Datatype");

        // Variable declaration and initialization
        double piValue = 3.14159265359;
        double distanceToMoon = 384400.0;  // in kilometers
        double bankBalance = 25000.75;
        double fuelConsumption = 15.6;  // in liters per 100 km
        double earthRadius = 6371.0;  // in kilometers

        // Printing values before reinitialization
        System.out.println("Before Reinitialization:");
        System.out.println("Pi Value: " + piValue);
        System.out.println("Distance to Moon (km): " + distanceToMoon);
        System.out.println("Bank Balance: " + bankBalance);
        System.out.println("Fuel Consumption : " + fuelConsumption);
        System.out.println("Earth Radius (km): " + earthRadius);

        // Variable reinitialization
        piValue = 3.1416;
        distanceToMoon = 385000.0;
        bankBalance = 50000.90;
        fuelConsumption = 13.4;
        earthRadius = 6378.1;

        // Printing values after reinitialization
        System.out.println("After Reinitialization:");
        System.out.println("Pi Value: " + piValue);
        System.out.println("Distance to Moon (km): " + distanceToMoon);
        System.out.println("Bank Balance: " + bankBalance);
        System.out.println("Fuel Consumption: " + fuelConsumption);
        System.out.println("Earth Radius (km): " + earthRadius);
    }
}


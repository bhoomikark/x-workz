class LongDatatype
{
public static void main(String[] args)
{
System.out.println("4.long Datatype");
long phoneNo=9740632732L;
long worldPopulation=28748748L;
long maizeNo=2373788L;
long waterVolume=1562327832L;
long distancetoSun=2373789921L;
// Printing values before reinitialization
        System.out.println("Before Reinitialization:");
        System.out.println("Phone Number: " + phoneNo);
        System.out.println("World Population: " + worldPopulation);
        System.out.println("Maize Number: " + maizeNo);
        System.out.println("Water Volume: " + waterVolume);
        System.out.println("Distance to Sun: " + distancetoSun);

// Variable reinitialization
        phoneNo = 9876543210L;
        worldPopulation = 8000000000L;
        maizeNo = 4500000L;
        waterVolume = 2000000000L;
        distancetoSun = 150000000L;

// Printing values after reinitialization
        System.out.println("After Reinitialization:");
        System.out.println("Phone Number: " + phoneNo);
        System.out.println("World Population: " + worldPopulation);
        System.out.println("Maize Number: " + maizeNo);
        System.out.println("Water Volume: " + waterVolume);
        System.out.println("Distance to Sun: " + distancetoSun);
}
}
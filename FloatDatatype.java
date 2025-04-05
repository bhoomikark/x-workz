class FloatDatatype
{
public static void main(String[] args)
{
System.out.println("6. Float Datatype");
float height=12.40f;
float area=20.0f;
float oilInMl=250.0f;
float milkInLiters=1.0f;
float length=14.50f;
// Printing values before reinitialization
        System.out.println("Before Reinitialization:");
        System.out.println("Height: " + height);
        System.out.println("Area: " + area);
        System.out.println("Oil in mL: " + oilInMl);
        System.out.println("Milk in Liters: " + milkInLiters);
        System.out.println("Length: " + length);

        // Variable reinitialization
        height = 15.75f;
        area = 35.5f;
        oilInMl = 500.0f;
        milkInLiters = 2.0f;
        length = 20.25f;

        // Printing values after reinitialization
        System.out.println("After Reinitialization:");
        System.out.println("Height: " + height);
        System.out.println("Area: " + area);
        System.out.println("Oil in mL: " + oilInMl);
        System.out.println("Milk in Liters: " + milkInLiters);
        System.out.println("Length: " + length);
}
}
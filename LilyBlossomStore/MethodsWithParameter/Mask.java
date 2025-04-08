class Mask
{
static void available(int No)
{
 System.out.println("Total masks available: " + No);
}
static void MaskType(String Name)
{
	 System.out.println("Mask Type: " + Name);
}
static void Fit(boolean tightOrLoose)
{
System.out.println("Is mask tight or loose");
System.out.println(tightOrLoose);
}
static void wearMask(String size,String color)
{
	System.out.println("Size is"+size+"color is"+color);
}
static void removeMask(boolean isReusable,String material)
{
	System.out.println("is it reusable or not");
	System.out.println(isReusable);
	System.out.println("material used: "+material);
}
static void washMask(int washTemp,String detergentType,boolean isHandWash)
{
	 System.out.println("Washing mask at " + washTemp + "°C using " + detergentType + ".");
        System.out.println("Is it hand wash?");
        System.out.println(isHandWash);
}
static void adjustMask(String strapType,boolean hasNoseClip,int tightnessLevel)
{
	System.out.println("Adjusting mask with " + strapType + " straps.");
        System.out.println("Does it have a nose clip?");
        System.out.println(hasNoseClip);
        System.out.println("Tightness level: " + tightnessLevel + "/10");
}
}
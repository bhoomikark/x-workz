class TubeLight
{
static void turn_on(boolean YesorNo)
{
	System.out.println("To check tube light is turned ON or Not");
	System.out.println(YesorNo);
}
static void turn_off(boolean TrueorFalse)
{
	System.out.println("To check tube light is turned ON or Not");
	System.out.println(TrueorFalse);
}
static void BrandName(String Name)
{
	System.out.println("Tube light brand");
	System.out.println(Name);
	
}
static void MaterialsUsed(String[] Names,int NoofWire,boolean GoodConductororNot)
{
	System.out.println("To check materials used , name of material,no of wires, good conductor or not");
	for(String index: Names)
	{
		System.out.println("-"+index);
	}
	System.out.println(NoofWire);
	System.out.println(GoodConductororNot);
}
static void AdjustBrightness(boolean MediumorLow,int VolumeAdjust,String ColourofLight)
{
	System.out.println("To adjust brightness");
	System.out.println(MediumorLow);
	System.out.println(VolumeAdjust);
	System.out.println(ColourofLight);
}
static void set_Timer(int duration,String mode)
{
	System.out.println("To set timer");
	System.out.println(duration);
	System.out.println(mode);

}
static void set(float duration,boolean trueorAutoOff)
{
	System.out.println("to set duration and see auto off available");
	System.out.println(duration);
	System.out.println(trueorAutoOff);

}
}
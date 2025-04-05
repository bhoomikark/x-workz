class Lipstickk
{
static void Apply()
{
System.out.println("Running apply in lipstickk");
Remove();
System.out.println("Above function is invoked from the other static method of same class");
}
static void Remove()
{
System.out.println("Running remove in lipstickk");
Perfume.Display();
}
static void check_shade()
{
System.out.println("Running shade in lipstickk");
list_available_shades();
System.out.println("To check different shades");
}
static void list_available_shades()
{
System.out.println("The available shades are pink, nude, berry");
Perfume.list_available_shades();
}
}
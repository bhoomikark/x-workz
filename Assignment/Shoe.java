class Shoe
{
static void wear()
{
System.out.println("wear running in shoe class");
remove();
}
static void remove()
{
System.out.println("remove running in shoe");
wear();
}
static void tear()
{
System.out.println("use tear in shoe");
Sox.wear1();

}
static void fix()
{
System.out.println("running fix in shoe");
Sox.tear1();

}
}
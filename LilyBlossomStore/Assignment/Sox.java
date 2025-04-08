class Sox
{
static void wear1()
{
System.out.println("wear running in sox class");
remove1();
}
static void remove1()
{
System.out.println("remove running in sox");
wear1();
}
static void tear1()
{
System.out.println("use tear in sox");
Shoe.wear();


}
static void fix1()
{
System.out.println("running fix in sox");
Shoe.remove();

}
}
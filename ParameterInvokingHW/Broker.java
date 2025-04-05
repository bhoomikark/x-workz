class Broker
{
static void brokerage(String vegetable,int quantity){
System.out.println("Running brokerage in broker");
System.out.println(vegetable);
System.out.println(quantity);
Farmer.farm(vegetable,quantity);
}
}
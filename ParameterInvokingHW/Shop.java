class Shop
{
static void sell(String vegetable,int quantity){
System.out.println("Running sell in shop");
System.out.println(vegetable);
System.out.println(quantity);
Broker.brokerage(vegetable,quantity);
}
}
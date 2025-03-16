class Customer
{
static void buy(String vegetable1,int quantity1){
System.out.println("Running buy in customer");
System.out.println(vegetable1);
System.out.println(quantity1);
Shop.sell(vegetable1,quantity1);
}
}
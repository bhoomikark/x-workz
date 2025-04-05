class PostRunner
{
public static void main(String[] args)
{
System.out.println("Running main method from post runner");
String customer1="Rahul";
String address1="Bengaluru";
AreaPostOffice.deliver(customer1,address1);
String customer2="Anuv";
String address2="Shimoga";
AreaPostOffice.deliver(customer2,address2);

}
}
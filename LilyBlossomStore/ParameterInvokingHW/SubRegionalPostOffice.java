class SubRegionalPostOffice{
static void deliver(String customername,String address)
{
System.out.println("Running deliver in SubRegionalPostOffice");
System.out.println(customername);
System.out.println(address);
RegionalPostOffice.deliver(customername,address);

}
}
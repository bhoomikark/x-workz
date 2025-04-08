class AreaPostOffice{
static void deliver(String customername,String address)
{
System.out.println("Running deliver in SubRegionalPostOffice");
System.out.println(customername);
System.out.println(address);
SubRegionalPostOffice.deliver(customername,address);

}
}
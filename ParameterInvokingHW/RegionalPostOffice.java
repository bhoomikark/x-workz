class RegionalPostOffice{
static void deliver(String customername,String address)
{
System.out.println("Running deliver in RegionalPostOffice");
System.out.println(customername);
System.out.println(address);
PostHeadMaster.CustomerDetails1(customername,address);

}
}
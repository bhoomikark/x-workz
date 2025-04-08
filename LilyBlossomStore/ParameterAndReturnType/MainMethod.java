class MainMethod
{
public static void main(String[] args)
{
System.out.println("                                METHOD 1                       ");
System.out.println("==============================================================");
System.out.println("Running nameOfPerson method of ParameterAndReturnType Class");
long mobileNo=9732358154L;
String name1=ParameterAndReturnType.nameOfPerson(mobileNo);
System.out.println(name1);
String name2=ParameterAndReturnType.nameOfPerson(9732358654L);
System.out.println(name2);
String name3=ParameterAndReturnType.nameOfPerson(9732358254L);
System.out.println(name3);
String name4=ParameterAndReturnType.nameOfPerson(93235825455L);
System.out.println(name4);
System.out.println("==============================================================");
System.out.println("                                    METHOD 2                        ");
System.out.println("==============================================================");
System.out.println("Running ownerName of ParameterAndReturnType Class");
String companyName="Accenture";
String ownerName1=ParameterAndReturnType.ownerName(companyName);
System.out.println(ownerName1);
String ownerName2=ParameterAndReturnType.ownerName("Apple");
System.out.println(ownerName2);
String ownerName3=ParameterAndReturnType.ownerName("Unisys");
System.out.println(ownerName3);
System.out.println("==============================================================");


System.out.println("                                    METHOD 3                         ");
System.out.println("==============================================================");
System.out.println("Running Price of ParameterAndReturnType Class");
String foodItem="Momos";
int price1=ParameterAndReturnType.price(foodItem);
System.out.println("The Price is "+price1);
int price2=ParameterAndReturnType.price("Pasta");
System.out.println("The Price is "+price2);
int price3=ParameterAndReturnType.price("Coffee");
System.out.println("The Price is "+price3);




System.out.println("                                    METHOD 4                      ");
System.out.println("==============================================================");
System.out.println("Running Balance of ParameterAndReturnType Class");
long accNo=123456789034L;
int balance1=ParameterAndReturnType.balance(accNo);
System.out.println(balance1);
int balance2=ParameterAndReturnType.balance(445566778899L);
System.out.println(balance2);
int balance3=ParameterAndReturnType.balance(445566778883L);
System.out.println(balance3);
System.out.println("==============================================================");

System.out.println("                                    METHOD 5                     ");
     System.out.println("==============================================================");
     System.out.println("Running getPriceBySource Method");

     String source1 = "Bangalore";
     int amount1 = ParameterAndReturnType.getPriceBySource(source1);
     System.out.println(amount1 );

     String source2 = "Delhi";
     int amount2 = ParameterAndReturnType.getPriceBySource(source2);
     System.out.println(amount2);

     String source3 = "Mumbai";
     int amount3 = ParameterAndReturnType.getPriceBySource(source3);
     System.out.println(amount3);

     String source4 = "UnknownCity";
     int amount4 = ParameterAndReturnType.getPriceBySource(source4);
     System.out.println(amount4);

     System.out.println("==============================================================");
	 System.out.println("                                    METHOD 6                     ");
     System.out.println("==============================================================");
     System.out.println("Running alive Method");

     boolean thing1=ParameterAndReturnType.Alive("Rock");
	 System.out.println(thing1);
	 boolean thing2=ParameterAndReturnType.Alive("pillow");
	 System.out.println(thing2);
     System.out.println("==============================================================");
	 
		
    }
}

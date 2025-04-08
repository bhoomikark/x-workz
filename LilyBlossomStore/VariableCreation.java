class VariableCreation{
public static void main(String[] args)
{
System.out.println("1.byte datatype");
//variable declaration and intializtion
byte doorNo=10;
byte liftNo=4;
byte tokenNo=30; 
byte roomNo=5 ; 
byte siteNo=50;
System.out.println("Before Reinitialization:");
System.out.println("Door No: " + doorNo);
System.out.println("Lift No: " + liftNo);
System.out.println("Token No: " + tokenNo);
System.out.println("Room No: " + roomNo);
System.out.println("Site No: " + siteNo);
//variable reinitialization
doorNo=40;
liftNo=7;
tokenNo=40; 
roomNo=50; 
siteNo=74;
System.out.println("After Reinitialization:");
System.out.println("Door No: " + doorNo);
System.out.println("Lift No: " + liftNo);
System.out.println("Token No: " + tokenNo);
System.out.println("Room No: " + roomNo);
System.out.println("Site No: " + siteNo);


}
}

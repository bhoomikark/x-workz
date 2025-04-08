class IntDataType
{
public static void main(String[] args)
{
System.out.println("3.integer Datatype");
//variable declaration and intialization
int age=21;
int keyNo=4;
int employeeID=123456;
int cityPopulation=80000;
int totalvotes=167898;
// Printing values before reinitialization
System.out.println("Before Reinitialization:");
System.out.println("Age: " + age);
System.out.println("Key Number: " + keyNo);
System.out.println("Employee ID: " + employeeID);
System.out.println("City Population: " + cityPopulation);
System.out.println("Total Votes: " + totalVotes);

        // Variable reinitialization
age = 25;
keyNo = 7;
employeeID = 987654;
cityPopulation = 100000;
totalVotes = 200000;

        // Printing values after reinitialization
System.out.println("After Reinitialization:");
System.out.println("Age: " + age);
System.out.println("Key Number: " + keyNo);
System.out.println("Employee ID: " + employeeID);
System.out.println("City Population: " + cityPopulation);
System.out.println("Total Votes: " + totalVotes);
}
import java.util.*;
class Sum
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	
System.out.println("Enter any number: ");
int number=sc.nextInt();
if(number>0)
{
System.out.println("positive");
}
else
{
System.out.println("negative");
}
sc.close();
}
}
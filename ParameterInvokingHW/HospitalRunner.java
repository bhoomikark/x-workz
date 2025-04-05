class HospitalRunner
{
public static void main(String[] args)
{
System.out.println("HospitalRunner class");
String patientname="Rahul";
int age=12;
long mobile=6272812981L;
String email="bhoomika@gmail.com";
String sickness="cold";
Hospital.checkup(patientname,age,mobile,email,sickness);
}
}
class Hospital
{
static void checkup(String patientname,int age,long mobile,String email,String sickness)
{
System.out.println("running checkup from hospital");
System.out.println(patientname);
System.out.println(age);
System.out.println(mobile);
System.out.println(email);
System.out.println(sickness);

Doctor.treatment(patientname,age);
}

}
class Shortdatatype
{
public static void main(String[] args)
{
System.out.println("2.short datatype");
//variable declaration and intializtion
short CarNo=1450;
short BikeNo=1670;
short RoomNo=1234;
short PatientFileNo=123;
short StudentId=1234;
System.out.println("Before Reinitialization:");
System.out.println("Car No: " + carNo);
System.out.println("Bike No: " + bikeNo);
System.out.println("Room No: " + roomNoShort);
System.out.println("Patient File No: " + patientFileNo);
System.out.println("Student ID: " + studentId);
CarNo=1680;
BikeNo=1900;
RoomNo=6789;
PatientFileNo=8970;
StudentId=8769;
System.out.println("After Reinitialization:");
System.out.println("Car No: " + carNo);
System.out.println("Bike No: " + bikeNo);
System.out.println("Room No: " + roomNoShort);
System.out.println("Patient File No: " + patientFileNo);
System.out.println("Student ID: " + studentId);
}
}
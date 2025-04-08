class MethodCalling
{
static void doWork()
{
System.out.println("do work");

}
static void did()
{
System.out.println("did work");
}

}
class AnotherMethod
{
static void call()
{
MethodCalling.doWork();
}
}
public class CallingMethods1 {
    public static void main(String[] args) {
	AnotherMethod.call();
	}}
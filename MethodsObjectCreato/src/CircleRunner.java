public class CircleRunner {
    public static void main(String[] args) {
        System.out.println("**************************************");
        System.out.println("The area of circle without Parameter");
        CircleWoParameter c=new CircleWoParameter();
        c.area();

        System.out.println("***********************************");
        System.out.println("The area of circle with paramter");
        CircleWithParameter c1=new CircleWithParameter();
        c1.area(10.0);

        System.out.println("***********************************");
        System.out.println("The area of circle with return type");
        CircleWithReturnType c2=new CircleWithReturnType();
        double result2=c2.area();
        System.out.println("The are of circle is: "+result2);
    }

}

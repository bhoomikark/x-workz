public class Ellipse {
    static double area_of_ellipse()
    {
        double a=10.0;
        double b=10.0;
        double pi=3.14;
        double result=pi*a*b;
        return result;
    }

    public static void main(String[] args) {
        double result2=area_of_ellipse();
        System.out.println("Area of ellipse is: "+result2);
    }
}

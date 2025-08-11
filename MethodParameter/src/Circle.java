public class Circle {
    static double area_of_circle() {
        double pi=3.14;
        double r=14.0;
        double result = pi * r * r;
        return result;
    }

    public static void main(String[] args) {
        double result2=area_of_circle();
        System.out.println("Area of circle is: "+result2);
    }
}

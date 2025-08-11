public class Trapezoid {
    static double area_of_trapezoid() {
        double a = 10.0;
        double b = 10.0;
        double h = 10.0;
        double result=0.5*(a+b)*h;
        return result;
    }

    public static void main(String[] args) {
        double result1=area_of_trapezoid();
        System.out.println("area of trapezoid: "+result1);
    }

}

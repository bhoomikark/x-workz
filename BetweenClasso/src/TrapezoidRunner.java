public class TrapezoidRunner {
    public static void main(String[] args) {
        Trapezoid.area_of_trapezoid();
        Trapezoid.area_with_two(10, 20, 15);
        System.out.println("************************");
        double x = Trapezoid.area_with_return();
        System.out.println("Area of Trapezoid is: " + x);
    }
}
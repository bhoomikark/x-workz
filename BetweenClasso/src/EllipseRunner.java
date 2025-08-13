public class EllipseRunner {
    public static void main(String[] args) {
        Ellipse.area_of_ellipse();
        Ellipse.area_with_two(3, 6);
        System.out.println("************************");
        double x = Ellipse.area_with_return();
        System.out.println("Area of Ellipse is: " + x);
    }
}
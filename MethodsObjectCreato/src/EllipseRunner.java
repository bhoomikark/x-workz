public class EllipseRunner {
    public static void main(String[] args) {
        System.out.println("***********************************");
        System.out.println("Ellipse without parameter:");
        new EllipseWoParameter().area();

        System.out.println("Ellipse with parameter:");
        new EllipseWithParameter().area(5.0, 3.0);

        System.out.println("Ellipse with return type:");
        double result = new EllipseWithReturnType().area();
        System.out.println("The area of Ellipse is: " + result);
    }
}

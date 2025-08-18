public class TrapezoidRunner {
    public static void main(String[] args) {
        System.out.println("***********************************");
        System.out.println("Trapezoid without parameter:");
        new TrapezoidWoParameter().area();

        System.out.println("Trapezoid with parameter:");
        new TrapezoidWithParameter().area(8.0, 6.0, 4.0);

        System.out.println("Trapezoid with return type:");
        double result = new TrapezoidWithReturnType().area();
        System.out.println("The area of Trapezoid is: " + result);
    }
}

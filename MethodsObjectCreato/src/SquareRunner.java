public class SquareRunner {
    public static void main(String[] args) {
        System.out.println("***********************************");
        System.out.println("Square without parameter:");
        new SquareWoParameter().area();

        System.out.println("Square with parameter:");
        new SquareWithParameter().area(6.0);

        System.out.println("Square with return type:");
        double result = new SquareWithReturnType().area();
        System.out.println("The area of Square is: " + result);
    }
}

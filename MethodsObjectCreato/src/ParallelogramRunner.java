public class ParallelogramRunner {
    public static void main(String[] args) {
        System.out.println("***********************************");
        System.out.println("Parallelogram without parameter:");
        new ParallelogramWoParameter().area();

        System.out.println("Parallelogram with parameter:");
        new ParallelogramWithParameter().area(10.0, 7.0);

        System.out.println("Parallelogram with return type:");
        double result = new ParallelogramWithReturnType().area();
        System.out.println("The area of Parallelogram is: " + result);
    }
}

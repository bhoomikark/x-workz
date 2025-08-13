public class ParallelogramRunner {
    public static void main(String[] args) {
        Parallelogram.area_of_parallelogram();
        Parallelogram.area_with_two(10, 20);
        System.out.println("************************");
        double x = Parallelogram.area_with_return();
        System.out.println("Area of Parallelogram is: " + x);
    }}
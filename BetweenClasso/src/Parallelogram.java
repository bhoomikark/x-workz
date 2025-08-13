public class Parallelogram {
    static void area_of_parallelogram() {
        System.out.println("**************************************");
        System.out.println("Static method between the classes");
        int b = 20, h = 30;
        double area = b * h;
        System.out.println("Area of Parallelogram is: " + area);
        System.out.println("**************************************");
    }

    static void area_with_two(int b, int h) {
        System.out.println("**************************************");
        System.out.println("Method with parameter between classes");
        double result = b * h;
        System.out.println("Area of Parallelogram is: " + result);
        System.out.println("**************************************");
    }

    static double area_with_return() {
        System.out.println("**************************************");
        System.out.println("Static method between the classes with return type");
        int b = 20, h = 30;
        double result = b * h;
        return result;
    }
}
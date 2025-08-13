public class Circle {
    static void area_of_circle() {
        System.out.println("**************************************");
        System.out.println("Static method between the classes");
        int r = 10;
        double area = Math.PI * r * r;
        System.out.println("Area of Circle is: " + area);
        System.out.println("**************************************");
    }

    static void area_with_two(int r) {
        System.out.println("**************************************");
        System.out.println("Method with parameter between classes");
        double result = Math.PI * r * r;
        System.out.println("Area of Circle is: " + result);
        System.out.println("**************************************");
    }

    static double area_with_return() {
        System.out.println("**************************************");
        System.out.println("Static method between the classes with return type");
        int r = 10;
        double result = Math.PI * r * r;
        return result;
    }
}

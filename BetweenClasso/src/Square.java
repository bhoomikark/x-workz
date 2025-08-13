public class Square {
    static void area_of_square() {
        System.out.println("**************************************");
        System.out.println("Static method between the classes");
        int a = 10;
        double area = a * a;
        System.out.println("Area of Square is: " + area);
        System.out.println("**************************************");
    }

    static void area_with_two(int a) {
        System.out.println("**************************************");
        System.out.println("Method with parameter between classes");
        double result = a * a;
        System.out.println("Area of Square is: " + result);
        System.out.println("**************************************");
    }

    static double area_with_return() {
        System.out.println("**************************************");
        System.out.println("Static method between the classes with return type");
        int a = 10;
        double result = a * a;
        return result;
    }
}


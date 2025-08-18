public class RectangleRunner {
    public static void main(String[] args) {
        System.out.println("***********************************");
        System.out.println("Rectangle without parameter:");
        new RectangleWoParameter().area();

        System.out.println("Rectangle with parameter:");
        new RectangleWithParameter().area(10.0, 5.0);

        System.out.println("Rectangle with return type:");
        double result = new RectangleWithReturnType().area();
        System.out.println("The area of Rectangle is: " + result);
    }
}

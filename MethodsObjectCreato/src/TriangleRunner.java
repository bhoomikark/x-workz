public class TriangleRunner {
    public static void main(String[] args) {
        System.out.println("**************************************");
        System.out.println("The area of Triangle without Parameter");
        TriangleWoParameter t = new TriangleWoParameter();
        t.area();

        System.out.println("***********************************");
        System.out.println("The area of Triangle with Parameter");
        TriangleWithParameter t1 = new TriangleWithParameter();
        t1.area(10.0, 20.0);

        System.out.println("***********************************");
        System.out.println("The area of Triangle with Return Type");
        TriangleWithReturnType t2 = new TriangleWithReturnType();
        double result2 = t2.area();
        System.out.println("The area of Triangle is: " + result2);
    }
}

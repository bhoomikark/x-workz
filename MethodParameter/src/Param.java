public class Param {
    static void area_of_triangle(int b,int h)
    {
        double result=0.5*b*h;
        System.out.println("area of triangle is: "+result);
    }
    static void area_of_rectangle(double width,double height)
    {
        double result=0.5*width*height;
        System.out.println("area of rectangle is: "+result);
    }
    static void area_of_trapezoid(double a ,double h , double b)
    {
        double result=0.5*(a+b)*h;
        System.out.println("area of trapezoid: "+result);
    }
    static void area_of_ellipse(double a,double b)
    {
        double pi=3.14;
        double result=pi*a*b;
        System.out.println("area of ellipse: "+result);
    }
    static void area_of_square(int a)
    {
        int result=a*a;
        System.out.println("area of square is: "+result);
    }
    static void area_of_para(int b,int h)
    {
        int result=b*h;
        System.out.println("Area of parallelogram: "+result);
    }
    static void area_of_circle(int r)
    {
        double pi=3.14;
        double result=pi*r*r;
        System.out.println("Area of circle is: "+result);
    }
    static void area_of_sector(double r,double t){
        double result=0.5*r*t;
        System.out.println("Area of sector is: "+result);
    }
    public static void main(String[] args) {
area_of_circle(20);
area_of_ellipse(20.0,40.0);
area_of_sector(30.0,10.0);
area_of_para(20,30);
area_of_square(30);
area_of_trapezoid(10.0,10.0,10.0);
area_of_triangle(20,30);
area_of_para(20,30);

    }
}

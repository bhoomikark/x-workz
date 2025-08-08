public class Logics {
    static void check_number()
    {
        int number=20;
        if(number>0)
        {
            System.out.println("positive");
        }
        else if(number<0)
        {
            System.out.println("negative");
        }
        else {
            System.out.println("zero");
        }


    }
    static void check_even_or_odd()
    {
        int number=20;
        if(number%2==0)
        {
            System.out.println("It is even number: "+number);
        }
        else {
            System.out.println("It is not even number");
        }
    }
    static void check_largest()
    {
        int a=10;
        int b=30;
        if(a>b)
        {
            System.out.println("a is largest");
        }
        else {
            System.out.println("b is largest");
        }
    }
    static void check_divisible()
    {
        int number=55;
        if(number%5==0 && number%11==0)
        {
            System.out.println("number is divisible by 5 and 11 "+number);
        }
        else
        {
            System.out.println("number is not divisible by 5 and 11");
        }
    }
    static void check_largest3()
    {
        int a=10;
        int b=30;
        int c=40;
        if((a>b) && (a>c))
        {
            System.out.println("a is largest");
        }
        else if(b>c){
            System.out.println("b is largest");
        }
        else {
            System.out.println("c is largest");
        }
    }
    static void multiple_of_three()
    {
        int number=6;
        if(number%3==0)
        {
            System.out.println("Number is multiple of 3 "+number);
        }
        else {
            System.out.println("number is not multiple of 3");
        }
    }
    static void voting()
    {
        int age=19;
        if(age>=18)
        {
            System.out.println("He is eligible to vote");
        }
        else {
            System.out.println("Not Eligible to vote");
        }
    }
    static void grade()
    {
        int a=96;
        if(a>=90)
        {
            System.out.println("Grade A "+a);
        }
        else if (a>=80){
            System.out.println("Grade B "+a);
        }
        else{
            System.out.println("Grade C "+a);
        }
    }
    static void check_three_digit()
    {
        int number=123;
        if(number>=100&& number<=999)
        {
            System.out.println("Number is 3 digit number "+number);
        }
        else {
            System.out.println("Number is not 3 digit");
        }
    }
    static void check_positive_even()
    {
        int number=20;
        if((number>=0)&&(number%2==0))
        {
            System.out.println("It is positive and even "+number);
        }
        else
        {
            System.out.println("not positive and even");
        }
    }
    static void check_age()
    {
        int a=65;
        if(a>=60)
        {
            System.out.println("Person is senior citizen "+a);
        }
        else {
            System.out.println("Person is not senior citizen");
        }

    }

    public static void main(String[] args) {
        check_number();
        check_even_or_odd();
        check_largest();
        check_divisible();
        check_largest3();
        multiple_of_three();
        voting();
        grade();
        check_three_digit();
        check_positive_even();
        check_age();
    }

}

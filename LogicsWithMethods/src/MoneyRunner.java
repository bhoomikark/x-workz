public class MoneyRunner {
    public static void main(String[] args) {
        int x=new Money().deposit(100000,95000);
        System.out.println("The remaining amount left is: "+x);
    }
}

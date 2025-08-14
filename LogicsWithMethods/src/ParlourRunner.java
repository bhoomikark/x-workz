public class ParlourRunner {
    public static void main(String[] args) {
        int balance = new Parlour().remainingAmount(2000, 1999);
        System.out.println("The remaining amount left is: " + balance);
    }
}

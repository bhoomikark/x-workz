public class DoubleArrayWithNew {
    public static void main(String[] args) {
        double[] arr = new double[3];
        arr[0] = 100.25;
        arr[1] = 200.75;
        arr[2] = 300.50;

        System.out.println("----------------------------------");
        System.out.println("It is the double type of data with new Keyword");
        System.out.println("*****************************");
        System.out.println("index \t array");
        System.out.println("*****************************");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "\t" + arr[i]);
        }
    }
}
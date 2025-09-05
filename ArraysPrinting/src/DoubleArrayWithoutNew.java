public class DoubleArrayWithoutNew {
    public static void main(String[] args) {
        double[] arr = {100.25, 200.75, 300.50};

        System.out.println("----------------------------------");
        System.out.println("It is the double type of data without new Keyword");
        System.out.println("*****************************");
        System.out.println("index \t array");
        System.out.println("*****************************");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "\t" + arr[i]);
        }
    }
}
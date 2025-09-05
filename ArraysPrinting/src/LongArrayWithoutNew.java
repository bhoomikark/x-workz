public class LongArrayWithoutNew {
    public static void main(String[] args) {
        long[] arr = {10000L, 20000L, 30000L};

        System.out.println("----------------------------------");
        System.out.println("It is the long type of data without new Keyword");
        System.out.println("*****************************");
        System.out.println("index \t array");
        System.out.println("*****************************");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "\t" + arr[i]);
        }
    }
}
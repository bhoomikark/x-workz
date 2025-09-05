public class LongArrayWithNew {
    public static void main(String[] args) {
        long[] arr = new long[3];
        arr[0] = 10000L;
        arr[1] = 20000L;
        arr[2] = 30000L;

        System.out.println("----------------------------------");
        System.out.println("It is the long type of data with new Keyword");
        System.out.println("*****************************");
        System.out.println("index \t array");
        System.out.println("*****************************");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "\t" + arr[i]);
        }
    }
}

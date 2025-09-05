public class ShortArrayWithoutNew {
    public static void main(String[] args) {
        short[] arr = {100, 200, 300};

        System.out.println("----------------------------------");
        System.out.println("It is the short type of data without new Keyword");
        System.out.println("*****************************");
        System.out.println("index \t array");
        System.out.println("*****************************");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "\t" + arr[i]);
        }
    }
}
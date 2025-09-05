public class IntegerArrayWithoutNew {
    public static void main(String[] args) {
        int[] arr = {1000, 2000, 3000};

        System.out.println("----------------------------------");
        System.out.println("It is the int type of data without new Keyword");
        System.out.println("*****************************");
        System.out.println("index \t array");
        System.out.println("*****************************");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "\t" + arr[i]);
        }
    }
}
public class BooleanArrayWithoutNew {
    public static void main(String[] args) {
        boolean[] arr = {true, false, true};

        System.out.println("----------------------------------");
        System.out.println("It is the boolean type of data without new Keyword");
        System.out.println("*****************************");
        System.out.println("index \t array");
        System.out.println("*****************************");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "\t" + arr[i]);
        }
    }
}

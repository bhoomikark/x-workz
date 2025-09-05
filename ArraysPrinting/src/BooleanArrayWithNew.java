public class BooleanArrayWithNew {
    public static void main(String[] args) {
        boolean[] arr = new boolean[3];
        arr[0] = true;
        arr[1] = false;
        arr[2] = true;

        System.out.println("----------------------------------");
        System.out.println("It is the boolean type of data with new Keyword");
        System.out.println("*****************************");
        System.out.println("index \t array");
        System.out.println("*****************************");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "\t" + arr[i]);
        }
    }
}
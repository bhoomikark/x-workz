public class IntegerArrayWithNew {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1000;
        arr[1] = 2000;
        arr[2] = 3000;

        System.out.println("----------------------------------");
        System.out.println("It is the int type of data with new Keyword");
        System.out.println("*****************************");
        System.out.println("index \t array");
        System.out.println("*****************************");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "\t" + arr[i]);
        }
    }
}
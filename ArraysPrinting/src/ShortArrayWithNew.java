public class ShortArrayWithNew {
    public static void main(String[] args) {
        short[] arr = new short[3];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;

        System.out.println("----------------------------------");
        System.out.println("It is the short type of data with new Keyword");
        System.out.println("*****************************");
        System.out.println("index \t array");
        System.out.println("*****************************");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "\t" + arr[i]);
        }
    }
    }